package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Ranking {

    // dummy data
    LogIn db = new LogIn();
    ArrayList<User> userTable = db.getUser();
    ArrayList<User> result;

    public void getRanking() {

        result = userTable;

        result.sort(Collections.reverseOrder());

        int size = Math.min(result.size(), 3);
        result.subList(0, size);

        for (int i=0; i<size; i++) {
            System.out.println("1st : " + result.get(i).id + " : " + result.get(i).score);
        }
        System.out.println();
    }
}
