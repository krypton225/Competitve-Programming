/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/contest/677/problem/A
 * */

package ACM_Sheet;

import java.util.Scanner;

public class Sheet_A {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfFriend = s.nextInt();

        int heightOfFence = s.nextInt();

        int out = 0;
        for (int i = 0; i < numberOfFriend; i++) {
            int widthOfOne = s.nextInt();

            if(widthOfOne <= heightOfFence) {
                out++;
            } else {
                out+=2;
            }
        }

        System.out.println(out);
    }

}
