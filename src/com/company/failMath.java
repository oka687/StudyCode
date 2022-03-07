package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class failMath {

    public int[] fail(){
        Scanner sc = new Scanner(System.in);

        int[] answer = new int[5];
        int N = sc.nextInt();

        int [] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        HashMap<Integer,Double> ary = new HashMap<>();

        double human = stages.length;
          N = N + 1;

        for(int i = 1; i < N; i++){
            int count = 0;
            for(int l = 0; l < stages.length; l++){
                if(i  == stages[l]){
                    count++;
                }
            }


            if(count == 0){
                ary.put(i,0.0);
            }else{
                human = human - count;
                double a = count / human;

                ary.put(i,(double)a);
            }
        }

        List<Integer> key = new ArrayList<>(ary.keySet());
        Collections.sort(key, (o1, o2) -> (ary.get(o2).compareTo(ary.get(o1))));

    for(Integer key1 : key){
            System.out.println(key1+"/"+ary.get(key1));
        }

        return answer;

    }
}
