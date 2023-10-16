package stepByStep.Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxAndMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(s, " ");

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        bw.write("" + array[0] + " " + array [N-1]);
        bw.flush();
        bw.close();

    }
}
