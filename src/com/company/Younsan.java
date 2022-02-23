package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Younsan {

    ArrayList<String> arrs = new ArrayList<>();
    ArrayList<Integer> arrNum = new ArrayList<>();
    public void Calc(){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ArrayList<String> giho = new ArrayList<>();
//        int [] calcNum = {1,2,3,4,5,6};
        // 연산자를 받을 배열
        int [] arrGiho = new int[4];

        //N개의 자연수
        int N = sc.nextInt();
        int [] calcNum = new int[N];

        for(int z = 0; z < N; z++){
            calcNum[z] = sc1.nextInt();
        }

        String [] arr = new String[N-1];

        // 연산자 개수 받기
        for(int g = 0; g < arrGiho.length; g++){
            arrGiho[g] = sc2.nextInt();
        }


        for(int inputY = 0; inputY < arrGiho.length; inputY++){
            if(inputY == 0){
                for(int count = 0; count < arrGiho[0]; count++) {
                    giho.add("+");
                }
            }
            if(inputY == 1){
                for(int count = 0; count < arrGiho[1]; count++) {
                    giho.add("-");
                }
            }
            if(inputY == 2){
                for(int count = 0; count < arrGiho[2]; count++) {
                    giho.add("x");
                }
            }
            if(inputY == 3){
                for(int count = 0; count < arrGiho[3]; count++) {
                    giho.add("%");
                }
            }
        }

        for(int counting = 0; counting < giho.size(); counting++){
            arr[counting] = giho.get(counting);
        }

        // 모든 경우의 순열 구하기
       pernute(arr,0,N-1);

        // 모든 경우의 수를 구하는 연산자 순열
          for(int t = 0; t < arrs.size(); t++){
            //System.out.println(arrs.get(t));
            String calcing =  arrs.get(t);
            int num = calcNum[0];
            for(int l = 0; l < calcing.length(); l++){
                String calced = String.valueOf(calcing.charAt(l));

                switch (calced) {
                    case "+": num = num + calcNum[l+1];
                              break;
                    case "-": num = num - calcNum[l+1];
                        break;
                    case "x": num = num * calcNum[l+1];
                        break;
                    case "%": num = num / calcNum[l+1];
                        break;
                }
            }
            arrNum.add(num);
        }

        System.out.println(Collections.max(arrNum));
        System.out.println(Collections.min(arrNum));
    }

     public void pernute(String [] arr, int depth, int r){
        if(depth == r){
            String input = "";
            for(int i = 0; i < r; i++){
                input = input + arr[i];
            }
            arrs.add(input);
            return;
        }
        for(int i = depth; i < arr.length; i++){
            swap(arr, depth, i);
            pernute(arr, depth+1,r);
            swap(arr, depth,i);
        }
    }

    public void swap(String [] arr, int depth, int i){
            String tmp = arr[depth];
            arr[depth] = arr[i];
            arr[i] = tmp;
    }
}
