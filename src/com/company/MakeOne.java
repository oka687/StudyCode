package com.company;

import java.util.Scanner;

public class MakeOne {

    // 선언부
    int firstNum;
    String getNum;
    int calcNum;
    int timeCount = 0;

    public void divid(){
        Scanner sc = new Scanner(System.in);

        // 입력부
        System.out.println("숫자 입력");
        calcNum = sc.nextInt();

        // 계산부
        while(true) {
            calcNum = resultQuest(calcNum);
            timeCount++;
            if(calcNum == 1){
                break;
            }
        }
        // 횟수 카운트
        System.out.println(timeCount);
    }

    public int resultQuest(int calcNum) {

        // 끝자리를 얻기 위해 String으로 변수
        getNum = String.valueOf(calcNum);

        // 자리수가 1을 넘기면 끝자리만 떼오기
        if (getNum.length() > 1) {
            firstNum = Integer.parseInt(getNum.substring(getNum.length() - 1));
        } else if (calcNum != 1) {
            // 자리수가 1자리이고 1이 아니라면 그대로 가져오기
            firstNum = calcNum;
        }

        // 비교 후 계산
        switch (firstNum) {
            case 0:
                return calcNum / 5;
            case 1:
                return calcNum - 1;
            case 2:
                return calcNum / 2;
            case 3:
                return calcNum / 3;
            case 4:
                return calcNum / 2;
            case 5:
                return calcNum / 5;
            case 6:
                return calcNum - 1;
            case 7:
                return calcNum - 1;
            case 8:
                return calcNum / 2;
            case 9:
                return calcNum / 3;

            default: return 0;
        }
    }
}
