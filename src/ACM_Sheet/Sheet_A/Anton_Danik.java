/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/contest/677/problem/A
 * */

package ACM_Sheet.Sheet_A;

import java.util.Scanner;

public class Anton_Danik {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfGames = s.nextInt();
        int anton = 0, danik = 0;

        String outing = s.next();
        char[] arr = outing.toCharArray();

        for (char c : arr) {
            if (c == 'A') {
                anton++;
            } else {
                danik++;
            }
        }

        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
