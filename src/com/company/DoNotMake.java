package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DoNotMake {

    public void momey(){
        int N;
        int [] array;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(array);

        for(int i = 0; i < N; i++){
            if (count >= array[i]){
                count = count + array[i];
            }else if (count < array[i]){
                break;
            }
        }
        System.out.println(count);
    }
}
