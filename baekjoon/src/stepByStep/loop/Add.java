package stepByStep.loop;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;
        for (int i = number; i > 0; i --) {
            total += i;
        }
        System.out.println(total);
    }
}
