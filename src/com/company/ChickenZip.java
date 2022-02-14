package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ChickenZip {

    public void call(){

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        c = c +1;
        // 배열 선언
        int [][] array = new int[c][c];
        ArrayList<String> arrZip = new ArrayList<>();  // 집 좌표
        ArrayList<String> arrChi = new ArrayList<>();  // 치킨집 좌표


        for (int i = 1; i < c; i++){
            for (int l = 1; l < c; l++){
                array[i][l] = 0;
            }
        }

        // 집
        array[1][3] = 1;
        array[2][5] = 1;
        array[3][2] = 1;
        array[4][3] = 1;

        //치킨집
        array[2][3] = 2;
        array[3][3] = 2;
        array[5][5] = 2;

        
        // 출력
        for(int i = 1; i < c; i++){
            for (int l = 1; l < c; l++){
                System.out.print(array[i][l]);
            }
            System.out.println("");
        }

        System.out.println("===============문제==================");

        // 집과 치킨집을 리스트로 나눠담기
        for(int i = 1; i < c; i++){
            for (int l = 1; l < c; l++){
                if(array[i][l] == 1){
                    arrZip.add(i + "," + l);
                }else if(array[i][l] == 2){
                    arrChi.add(i + "," + l);
                }
            }
        }

        // 출력 확인
        for(String i : arrZip){
            System.out.println(i);
        }

        for(String l : arrChi){
            System.out.println(l);
        }

    }
}
