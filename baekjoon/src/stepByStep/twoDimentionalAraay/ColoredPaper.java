package stepByStep.twoDimentionalAraay;

import java.util.Scanner;

public class ColoredPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[100][100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    matrix[j+x][k+y] = 1;
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(matrix[i][j] == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
