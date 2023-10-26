package stepByStep.math;

import java.util.Scanner;

public class Hive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = 12;
        int start = 8;
        int count = 3;
        boolean flag = true;
        if (n == 1) {
            System.out.println(1);
            flag = false;
        } else if (n >= 2 && n <= 7) {
            System.out.println(2);
            flag = false;
        }

        while (flag) {
            if(n >= start && n < start + range) {
                System.out.println(count);
                break;
            } else {
                start += range;
                range += 6;
                count++;
            }
        }
    }
}
