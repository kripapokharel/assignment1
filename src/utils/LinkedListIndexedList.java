package utils;

import Exception.IndexOutOfBoundException;

/**
 * Created by usa on 7/8/2016.
 */
public class LinkedListIndexedList<T> implements IIndexedList<T> {

    protected LinkedListNode<T> top;
    protected int index = 0;
    protected boolean found;
    int numOfElements = 0;
    private LinkedListNode<T> currentPos; //Points to the last added element in the list
    private LinkedListNode<T> location;
    private LinkedListNode<T> previous;

    public LinkedListIndexedList() {
        currentPos = null;
        numOfElements = 0;
        top = null;

    }

    @Override
    public void add(int index, T element) throws IndexOutOfBoundException {
        if (index < 0) {
            throw new IndexOutOfBoundException("Index less than 0");
        }
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);

        for (int i = numOfElements; i > index; i++) {
            location = top;
            // location=location.setPointer


        }


    }

    @Override
    public void set(int index, T element) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(T element) {
        return 0;
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
    public void reset() {

    }

    @Override
    public T getNext() {

        T next = currentPos.getElement();
        currentPos = currentPos.getPointer();
        return next;

    }


    @Override
    public boolean contains(T element) {

        boolean found = false;
        int index = 0;
        while (location != null) {
            if (location.getElement().equals(element)) {
                found = true;
                return found;
            } else {
                index++;
                previous = location;
                location = location.getPointer();
            }
        }
        return found;
    }
}
