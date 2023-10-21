package stepByStep.stringA;

import java.util.Scanner;

public class StringLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < m; k++) {
                    answer += s.substring(j, j+1);
                }
            }
            answer += "\n";
        }
            System.out.println(answer);
    }
}
