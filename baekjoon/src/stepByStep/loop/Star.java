package stepByStep.loop;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String star = "*";
        for (int i = 0; i < N; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
