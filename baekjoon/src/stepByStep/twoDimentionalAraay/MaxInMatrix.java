package stepByStep.twoDimentionalAraay;

import java.util.Scanner;

public class MaxInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[9][9];
        int max = -1;
        String index = "";
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                if(max < A[i][j]) {
                    max = A[i][j];
                    index = i + 1 + " " + (j + 1);
                }
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
