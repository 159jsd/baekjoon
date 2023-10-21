package stepByStep.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];

        for(int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);

        for(int i = 0; i < 9; i++) {
            if(array[i] == max) {
                System.out.println(i + 1);
            }
        }

    }
}
