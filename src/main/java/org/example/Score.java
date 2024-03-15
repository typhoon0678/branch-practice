package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Score {

    LogIn db = new LogIn();
    Scanner scanner = new Scanner(System.in);

    public void addScore(int id) {
        int score = db.getScore(id);
        long start = System.currentTimeMillis();
        System.out.println("\n Press Enter if you want to Quit");

        scanner.nextLine();

        long end = System.currentTimeMillis();

        System.out.print(score + (int) (end - start));

        db.writeScore(id, score + (int) (end - start));

    }
}
