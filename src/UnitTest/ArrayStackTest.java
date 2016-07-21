package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.ArrayStack;

/**
 * Created by usa on 7/14/2016.
 */
public class ArrayStackTest {
    ArrayStack<String> arrayStack = new ArrayStack<String>(5);

    @Test
    public void isFull() throws Exception {

    }

    @Test
    public void top() throws Exception {

    }

    @Test
    public void pop() throws Exception {
        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.pop();
        System.out.println(arrayStack);


    }

    @Test
    public void push() throws Exception {
        arrayStack.push("Arya");
        arrayStack.push("Ben");
        //  arrayStack.push("Caityln");
        // arrayStack.push("Den");

        System.out.println(arrayStack);

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

}