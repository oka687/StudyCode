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

        // 문자열을 숫자로 바꿔서 배열에 담기
        for(int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        //정렬
        Arrays.sort(array);

        // 첫번째 값 대입
        count = array[0];

        // 두 수를 계산해서 값이 더 큰 쪽으로 계산하기
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
