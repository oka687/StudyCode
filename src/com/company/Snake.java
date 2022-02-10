package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 데드카피함
public class Snake {

    static int[][] map;
    static int n,time;
    static Queue<Direction> dirQ = new LinkedList<>();
    static Deque<int[]> snake = new ArrayDeque<>();
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];

        int k = Integer.parseInt(br.readLine());
        while(k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            map[row][col] = 1; //사과 체크
        }

        int l = Integer.parseInt(br.readLine());
        while(l-- > 0 ) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            dirQ.add(new Direction(time,dir)); //방향 바꾸는 시간, 방향 L || D
        }
        snake.add(new int[] {1,1}); //뱀의 첫시작 위치
        map[1][1]=2;// 뱀위치는 2로 기록
        time=1;
        int dir = 0;
        while(true) {
            dir = go(dir); //해당 방향으로 이동
            if(dir == -1 ) //종료조건일 경우
                break;
            time++;
        }
        System.out.println(time);
    }
    //이동 후 다음 가야될 방향을 return
    //-1일 경우 종료
    static int go(int dir) {
        int[] head = snake.peekFirst();
        int x = head[0] + dx[dir];
        int y = head[1] + dy[dir];

        if (x <= 0 || y <= 0 || x > n || y > n)
            return -1;
        //뱀의 머리가 몸에 닿을 경우
        if (map[x][y] == 2)
            return -1;
        //비어 있는칸일 경우 꼬리를 줄임
        if (map[x][y] == 0) {
            int[] tail = snake.pollLast();
            map[tail[0]][tail[1]] = 0;
        }
        //머리를 추가, 뱀 위치를 map에 기록
        snake.addFirst(new int[]{x, y});
        map[x][y] = 2;

        //방향 - time초가 끝난 후에 방향바꾸기
        if (!dirQ.isEmpty() && dirQ.peek().time == time) {
            Direction direction = dirQ.poll();
            if (direction.dir.equals("L"))
                dir = dir == 0 ? 3 : (dir - 1) % 4;
            else
                dir = (dir + 1) % 4;
        }
        return dir;
    }
    static class Direction{
        int time;
        String dir;

        Direction(int time, String dir){
            this.time = time;
            this.dir = dir;
        }
    }
}
