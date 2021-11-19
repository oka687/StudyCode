package com.company;

import java.util.Scanner;

public class TwoTree {

        public void bupum(){

            // 스캐너 선언
            Scanner sc = new Scanner(System.in);

            // 변수 선언
            int [] jumoon,stock;
            int stockNum,require;

            // 재고수 입력
            System.out.println("재고개수 입력");
            stockNum = sc.nextInt();

            // 재고 입력
            System.out.println("재고입력");
            stock = new int[stockNum];
            for(int i = 0; i < stockNum; i++){
                stock[i] = sc.nextInt();
            }

            // 주문량 입력
            System.out.println("주문개수 입력");
            require = sc.nextInt();

            // 주문내역 입력
            System.out.println("주문입력");
            jumoon = new int[require];
            for(int i = 0; i < require; i++){
                jumoon[i] = sc.nextInt();
            }

            // Bigyo
            for(int a = 0; a < jumoon.length; a++){
                for(int b = 0; b < stock.length; b++){
                    if(jumoon[a] == stock[b]){
                        System.out.print("YES ");
                        break;
                    }else if(stock.length - 1 == b){
                        System.out.print("NO ");
                    }
                }
            }
        }
}


