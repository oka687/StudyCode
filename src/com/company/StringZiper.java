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

    // 클론 코딩
    public int solution(){
        String s = "aaaabbabbabb";

        int answer = s.length();
        for(int step = 1; step < s.length() / 2 + 1; step++){
            String compressed = "";
            String prev = s.substring(0,step); //앞에서부터 step 마늠의 문자열 추출
            int cnt = 1;
            //step(단위) 크기만큼 증가시키며 이전 문자열과 비교

            for(int j = step; j < s.length(); j += step){
                String sub = "";
                for(int k = j; k<j+step; k++){
                    if (k < s.length()) sub += s.charAt(k);
                }
                if(prev.equals(sub)) cnt += 1;
                //다른 문자열이 나왔다면(더 이상 압축하지 못하는 경우라면)
                else{
                    compressed += (cnt >=2)? cnt + prev : prve;
                    sub = "";
                    for(int k = j; k < j + step; k++){
                        if(k < s.length()) sub += s.charAt(k);
                    }
                    prev = sub;
                    cnt = 1;
                }
            }
            //남아있는 문자열에 대해서 처리'
            compressed += (cnt >= 2)? cnt + prev : prev;
            //만들어지는 압축 문자열이 가장 짧은 것이 답
            answer = Math.min(answer,compressed.length());
        }
        return answer;

    }
}
