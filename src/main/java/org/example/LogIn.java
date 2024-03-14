package org.example;

import java.util.ArrayList;

public class LogIn {

    private final ArrayList<User> userTable = new ArrayList<User>();

    public void writeUser() {
        int id = userTable.size() + 1;
        userTable.add(new User(userTable.size() + 1, 0));

        System.out.println("userId : " + id + "\n");
    }

    public ArrayList<User> getUser() {
        return userTable;
    }

    public boolean findUser(int id) {
        for (User user : userTable) {
            if (user.id == id) {
                return true;
            }
        }
        return false;
    }
}
