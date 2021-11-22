package com.company;

import java.util.Scanner;

public class MakeOne {

    public void divid(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");
        int N=sc.nextInt();
        int[] dp=new int[N+1];
        sc.close();
        for(int i=2;i<=N;i++) {
            dp[i]=dp[i-1]+1;
            if(i%2==0) {
                dp[i]=Math.min(dp[i], dp[i/2]+1);
            }
            if(i%3==0) {
                dp[i]=Math.min(dp[i], dp[i/3]+1);
            }
            if(i%5==0) {
                dp[i]=Math.min(dp[i], dp[i/5]+1);
            }
        }
        System.out.println(dp[N]);
    }
}

