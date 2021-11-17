package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeNum {

    public void numChanger(){

        Scanner sc = new Scanner(System.in);

        int num, calcCount,store;
        int result = 0;

        System.out.println("배열 숫자 개수 입력");
        num = sc.nextInt();

        System.out.println("연산 횟수 입력");
        calcCount = sc.nextInt();

        int [] arrayA = new int[num];
        int [] arrayB = new int[num];

        System.out.println("A배열 숫자 입력");
        for(int i = 0; i < num; i++){
            arrayA[i] = sc.nextInt();
        }

        System.out.println("B배열 숫자 입력");
        for(int l = 0; l < num; l++){
            arrayB[l] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        // 자리바꾸기
        for(int k = 0; k < calcCount; k++){
            arrayA[k] = arrayB[num - 1 - k];
        }

        // 팩토리얼
        for(int f = 0; f < num; f++){
            result = result + arrayA[f];
        }

        //출력
        System.out.println(result);
    }
}
