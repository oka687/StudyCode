package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCity {

    public void search(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int N = sc.nextInt();  //도시
        int M = sc.nextInt();  //도로
        int X = sc.nextInt();  //시작점
        int k = sc.nextInt();  //최단거리

        // N이 300000이라고 했고 배열로 구현하기 때문에 1을 더해준다.
        int[] distance = new int [3000001];
        ArrayList<ArrayList<Integer>> linkList = new ArrayList<>();

        //리스트에 거리를 넣는다
        for(int i =0; i <= N; i++){
            linkList.add(new ArrayList<Integer>());
            distance[i] = -1;
        }

        // 시작점 -> 시작점의 거리
        distance[X] = 0;

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            linkList.get(a).add(b);
        }

        // BFS
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(X);   // 출발도시 지정

        while(!queue.isEmpty()){
            int tmp = queue.poll();

            for(int i =0; i < linkList.get(tmp).size(); i++){
                int next = linkList.get(tmp).get(i);

                //방문한 적이 없는 경우
                if(distance[next] == -1){
                    distance[next] = distance[tmp] + 1; //시작점에서 다음 도시까지의 거리
                    queue.add(next);
                }
            }
        }
        // 최단거리 == k 체크, 도시번호 print
        boolean ch = false;
        for(int i =0; i <=N; i++){
            if(distance[i]==k){
                System.out.println(i);
                ch = true;
            }
        }
        if(!ch) System.out.println(-1);
    }
}
