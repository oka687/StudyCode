package com.company;

import java.util.Scanner;

public class MakeOne {

    public void divid(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");
        int N=sc.nextInt();
        int[] arr = new int[N+1];
        sc.close();
        for(int i=2;i<=N;i++) {
            arr[i]=arr[i-1]+1;
            if(i%2==0) {
                arr[i]=Math.min(arr[i], arr[i/2]+1);
            }
            if(i%3==0) {
                arr[i]=Math.min(arr[i], arr[i/3]+1);
            }
            if(i%5==0) {
                arr[i]=Math.min(arr[i], arr[i/5]+1);
            }
        }
        System.out.println(arr[N]);
    }
}

