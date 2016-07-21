package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.LinkedListOrderedList;

/**
 * Created by usa on 7/16/2016.
 */
public class LinkedListOrderedListTest {
    LinkedListOrderedList<String> orderedList = new LinkedListOrderedList<>();

    @Test
    public void add() throws Exception {
        orderedList.add("PAN");
        System.out.println(orderedList);
        orderedList.add("MAN");
        orderedList.add("TAN");
        orderedList.add("SAN");
        System.out.println(orderedList);


    }

    @Test
    public void contains() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void reset() throws Exception {

    }

    @Test
    public void getNext() throws Exception {

    }


}