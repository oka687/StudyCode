package com.company;

import java.util.*;

public class ScoreBigyo {

    public void studentScore(){
        //선언부
        HashMap<String, Integer> score = new HashMap<String,Integer>();
        int N;          //학생수
        String name;    //학생명
        int sScore;     //점수
        
        // 상황별 스캐너 선언
        Scanner scN = new Scanner(System.in);       //학생수
        Scanner scName = new Scanner(System.in);    //학생명
        Scanner scScore = new Scanner(System.in);   //점수

        System.out.println("학생수 입력");
        N = scN.nextInt();

        for(int i = 0; i < N; i++) {
            System.out.println("학생명 입력");
            name = scName.nextLine();

            System.out.println("점수 입력");
            sScore = scScore.nextInt();

            //맵에 저장
            score.put(name,sScore);
        }

        // Map.Entry를 사용하여 내림차순 정렬
        List<Map.Entry<String,Integer>> scoreList = new LinkedList<>(score.entrySet());
        scoreList.sort(Map.Entry.comparingByValue());

        // 키값 출력
        for(int i = 0; i < score.size(); i++){
            System.out.println(scoreList.get(i).getKey());
        }
    }
}
