package stepByStep.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleanhouseBossDongHyuck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String answer = "";

        for(int i = 0; i < n; i++) {
            int question = Integer.parseInt(br.readLine());
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            if(question / 25 > 0) {
                quarter = question / 25;
                question -= quarter * 25;
            }
            if(question / 10 > 0) {
                dime = question / 10;
                question -= dime * 10;
            }
            if(question / 5 > 0) {
                nickel = question / 5;
                question -= nickel * 5;
            }
            if(question > 0) {
                penny = question;
            }
            answer += quarter + " " + dime + " " + nickel + " " + penny + "\n";
        }

        System.out.println(answer);

    }
}
