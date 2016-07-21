package utils;

import Exception.UnderflowException;

/**
 * Created by usa on 7/6/2016.
 */
public class LinkedListQueue<T> implements ILinkedListQueue<T> {
    LinkedListNode<T> head;
    LinkedListNode<T> tail;
    int numOfElement = 0;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(T element) {
        /**Add elements and move the tail to new node every time we create one*/
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setPointer(newNode);
            tail = newNode;
        }
        numOfElement++;

    }

    @Override
    public T dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Deque performed in an empty Queue");
        }
        T element = head.getElement();
        if (head == tail) {
            tail = null;
        }
        head = head.getPointer();
        numOfElement--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);

    }

    @Override
    public int size() {
        return numOfElement;
    }

    public String toString() {
        LinkedListNode<T> current = head;
        String list = "";
        while (current != null) {
            list += current.getElement() + "\t";
            current = current.getPointer();
        }
        return list;
    }
}
