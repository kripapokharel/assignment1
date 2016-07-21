package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.ArrayOrderedList;

/**
 * Created by usa on 7/14/2016.
 */
public class ArrayOrderedListTest {
    ArrayOrderedList<String> orderedList = new ArrayOrderedList<String>(5);

    @Test
    public void add() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        System.out.println(orderedList);
        orderedList.add("D");
        System.out.println(orderedList);

    }

    @Test
    public void remove() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        System.out.println(orderedList);
        orderedList.remove("A");
        System.out.println(orderedList);

    }

    @Test
    public void contains() throws Exception {

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

    @Test
    public void getE() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        orderedList.getE(2);

    }


}