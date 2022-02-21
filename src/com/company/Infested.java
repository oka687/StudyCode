package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Infested {

    public void comp(){
        Scanner sc = new Scanner(System.in);

        int N;
        int S;
        int X;
        int Y;
        int virus;

        N = sc.nextInt();
        virus = sc.nextInt();

        int [][] arr = new int[N][N];
        boolean [][] arrBool = new boolean[N][N];

        for(int i = 0; i < N; i++){
            for(int l = 0; l < N; l++){
                arr[i][l] = 0;
                arrBool[i][l] = false;
            }
        }

        //바이러스 선언
        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[2][0] = 3;

        // 지도생성
        for(int i = 0; i < N; i++){
            for(int l = 0; l < N; l++){
                System.out.print(arr[i][l]);
            }
            System.out.println("");
        }

        System.out.println("=================================");

       /* S = sc.nextInt();      // 시간
        X = sc.nextInt();      // X좌표
        Y = sc.nextInt();      // Y좌표*/

    /*    for(int time = 0; time < S; S++){
            solve(N,arr,arrBool);
        }*/

        solve(N,arr,arrBool);

        arr =  solve(N,arr,arrBool);
      //  System.out.println(arr[X-1][Y-1]);

        for(int i = 0; i < N; i++){
            for(int l = 0; l < N; l++){
                System.out.print(arr[i][l]);
            }
            System.out.println("");
        }
    }

    public int [][] solve(int N,int [][] arr,boolean [][] arrbool){
        for(int i = 0; i < N; i++){
            for(int l = 0; l < N; l++){
                if(arr[i][l] != 0){
                    arrbool[i][l] = true;
                    int virusNum = arr[i][l];
                    int Y = l;
                    int X = i;

                    //상
                    int up = X - 1;
                    if(up >= 0 && up < N && arr[up][Y] > virusNum){
                        arr[up][Y] = virusNum;
                    }

                    //하
                    int down = X + 1;
                    if(down >= 0 && down < N && arr[down][Y] > virusNum){
                        arr[down][Y] = virusNum;
                    }

                    //좌
                    int left = Y - 1;
                    if(left >= 0 && left < N &&arr[X][left] > virusNum){
                        arr[X][left] = virusNum;
                    }

                    //우
                    int right = Y + 1;
                    if(right >= 0 && right < N && arr[X][right] > virusNum){
                        arr[X][right] = virusNum;
                    };
                }
            }
        }

        return arr;
    }
}
