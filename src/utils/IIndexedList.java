package utils;

import Exception.IndexOutOfBoundException;

/**
 * Created by usa on 7/8/2016.
 */
public interface IIndexedList<T> {

    void add(int index, T element) throws IndexOutOfBoundException;

    void set(int index, T element) throws IndexOutOfBoundException;

    void remove(int index) throws IndexOutOfBoundException;

    int indexOf(T element);

    T get(int index) throws IndexOutOfBoundException;

    boolean contains(T element);

    boolean isEmpty();

    int size();

    void reset();

    T getNext();

    String toString();

}
