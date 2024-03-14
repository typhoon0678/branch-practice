package org.example;

import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // ToDo: 로그인, 회원가입

        // ToDo: 1ms 마다 1씩 증가

        // ToDo: 높은 순위 검색

        Ranking ranking = new Ranking();

        User[] rankingList = ranking.getRanking();
        for (int i=0; i<3; i++) {
            System.out.print(rankingList[i].id);
            System.out.println(rankingList[i].score);
        }

    }
}