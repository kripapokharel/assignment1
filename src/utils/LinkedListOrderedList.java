package utils;

/**
 * Created by usa on 7/8/2016.
 */
public class LinkedListOrderedList<T> implements IList<T> {
    protected LinkedListNode<T> top;
    protected int index = 0;
    protected boolean found;
    int numOfElements = 0;
    private LinkedListNode<T> currentPos; //Points to the last added element in the list
    private LinkedListNode<T> location;
    private LinkedListNode<T> previous;

    public LinkedListOrderedList() {
        currentPos = null;
        numOfElements = 0;
        top = null;
    }


    @Override
    public void add(T element) {
        /**
         * Add elements in a list*/

        T listElement;
        //search insertion point
        location = top;
        previous = null;
        while (location != null) {
            listElement = location.getElement();
            if (((Comparable) listElement).compareTo(element) < 0) {
                previous = location;
                location = location.getPointer();
            } else
                break;

        }


        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        if (previous == null) {
            newNode.setPointer(top);
            top = newNode;
        } else {
            newNode.setPointer(location);
            previous.setPointer(newNode);
            // previous=newNode;
        }
        numOfElements++;
        index = numOfElements - 1;
    }

    @Override
    public boolean contains(T element) {
        location = top;
        boolean found = false;
        while (location != null) {
            if (location.getElement().equals(element)) {
                found = true;
                return found;
            } else {
                previous = location;
                location = location.getPointer();
            }
        }
        return found;
    }

    @Override
    public void remove(T element) {
        if (contains(element)) {
            if (top == location) {
                //removes the first node
                top = top.getPointer();
            } else {
                previous.setPointer(location.getPointer());
            }
            numOfElements--;
            index--;

        }


    }


    @Override
    public boolean isEmpty() {
        return (numOfElements == 0);
    }

    @Override
    public int size() {
        return numOfElements;
    }

    @Override
    public T get(T element) {
        if (contains(element)) {
            return element;
        } else {
            return null;
        }
    }

    @Override
    public void reset() {
        currentPos = top;

    }

    @Override
    public T getNext() {
        T next = currentPos.getElement();
        if (currentPos.getPointer() == null) {
            currentPos = top;
        } else {
            currentPos = currentPos.getPointer();
        }

        return next;
    }

    public String toString() {
        LinkedListNode<T> currentNode = top;
        String list = "";
        while (currentNode != null) {
            list = list + "" + currentNode.getElement() + "\n";
            currentNode = currentNode.getPointer();
        }
        return list;
    }
}

