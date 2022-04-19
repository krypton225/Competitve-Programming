/*
 * Hello! This is a solution of the problem which its links is:
 * https://www.codechef.com/problems/LTIME
 * */

package CodeChef_Training;

import java.util.Scanner;

public class LunchTime {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            int myInput = scan.nextInt();

            if(myInput >= 1 && myInput <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
