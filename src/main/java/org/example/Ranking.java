package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Ranking {

    LogIn db = new LogIn();
    ArrayList<User> result;

    public void getRanking() {

        result = db.getUser();

        result.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user2.score - user1.score;
            }
        });

        int size = Math.min(result.size(), 3);
        result.subList(0, size);

        for (int i=0; i<size; i++) {
            System.out.println((i+1) + ". id: " + result.get(i).id + ", score : " + result.get(i).score);
        }
    }
}
