package stepByStep.stringA;

import java.util.Scanner;

public class StringAddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;
        String s = sc.next();

        for (int i = 0; i < n; i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }

        System.out.println(answer);
    }
}
