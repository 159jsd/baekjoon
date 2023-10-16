package stepByStep.StringA;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 97; i < 123; i++) {
            System.out.print(str.indexOf(i) + " ");
        }
    }
}
