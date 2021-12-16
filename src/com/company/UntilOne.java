package com.company;

import java.util.Scanner;

public class UntilOne {

    public void one(){
        int N,K;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        while(true){
            if(N % K != 0){
                N = N - 1;
                count++;
            }else if(N % K == 0){
                N = N / K;
                count++;
            }

            if(N == 1){
                System.out.println(count);
                break;
            }
        }
    }
}
