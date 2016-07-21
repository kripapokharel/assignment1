package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.*;

/**
 * Created by usa on 7/19/2016.
 */
public class ArrayQueueTest {
    ArrayQueue<String> queue1 = new ArrayQueue<String>(5);

    @Test
    public void enqueue() throws Exception {
        queue1.enqueue("SAM");
        queue1.enqueue("MAN");
        queue1.enqueue("PAN");
        queue1.enqueue("VAN");
        System.out.println(queue1);


    }

    @Test
    public void isFull() throws Exception {

    }

    @Test
    public void dequeue() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

}