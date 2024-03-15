package org.example;

import java.util.ArrayList;

public class LogIn {

    static private final ArrayList<User> userTable = new ArrayList<User>();
    ArrayList<User> getUserTable = new ArrayList<User>();

    static void writeUser() {
        int id = userTable.size() + 1;
        userTable.add(new User(id, 0));

        System.out.println("userId : " + id);
    }

    static ArrayList<User> getUser() {
        return userTable;
    }

    static boolean findUser(int id) {
        for (User user : userTable) {
            if (user.id == id) {
                return true;
            }
        }
        return false;
    }

    static int getScore(int id) {
        for (User user : userTable) {
            if (user.id == id) {
                return user.score;
            }
        }
        return -1;
    }

    static void writeScore(int id, int score) {
        for (int i=0; i<userTable.size(); i++) {
            if (userTable.get(i).id == id) {
                userTable.set(i, new User(id, score));
                System.out.println(" Saved");
            }
        }
    }

}
