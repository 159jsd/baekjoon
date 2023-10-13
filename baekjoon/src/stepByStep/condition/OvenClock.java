package stepByStep.condition;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int inputMinute = sc.nextInt();
        int totalMinute = hour * 60 + minute + inputMinute;

        System.out.println(totalMinute / 60 % 24 + " " + totalMinute % 60);

    }
}
