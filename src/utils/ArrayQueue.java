package utils;

import Exception.OverflowException;
import Exception.UnderflowException;

/**
 * Created by usa on 7/6/2016.
 * @author Kripa
 * CSC 202
 * ArrayQueue class
 */
public class ArrayQueue<T> implements IArrayQueue<T> {
    protected final int DEFCAP = 100;
    protected T[] arrayQueue;
    protected int originalSize;
    protected int numOfElements;
    protected int head = 0;
    protected int tail;


    public ArrayQueue() {
        arrayQueue = (T[]) new Object[DEFCAP];
        tail = DEFCAP - 1;
        numOfElements = 0;
    }

    public ArrayQueue(int size) {
        arrayQueue = (T[]) new Object[size];
        tail = size - 1;
        numOfElements = 0;
    }

    @Override
    public void enqueue(T element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException("Enqueue performend in a full queue");
        } else {
            tail = (tail + 1) % arrayQueue.length;
            arrayQueue[tail] = element;
            numOfElements++;
        }


    }

    @Override
    public boolean isFull() {

        return (numOfElements == arrayQueue.length);
    }

    @Override
    public T dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Deque performed in an empty queue");
        } else {
            T dequeElement = arrayQueue[head];
            arrayQueue[head] = null;
            head = (head + 1) % arrayQueue.length;
            numOfElements--;
            return dequeElement;
        }
    }

    @Override
    public boolean isEmpty() {
        if (numOfElements == 0)
            return true;
        else
            return false;
    }

    @Override
    public int size() {

        return numOfElements;
    }

    public String toString() {
        String list = "";
        for (T value : arrayQueue) {
            list += value + "\n";
        }
        return list;
    }

}
