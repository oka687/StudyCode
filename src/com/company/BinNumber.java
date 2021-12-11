package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinNumber {

    public void BigNum(){

        int N; //배열 수
        int M; // 총 반복 횟수
        int K; // 큰 수 반복 횟수
        int [] array;
        Random rn = new Random();

        Scanner sc = new Scanner(System.in);

        // 스캐너 값 받기
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        // 배열 선언
        array = new int[N];

        // 난수 생성
        for(int i = 0; i < N; i++){
            array[i] = rn.nextInt(10000)+1;
        }
        
        // 정렬
        Arrays.sort(array);
        
        int a = array[array.length - 1];    // 가장 큰 수
        int b = array[array.length - 2];    // 그 다음으로 큰 수
        int c = a*K+b;                      // 1사이클
        int d = (M % (K+1)) * a;            // 나머지
        int f = M / (K+1);                  // 사이클 반복 횟수

        // 식
        int g = (c * f) + d;

        // 결과
        System.out.println(g);
    }
}
