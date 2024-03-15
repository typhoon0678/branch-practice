package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Score {

    static void addScore(int id) {
        Scanner scanner = new Scanner(System.in);

        int score = LogIn.getScore(id);
        long start = System.currentTimeMillis();
        System.out.println("\n Press Enter if you want to Quit");

        scanner.nextLine();

        long end = System.currentTimeMillis();

        System.out.print(score + (int) (end - start));

        LogIn.writeScore(id, score + (int) (end - start));

    }
}
