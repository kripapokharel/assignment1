package utils;

import Exception.OverflowException;
import Exception.UnderflowException;

/**
 * Created by usa on 7/6/2016.
 */
public interface IQueue<T> {


    T dequeue() throws UnderflowException;

    boolean isEmpty();

    int size();
}
