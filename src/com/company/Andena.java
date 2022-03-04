package com.company;

import java.util.*;

public class Andena {

    public void link(){

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> ary = new HashMap<>();
        int N = sc.nextInt();

        int [] arr = new int[N];

        // 난수생성
        for(int i = 0; i < N; i++){

            arr[i] = (int)(Math.random()*100000)+1;
            System.out.print(arr[i]+" ");
        }

        // 줄바꿈
        System.out.println("");


        for(int l = 0; l < arr.length; l++){
            int mo = 0;
            for(int t = 0; t < arr.length; t++){
                int a = Math.abs(arr[l] - arr[t]);
                mo = mo + a;
            }

            ary.put(arr[l],mo);
        }

        List<Integer> key = new ArrayList<>(ary.keySet());

        Collections.sort(key, (o1, o2) -> (ary.get(o1).compareTo(ary.get(o2))));

   /*     for(Integer key1 : key){
            System.out.println(key1+"/"+ary.get(key1));
        }*/
        // 키값 출력
        System.out.println(key.get(0));
    }
}
