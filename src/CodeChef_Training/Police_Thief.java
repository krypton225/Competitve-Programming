/*
 * Hello! This is a solution of the problem which its links is:
 * https://www.codechef.com/problems/POLTHIEF
 * */

package CodeChef_Training;

import java.util.Scanner;

public class Police_Thief {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = s.nextInt();
        int seconds = 0;

        for (int i = 0; i < testCases; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            seconds = Math.abs(x - y);
            System.out.println(seconds);
            seconds = 0;
        }
    }
}
