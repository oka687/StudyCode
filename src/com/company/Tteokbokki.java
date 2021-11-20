package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Tteokbokki {

    // 재귀 때문에 전역변수로 선언
    int [] rice;
    int riceCount,customRice;

    public void riceCake(){
        Scanner sc = new Scanner(System.in);

        System.out.println("떡 개수 입력");
        riceCount = sc.nextInt();
        rice = new int[riceCount];

        System.out.println("떡 사이즈 입력");
        for(int i = 0; i < riceCount; i++){
            rice[i] = sc.nextInt();
        }

        System.out.println("손님이 가져갈 떡 길이 입력");
        customRice = sc.nextInt();

        // 정렬
        Arrays.sort(rice);
        
        // 계산 시작
        coda(0, rice[riceCount - 1]);
    }

    public void coda(int start, int end) {

        int middle = (end - start) / 2 + start;     // 중간값 계산
        int lenCalc = 0;    // 길이 합

        for (int i = 0; i < rice.length; i++) {
            if(rice[i] - middle < 0){
                // 길이 값이 0 이하면 스킵
                continue;
            }else{
                // 길이 전부 더하기
                lenCalc = lenCalc + (rice[i] - middle);
            }
        }

        // 재귀여부 결정
       if (lenCalc == customRice) {
            // 손님이 가져가기 위한 값
            System.out.println(middle);
        } else if (customRice < lenCalc) {
            // 자른 값이 손님이 가져가야 할 값보다 크다면 middle이 start, end는 그대로
            coda(middle, end);
        } else if (customRice > lenCalc) {
           // 자른 값이 손님이 가져가야 할 값보다 작다면 start는 그대로, middle은 end로
            coda(start, middle);
        }
    }
}
