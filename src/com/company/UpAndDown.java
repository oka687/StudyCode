package com.company;

import java.util.Scanner;

public class UpAndDown {

    int N;

    public void upDown(){
        int store;
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 자리를 넣으시겠습니까?");
        N = sc.nextInt();

        // 배열 선언
        int [] array = new int[N];

        System.out.println("숫자 입력");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        // 내림차순 버블 정렬
        for(int k = 0; k < array.length - 1; k++){
           for(int l = k+1; l < array.length; l++){
                if(array[k] < array[l]){
                    store = array[k];
                    array[k] = array[l];
                    array[l] = store;
                }
           }
        }

        // 출력
        for(int a = 0; a < array.length; a++){
            System.out.print(array[a]);
            System.out.print(" ");
        }
    }
}
