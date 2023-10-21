package stepByStep.array;

import java.io.*;
import java.util.StringTokenizer;

public class LowerThanN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String s2 = br.readLine();
        br.close();
        StringTokenizer st2 = new StringTokenizer(s2, " ");

        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i : array) {
            if (i < b) {
                bw.write(i + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
