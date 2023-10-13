package stepByStep.loop;

import java.util.Scanner;

public class TableAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tableNumber = sc.nextInt();
        for (int i = 0; i < tableNumber; i++) {
            System.out.println(sc.nextInt() + sc.nextInt());
        }
    }
}
