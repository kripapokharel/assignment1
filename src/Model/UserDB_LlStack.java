package Model;

import utils.LinkedListNode;
import utils.LinkedListStack;

import java.util.ArrayList;


/**
 * Created by usa on 7/8/2016.
 *
 * @author Kripa
 *         7/10/2016
 */
public class UserDB_LlStack {
    private static LinkedListStack<User> users = new LinkedListStack<User>();
    private static User user = new User();

    public static LinkedListStack<User> getUsers() {
        return users;
    }

    public static void setUsers(LinkedListStack<User> users) {
        UserDB_LlStack.users = users;
        users.push(user);

    }

    public static LinkedListStack<User> getPassword() {
        return users;
    }
}


