//package com.company;
//
//import org.w3c.dom.Node;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.PriorityQueue;
//
//public class Infect {
//
//    // 입력값 선언
//    static int n,k,s,x,y;
//    static int map[][];
//    static boolean visited[][];
//    static int dx[] = {0,0,1,-1};
//    static int dy[] = {1,-1,0,0};
//    static PriorityQueue<Node> pq = new PriorityQueue<>();
//
//    public void mainQuest() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] t = br.readLine().split(" ");
//        n = Integer.parseInt(t[0]);
//        k = Integer.parseInt(t[1]);
//
//        map = new int[n][n];
//        visited - new boolean[n][n];
//
//        for(int i = 0; i < n; i++){
//            String[] map_input = br.readLine().split( " ");
//            for(int j = 0; j < n; j++){
//                map[i][j] = Integer.parseInt(map_input[j]);
//                if(map[i][j] != 0){
//                    visited[i][j] = true;
//                    pq.add(new Node())
//                }
//            }
//        }
//
//    }
//}
