package com.company;

import java.util.Scanner;

public class AntWarrior {

    public void warrior(){
        int [] foodSave;
        Scanner sc = new Scanner(System.in);
        int food;
        int [] dp = new int[100];

        System.out.println("식량창고의 개수 입력");
         food = sc.nextInt();

         foodSave = new int[food];
        for(int i = 0; i < food; i++){
            foodSave[i] = (int)(Math.random()*1000);
        }

        // 랜덤 돌린 수
/*        for(int i : foodSave){
            System.out.print(i+" ");
        }*/

        // 값 입력
        for(int a = 0; a < foodSave.length; a++){
            foodSave[a] = sc.nextInt();
        }

        // 0번과 1번은 비교를 위한 수이기 때문에 dp에 그냥 대입. 따라서 2번부터 for문 돌리기 시작
        dp[0] = foodSave[0];
        dp[1] = foodSave[1];

        // 0번과 1번과 2번을 더한 값이 0보다 작으면 0을 가져가고, 1번과 2번값이 더 크면 이 값을 dp[2]에 가져간다.
        for (int i = 2; i < foodSave.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + foodSave[i]);
        }
        
        // 출력
        System.out.println(dp[food - 1]);
    }
}
