package utils;

import Exception.OverflowException;

/**
 * Created by usa on 7/6/2016.
 */
public interface IArrayStack<T> extends IStack<T> {
    boolean isFull();

    void push(T element) throws OverflowException;
}
