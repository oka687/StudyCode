package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class CardNumGame {

    public void game(){

        int M = 5;
        int N = 5;

        int [][] array = new int[N][M];

        Random ran = new Random();

        // 배열 랜덤으로 입력
        for(int i = 0; i < N; i++){
            for(int a = 0; a < M; a++){
                array[i][a] = ran.nextInt(100)+1;
            }
        }

        // 배열 정렬
        for(int i = 0; i < N; i++){
            Arrays.sort(array[i]);
        }

        // 배열 출력(없어도 됨)
        for(int i = 0; i < N; i++){
            for(int a = 0; a < M; a++){
                System.out.print(array[i][a]+" ");
            }
            System.out.println("");
        }

        // 가장 작은 수 뽑아내기
        for(int i = 1; i < N; i++){
            if(array[i-1][0] <= array[i][0]){
                array[i][0] = array[i-1][0];
            }else {
                continue;
            }
        }

        // 답
        System.out.println(array[N-1][0]);
        
    }
}
