package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AddOrMulti {
    public void calc(){
        String str;
        int [] array;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        array = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(array);

        count = array[0];
        for (int l = 1; l < array.length; l++) {
            if(count + array[l] > count * array[l]){
                count = count + array[l];
            }else{
                count = count * array[l];
            }
        }
        System.out.println(count);
    }
}
