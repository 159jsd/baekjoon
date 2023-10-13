package stepByStep.loop;

import java.util.Scanner;

public class CodingIsPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String line = "";
        for (int i = 0; i < number / 4; i++) {
            line += "long ";
        }
        System.out.println(line + "int");
    }
}
