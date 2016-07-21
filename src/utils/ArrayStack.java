package utils;

import Exception.OverflowException;
import Exception.*;

/**
 * Created by usa on 7/6/2016.
 */
public class ArrayStack<T> implements IArrayStack<T> {
    protected final int DEFCAP = 100;
    protected T[] arrayStack;
    protected int index = -1;
    protected int originalSize;
    protected int numOfElements;


    //default constructor with size 100
    public ArrayStack() {
        arrayStack = (T[]) new Object[DEFCAP];
        numOfElements = 0;

    }

    //constructor with user defined size
    public ArrayStack(int size) {
        arrayStack = (T[]) new Object[size];
        originalSize = size;
        numOfElements = 0;
    }

    @Override
    public boolean isFull() {
        if (index == (arrayStack.length - 1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("top committed in an empty stack");
        } else {
            return arrayStack[index];
        }
    }


    @Override
    public void pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Pop committed in an  empty stack");
        } else {
            arrayStack[index] = null;
            index--;
        }

    }

    @Override
    public void push(T element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException("Push committed in a full stack");
        } else {
            index++;
            arrayStack[index] = element;
        }

    }

    @Override
    public boolean isEmpty() {
        if (arrayStack.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return numOfElements;

    }

    private void enlarge() {
        T[] largerStack = (T[]) new Object[2 * originalSize];
        for (int i = 0; i < arrayStack.length; i++) {
            largerStack[i] = arrayStack[i];
        }
        arrayStack = largerStack;
    }
}
