package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public void upSideDown(){

        String str;
        int countZero = 0;
        int countOne = 0;
        char save;
        char backSave = '2';

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){

                // 문자열을 char로 만들어서 카운팅 할 수 있게 한다.
                save = str.charAt(i);

                // 숫자가 바뀌면 바뀐 숫자를 카운팅 한다.
                if(save == '0' && save != backSave){
                    countZero++;
                    backSave = save;
                }else if(save == '1' && save != backSave){
                    countOne++;
                    backSave = save;
                }
        }

        if(countOne < countZero){
            System.out.println(countOne);
        }else{
            System.out.println(countZero);
        }
    }
}
