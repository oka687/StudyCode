package com.company;

import java.util.ArrayList;

public class StringZiper {

    String a = "";

    public void zipper() {

        String str1 = "aabbaccc";

      /*  String str2 = "ababcdcdababcdcd";
        String st3 = "abcabcdede";
        String st4 = "abcabcabcabcdededededede";
        String st5 = "xababcdcdababcdcd";
*/

        for(int cut = 1; cut <= str1.length(); cut++){
                cutting(cut,str1);
        }

    }

    // 문자열 나누기
    public void cutting (int cut,String str){

        int dvideNum = str.length() / cut;

        int start = 0;      // 나누기 시작점
        int end = 0;        // 나누기 끝점
        String divideAnswer = "";
        for(int l = 0; l < dvideNum; l++) {

            end = start + cut;

            String divideStr = str.substring(start, end);
            start = end;


            if (divideStr.length() >= 2) {
                char divdeStart = divideStr.charAt(0);
                int count = 0;

                for (int s = 0; s < divideStr.length(); s++) {
                    if (divideStr.charAt(s) == divdeStart) {
                        count++;
                        if (s + 1 == divideStr.length()) {
                            divideAnswer = divideAnswer + count + divdeStart;
                        }
                    } else if (divideStr.charAt(s) != divdeStart) {
                        if (count < 1) {
                            divideAnswer = divideAnswer + divdeStart;
                            count = 0;
                        } else {
                            divideAnswer = divideAnswer + count + divdeStart;
                        }
                        count = 0;
                        divdeStart = divideStr.charAt(s);
                    }
                }
            }
        }
            if (dvideNum % cut != 0) {
                String answer = divideAnswer + str.substring(str.length() - (1 + dvideNum % cut), str.length()-1);
                System.out.println(answer.replace("1","") + "/" + answer.length() + "/" + cut);
            } else {
                String answer = divideAnswer + str.substring(str.length() - (1 + dvideNum % cut), str.length()-1);
                System.out.println(answer.replace("1","") + "/" + answer.length() + "/" + cut);
            }
            System.out.println("=================");

    }
}
