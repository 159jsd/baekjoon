package stepByStep.Array;

import java.util.Scanner;

public class FlipBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        for(int i = 0; i < M; i++) {
            int j = sc.nextInt() - 1;
            int k = sc.nextInt() - 1;
            int[] copiedArray = new int[k+1 - j];

            for(int l = 0, m = k; m >= j; l++, m--) {
                copiedArray[l] = array[m];
            }

            for(int l = 0, m = j; l < copiedArray.length; l++, m++) {
                array[m] = copiedArray[l];
            }
        }

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
