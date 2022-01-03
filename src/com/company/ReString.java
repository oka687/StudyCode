package com.company;

import java.util.Arrays;

public class ReString {

    public void rebuild(){

       // String array = "K1KA5CB7";
        String array = "AJKDLSI412K4JSDJ9D";

        int arrayAdd = 0;

        String strNum = array.replaceAll("[a-zA-Z]","");    // 숫자만
        String str = array.replaceAll("[0-9]","");          // 문자열만

        // 숫자 합
        for(int i = 0; i < strNum.length(); i++){
            int bucket = Character.getNumericValue(strNum.charAt(i));
            arrayAdd = arrayAdd + bucket;
        }

        // CHAR 배열로 된 문자열 값을 String으로 변환
        char[] arrStr = str.toCharArray();
        Arrays.sort(arrStr);

        // 각 값 합치기
        String answer = new String(arrStr);
        String arrayNum = Integer.toString(arrayAdd);

        //답
        System.out.println(answer + arrayNum);
    }
}
