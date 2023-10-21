package stepByStep.array;

import java.io.IOException;
import java.util.Scanner;

public class ChangeBalls {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] array = new int[N];
        for (int o = 0; o < N; o++) {
            array[o] = o + 1;
        }

        int[] copiedArray = new int[N];
        for (int o = 0; o < M; o++) {
            System.arraycopy(array, 0, copiedArray, 0, N);
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            array[i] = copiedArray[j];
            array[j] = copiedArray[i];
        }

        String answer = "";
        for (int i : array) {
            answer += i + " ";
        }
        System.out.println(answer);
    }
}
