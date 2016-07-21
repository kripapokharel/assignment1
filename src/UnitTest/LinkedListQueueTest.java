package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.LinkedListQueue;

/**
 * Created by usa on 7/19/2016.
 */
public class LinkedListQueueTest {
    LinkedListQueue<String> list = new LinkedListQueue<>();

    @Test
    public void enqueue() throws Exception {
        list.enqueue("Kim");
        list.enqueue("Tim");
        System.out.println(list);

    }

    @Test
    public void dequeue() throws Exception {
        list.enqueue("Kim");
        list.enqueue("Tim");
        list.dequeue();
        System.out.println(list);

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

}