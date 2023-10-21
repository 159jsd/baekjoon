package algorithmStudy;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        if(n == 4 || n == 7) {
            System.out.println(-1);
            flag = false;
        }

        int answer = 0;
        int rest = n % 5;

        if (rest == 0 && flag) {
            answer = n / 5;
        } else if (rest == 1 && flag) {
            answer = n / 5 - 1;
            answer += 2;
        } else if (rest == 2 && flag) {
            answer = n / 5 - 2;
            answer += 4;
        } else if (rest == 3 && flag) {
            answer = n / 5 + 1;
        } else if (rest == 4 && flag) {
            answer = n / 5 - 1;
            answer += 3;
        }

        if(flag) {
            System.out.println(answer);
        }

    }
}
