package stepByStep.twoDimentionalAraay;

import java.util.Scanner;

public class VerticalRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[5][15];
        String answer = "";
        for (int i = 0; i < matrix.length; i++) {
            String str = sc.next();
            for(int j = 0; j < str.length(); j++) {
                matrix[i][j] = "" + str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrix[j][i] != null) {
                    answer += matrix[j][i];
                }
            }
        }
        System.out.println(answer);
    }
}
