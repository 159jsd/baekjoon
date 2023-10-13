package stepByStep.loop;

import java.util.Scanner;

public class AddFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() + sc.nextInt());
        }
        sc.close();
    }
}
