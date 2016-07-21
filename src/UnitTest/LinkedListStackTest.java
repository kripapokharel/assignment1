package UnitTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import utils.LinkedListStack;

/**
 * Created by usa on 7/11/2016.
 */
public class LinkedListStackTest {
    LinkedListStack<String> nameStack = new LinkedListStack<String>();
    String expectResult = "Ram\tDavid";
    String expectPopResult = "David";
    int expectSize = 2;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void push() throws Exception {
        nameStack.push("David");
        nameStack.push("Ram");
        //assertEquals("Stack must contain \"Ram\tDavid",expectResult,nameStack);
        System.out.println(nameStack);


    }

    @Test
    public void pop() throws Exception {
        nameStack.push("David");
        nameStack.push("Ram");
        nameStack.pop();
        //assertEquals("Stack must contain \"David", expectPopResult,nameStack.toString());
        System.out.println(nameStack);


    }

    @Test
    public void top() throws Exception {
        // assertEquals("Top must contain \"Ram\", expectedTopResult,(String)nameStack.toString());
//
    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {
        nameStack.push("David");
        nameStack.push("Ram");
        assertEquals("Stack must be 2", expectSize, nameStack.size());


    }

 /*  public static void main(String [] args){
       LinkedListStack<String> nameList=new LinkedListStack<String>();
       nameList.push("Andre");
       nameList.push("Kripa");


   }*/

}