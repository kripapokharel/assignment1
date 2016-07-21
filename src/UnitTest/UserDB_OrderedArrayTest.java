package UnitTest;

import Model.UserDB_OrderedArray;
import org.junit.Test;

import static org.junit.Assert.*;

import utils.ArrayOrderedList;

/**
 * Created by usa on 7/19/2016.
 */
public class UserDB_OrderedArrayTest {
    ArrayOrderedList<String> users = new ArrayOrderedList<String>();
    UserDB_OrderedArray display = new UserDB_OrderedArray();

    @Test
    public void getUsers() throws Exception {
        users.add("Ram");
        users.add("PAM");
        users.add("FAN");
        display.getUsers();

    }

    @Test
    public void getPassword() throws Exception {

    }

    @Test
    public void setUsers() throws Exception {

    }


}