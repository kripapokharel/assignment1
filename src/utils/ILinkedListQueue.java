package utils;

import Exception.OverflowException;

/**
 * Created by usa on 7/13/2016.
 */
public interface ILinkedListQueue<T> extends IQueue<T> {
    void enqueue(T element);
}
