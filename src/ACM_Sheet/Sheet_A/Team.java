/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/contest/231/problem/A
 * */

package ACM_Sheet.Sheet_A;

import java.util.Scanner;

public class Team {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfProblems = s.nextInt();
        int solutionResult = 0;

        for (int i = 0; i < numberOfProblems; i++) {
            int petya = s.nextInt();
            int vasya = s.nextInt();
            int tonya = s.nextInt();

            if((petya + vasya + tonya) >= 2) {
                solutionResult++;
            }
        }

        System.out.println(solutionResult);
    }
}
