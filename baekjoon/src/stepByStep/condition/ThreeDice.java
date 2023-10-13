package stepByStep.condition;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDice = sc.nextInt();
        int secondDice = sc.nextInt();
        int thirdDice = sc.nextInt();

        if (firstDice == secondDice && firstDice == thirdDice) {
            System.out.println(10000 + firstDice * 1000);
        } else if (firstDice == secondDice) {
            System.out.println(1000 + firstDice * 100);
        } else if (firstDice == thirdDice) {
            System.out.println(1000 + firstDice * 100);
        } else if (secondDice == thirdDice) {
            System.out.println(1000 + secondDice * 100);
        } else if (firstDice != thirdDice && firstDice != secondDice && secondDice != thirdDice) {
            int[] array = {firstDice, secondDice, thirdDice};
            Arrays.sort(array);
            System.out.println(array[2] * 100);
        }

    }
}
