package com.company;

import java.util.Scanner;

public class LuckyStr {

    public void skill(){
        int N = 0;
        int leftN = 0;
        int rightN = 0;
        String str;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        str = Integer.toString(N);

        String left = str.substring(0,str.length() / 2);
        String right = str.substring(str.length() / 2 , str.length());

        for(int i = 0; i < left.length(); i++){
            int bucketLeft = Character.getNumericValue(left.charAt(i));
            leftN = leftN + bucketLeft;

            int bucketright = Character.getNumericValue(right.charAt(i));
            rightN = rightN + bucketright;
        }

        if(leftN == rightN){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
    }
}
