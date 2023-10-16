package stepByStep.Array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[28];
        int[] answerArray = new int[2];
        for (int i = 0; i < 28; i++) {
            array[i] = sc.nextInt();
        }

        String answer = "";

        for (int i = 1; i < 30; i++) {
            boolean flag = true;
            for (int j = 0; j < 27; j++) {
                if (array[j] == i) {
                    flag = false;
                }
            }
            if(flag) {
                answer += i + " ";
            }
        }

        StringTokenizer st = new StringTokenizer(answer, " ");

        answerArray[0] =Integer.parseInt(st.nextToken());
        answerArray[1] =Integer.parseInt(st.nextToken());
        Arrays.stream(answerArray).sorted();

        System.out.println("" + answerArray[0] + "\n" + answerArray[1]);
    }
}
