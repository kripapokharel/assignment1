package Model;

import java.util.ArrayList;

/**
 * Created by kp26842 on 6/30/2016.
 */
public class UserDB {
    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<User> getPassword() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserDB.users = users;
    }
}
