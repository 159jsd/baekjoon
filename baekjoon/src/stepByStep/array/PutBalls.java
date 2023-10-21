package stepByStep.array;

import java.io.*;
import java.util.StringTokenizer;

public class PutBalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1, " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] array = new int[N];

        for(int e = 0; e < M; e++) {
            String s2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s2, " ");
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());

            for(int o = i - 1; o < j; o++) {
                array[o] = k;
            }
        }

        br.close();
        String answer = "";
        for (int i = 0; i < N; i++) {
            answer += array[i] + " ";
        }
        System.out.println(answer);
    }
}
