package stepByStep.loop;

import java.util.Scanner;

public class AddWithIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Case #" + (i + 1) + ": " + (sc.nextInt() + sc.nextInt()));
        }
    }
}
