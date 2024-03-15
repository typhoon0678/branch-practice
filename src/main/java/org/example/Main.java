package org.example;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // ToDo: 로그인, 회원가입

        String menu = "logIn";
        Scanner scanner = new Scanner(System.in);
        LogIn logIn = new LogIn();
        Ranking ranking = new Ranking();
        Score score = new Score();

        while (!menu.equals("quit")) {
            switch (menu) {
                case "logIn" -> {
                    System.out.print("\n1 : SignUp, 2 : SignIn, 3 : Ranking , 4 : Quit : ");
                    int select = scanner.nextInt();

                    System.out.println();

                    if (select == 1) {
                        System.out.print("Input Id : ");
                        int id = scanner.nextInt();

                        if (logIn.findUser(id)) {
                            score.addScore(id);
                            menu = "logIn";
                        } else {
                            System.out.println("\nNot found\n");
                            menu = "logIn";
                        }

                    } else if (select == 2) {
                        menu = "signIn";
                    } else if (select == 3) {
                        menu = "ranking";
                    } else if (select == 4) {
                        menu = "quit";
                    } else {
                        menu = "logIn";
                    }
                }
                case "signIn" -> {
                    logIn.writeUser();
                    menu = "logIn";
                }
                case "ranking" -> {
                    ranking.getRanking();
                    menu = "logIn";
                }
            }

            }
        }

}