package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {
    // 맵 리스트 전역변수 선언
    int N = 0;
    int M = 0;
    int count = 0;
    int[][] map;

    //큐 선언
    Queue<Integer> queue= new LinkedList<>();

    public void mazeQuest(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("N의 개수를 입력");
            N = sc.nextInt();

            System.out.println("M의 개수를 입력");
            M = sc.nextInt();

            if (3 > N || M > 200) {
                System.out.println("다시 입력해주세요.");
            } else {
                break;
            }
        }
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                // 랜덤으로 0과 1 선택
                int ran = (int) ((Math.random() * 10000) % 10);

                if(ran <= 5) {
                    // 50% 확률로 1
                    map[i][k] = 1;
                    mapMake(i,k);
                    System.out.print(map[i][k]);
                } else if(ran > 5) {
                    // 50% 확률로 0
                    map[i][k] = 0;
                    mapMake(i,k);
                    System.out.print(map[i][k]);
                }
            }
            System.out.println("");
        }
        questResult();
    }

    public void mapMake(int i, int k){
        if(i == 0 && k == 0){
            map[0][0] = 1;
        }else if(i == N-1 && k == M-1){
            map[N-1][M-1] = 1;
        }
    }

    public void questResult(){
        for(int i = 0; i < N; i++){

            for(int l = 0; l < M; l++){
                bfs(i,l);
            }
        }
        System.out.println("움직인 횟수 : "+map[N - 1][M - 1]);
    }

    public boolean bfs(int n, int m){
        //System.out.println("n : "+n+"     "+"m : "+m);
        if(n < 0 || m < 0 || n > N-1 || m > M-1 || map[n][m] == 0){
            return false;
        }else if(map[n][m] == 1){
            map[n][m] = map[n][m] +1;
            queue = map[n][m];

            bfs(n+1,m);
            bfs(n,m+1);
            bfs(n-1,m);
            bfs(n,m-1);
            return true;
        }
        return false;
    }

}
