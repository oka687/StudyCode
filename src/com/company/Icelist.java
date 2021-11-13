package com.company;

import java.util.Scanner;

public class Icelist {
    
    // 맵 리스트 전역변수 선언
    int N = 0;
    int M = 0;
    int count = 0;
    int[][] map;

    public void quest(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("N의 개수를 입력");
            N = sc.nextInt();

            System.out.println("M의 개수를 입력");
            M = sc.nextInt();

            if (3 > N || M > 50) {
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
                    System.out.print(map[i][k]);
                } else {
                    // 50% 확률로 0
                    map[i][k] = 0;
                    System.out.print(map[i][k]);
                }
            }
            System.out.println("");
        }

        checkIce();
    }

    public void checkIce(){
        for(int i = 0; i < N; i++){
            for(int l = 0; l < M; l++){
                //코드 입력
               if(bfs(i,l) == true){
                   count += 1;
                   System.out.println("개수 : "+count);
               }
            }
        }
    }
    public boolean bfs(int x, int y){

        if (map[x][y] != 0 || map[x][y] != 1) {return false;}
        if(map[x][y] == 0){
           bfs(x,y+1);
            bfs(x,y-1);
            bfs(x+1,y);
            bfs(x-1,y);
            return true;
        }else {
            return false;
        }
    }
}
