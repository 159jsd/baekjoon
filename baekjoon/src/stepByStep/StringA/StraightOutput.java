package stepByStep.StringA;

import java.io.*;

public class StraightOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
