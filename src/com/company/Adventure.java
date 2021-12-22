package com.company;

import javax.management.loading.MLetContent;
import java.util.Arrays;
import java.util.Scanner;

public class Adventure {

    public void guild(){

        int N;
        int [] array;
        int lenCount;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        lenCount = N;      // 변해야 하는 값이므로 미리 선언

        array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(array);

       while(true){
           // lenCount값이 0보다 작거나 배열 오류를 일으키는 경우, 해당 배열값보다 작은 경우에는 끝낸다
           if(lenCount > 0 && lenCount -1 >= 0 && lenCount >= array[lenCount - 1]){
               lenCount = lenCount - array[lenCount - 1];
               count++;
           }else{
               System.out.println(count);
               break;
           }
       }
    }
}
