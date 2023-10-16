package stepByStep.StringA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        StringTokenizer st = new StringTokenizer(line, " ");
        int count = 0;
        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        System.out.println(count);
    }
}
