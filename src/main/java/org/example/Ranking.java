package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Ranking {

    // dummy data
    User[] userTable = new User[10];
    User[] result = new User[3];

    public User[] getRanking() {
        // dummy data
        for (int i=0; i<10; i++) {
            User user = new User();
            user.id = i;
            user.score = (int) Math.floor(Math.random() * 100);
            userTable[i] = user;
        }

        Arrays.sort(userTable, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user2.score - user1.score;
            }
        });

        result = Arrays.copyOfRange(userTable, 0, 3);

        return result;
    }
}
