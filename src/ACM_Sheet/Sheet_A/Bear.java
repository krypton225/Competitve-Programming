/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/contest/791/problem/A
 * */

package ACM_Sheet.Sheet_A;

import java.util.Scanner;

public class Bear {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int limak = s.nextInt();
        int bob = s.nextInt();

        int years = 0;
        while (limak <= bob) {
            limak *= 3;
            bob *= 2;

            years++;
        }

        System.out.println(years);
    }
}
