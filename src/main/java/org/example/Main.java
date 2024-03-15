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

        while (!menu.equals("quit")) {
            if (menu.equals("logIn")) {
                System.out.print("1 : SignUp, 2 : SignIn, 3 : Ranking : ");
                int select = scanner.nextInt();

                System.out.println();

                if (select == 1) {
                    System.out.print("Input Id : ");
                    int id = scanner.nextInt();

                    if (logIn.findUser(id)) {
                        // ToDo : score
                        menu = "quit";
                    } else {
                        System.out.println("\nNot found\n");
                        menu = "logIn";
                    }

                } else if (select == 2) {
                    menu = "signIn";
                } else if (select == 3) {
                    menu = "ranking";
                }
            }

            else if (menu.equals("signIn")) {
                logIn.writeUser();
                menu = "logIn";
            }

            else if (menu.equals("ranking")) {
                ranking.getRanking();
                menu = "logIn";
            }

            }
        }

        // ToDo: 1ms 마다 1씩 증가

        // ToDo: 높은 순위 검색

}