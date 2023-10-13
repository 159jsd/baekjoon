package stepByStep.loop;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = sc.nextInt();
        int totalNumber = sc.nextInt();
        for (int i = 0; i < totalNumber; i++) {
            totalCost -= sc.nextInt() * sc.nextInt();
        }
        if(totalCost == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
