package utils;

import Exception.OverflowException;

/**
 * Created by usa on 7/6/2016.
 */
public interface IArrayQueue<T> extends IQueue<T> {
     boolean isFull();

     void enqueue(T element) throws OverflowException;



}
