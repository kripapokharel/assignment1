package utils;

import Exception.IndexOutOfBoundException;

/**
 * Created by usa on 7/8/2016.
 */
public class ArrayIndexedList<T> implements IIndexedList<T> {
    protected final int DEFCAP = 100;
    protected T[] indexedList;
    protected int numOfElements = 0;
    protected int originalSize;
    protected int location;
    protected boolean found;

    public ArrayIndexedList() {
        indexedList = (T[]) new Object[DEFCAP];
        originalSize = DEFCAP;
        numOfElements = 0;
    }

    public ArrayIndexedList(int size) {
        indexedList = (T[]) new Object[size];
        originalSize = size;
        numOfElements = 0;

    }

    @Override
    public void add(int index, T element) throws IndexOutOfBoundException {
        if ((index < 0) || (index > size()))
            throw new IndexOutOfBoundException("Index out of bound exception");
        if (numOfElements == indexedList.length)
            enlarge();
        for (int i = numOfElements; i > index; i--) {
            indexedList[i] = indexedList[i - 1];
        }
        indexedList[index] = element;
        numOfElements++;
    }


    @Override
    public void remove(int index) throws IndexOutOfBoundException {
        if ((index < 0) || (index > size()))
            throw new IndexOutOfBoundException("Index out of range");
        for (int i = index; i < (numOfElements - 1); i++)
            indexedList[i] = indexedList[i + 1];
        indexedList[numOfElements - 1] = null;
        numOfElements--;
    }

    @Override
    public int indexOf(T element) {
        contains(element);
        if (found)
            return location;
        else
            return -1;
    }


    @Override
    public boolean contains(T element) {
        boolean found = false;
        int index = 0;
        while (index < numOfElements) {
            if (indexedList[index].equals(element)) {
                found = true;
            } else {
                index++;
            }
        }
        return found;
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
        return indexedList[location + 1];
    }


    @Override
    public void set(int index, T element) throws IndexOutOfBoundException {
        if ((index < 0) || (index >= size()))
            throw new IndexOutOfBoundException("Index out od bound exception");
        indexedList[index] = element;

    }

    @Override
    public T get(int index) throws IndexOutOfBoundException {
        if ((index < 0) || (index >= size()))
            throw new IndexOutOfBoundException("Index out of bound");
        return indexedList[index];
    }

    private void enlarge() {
        T[] largerList = (T[]) new Object[2 * originalSize];
        for (int i = 0; i < indexedList.length; i++) {
            largerList[i] = indexedList[i];
        }
        indexedList = largerList;
    }

    public String toString() {
        String list = "";
        for (int i = 0; i < numOfElements; i++) {
            list = list + "[" + i + "]" + indexedList[i] + "\n";
        }
        return list;


    }
}

