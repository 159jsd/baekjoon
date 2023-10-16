package stepByStep.Array;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
