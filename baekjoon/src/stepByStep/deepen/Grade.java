package stepByStep.deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double GPA = 0;
        double totalCredit = 0;

        for(int i = 0; i < 20; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            st.nextToken();
            double subCredit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(grade.equals("P")) {
                continue;
            } else if(grade.equals("A+")) {
                GPA += subCredit * 4.5;
            } else if(grade.equals("A0")) {
                GPA += subCredit * 4.0;
            } else if(grade.equals("B+")) {
                GPA += subCredit * 3.5;
            } else if(grade.equals("B0")) {
                GPA += subCredit * 3.0;
            } else if(grade.equals("C+")) {
                GPA += subCredit * 2.5;
            } else if(grade.equals("C0")) {
                GPA += subCredit * 2.0;
            } else if(grade.equals("D+")) {
                GPA += subCredit * 1.5;
            } else if(grade.equals("D0")) {
                GPA += subCredit;
            }
            totalCredit += subCredit;
        }
        br.close();
        System.out.println(GPA/totalCredit);
    }
}
