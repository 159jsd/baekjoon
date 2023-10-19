package stepByStep.deepen;

import java.util.Scanner;

public class GroupVocaChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < n; i++) {
            String str = sc.next();
            boolean flag = true;
            for(int j = 0; j < str.length(); j++) {
                int li = str.lastIndexOf(str.charAt(j));
                for(int k = j; k < li; k++) {
                    if(str.charAt(k) != str.charAt(j)) {
                        flag = false;
                    }
                }
            }
            if(flag) {
                count++;
            }
        }

        System.out.println(count);

    }
}
