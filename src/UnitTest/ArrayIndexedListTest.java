package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.ArrayIndexedList;

/**
 * Created by usa on 7/18/2016.
 */
public class ArrayIndexedListTest {
    ArrayIndexedList<String> indexedList = new ArrayIndexedList<>();

    @Test
    public void add() throws Exception {
        indexedList.add(0, "Ram");
        indexedList.add(1, "Hari");
        indexedList.add(2, "Sita");
        indexedList.add(3, "Rita");
        System.out.println(indexedList);


    }

    @Test
    public void remove() throws Exception {
        indexedList.add(0, "Ram");
        indexedList.add(1, "Hari");
        indexedList.add(2, "Sita");
        indexedList.add(3, "Rita");
        indexedList.remove(2);
        System.out.println(indexedList);


    }

    @Test
    public void indexOf() throws Exception {

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
    public void reset() throws Exception {

    }

    @Test
    public void getNext() throws Exception {

    }

    @Test
    public void set() throws Exception {
        indexedList.add(0, "Ram");
        indexedList.add(1, "Hari");
        indexedList.set(1, "Rita");
        System.out.println(indexedList);

    }

    @Test
    public void get() throws Exception {

    }
/*

    @Test
    public void toString() throws Exception {

    }
*/

}