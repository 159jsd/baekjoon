package stepByStep.math;

import java.util.Scanner;

public class BinaryTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int answer = 0;

        for (int i = N.length() - 1, j = 0 ; i >= 0; i-- , j++) {
            char x = N.charAt(i);
            if (x >= 48 && x <= 57) {
                answer += Integer.parseInt(""+x) * (Math.pow(B, j));
            } else {
                answer += ((int)x - 55) * (Math.pow(B, j));
            }
        }
        System.out.println(answer);
    }
}
