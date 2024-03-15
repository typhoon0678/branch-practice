package org.example;

import java.util.ArrayList;

public class LogIn {

    static final ArrayList<User> userTable = new ArrayList<User>();
    ArrayList<User> getUserTable = new ArrayList<User>();

    public void writeUser() {
        int id = userTable.size() + 1;
        userTable.add(new User(id, 0));

        System.out.println("userId : " + id);
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

    public int getScore(int id) {
        for (User user : userTable) {
            if (user.id == id) {
                return user.score;
            }
        }
        return -1;
    }

    public void writeScore(int id, int score) {
        for (int i=0; i<userTable.size(); i++) {
            if (userTable.get(i).id == id) {
                userTable.set(i, new User(id, score));
                System.out.println(" Saved");
            }
        }
    }

}
