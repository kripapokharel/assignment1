package utils;

/**
 * Created by usa on 7/6/2016.
 */
public interface IStack<T> {
    public T top();

    public T pop();

    public void push(T element);

    public boolean isEmpty();

}
