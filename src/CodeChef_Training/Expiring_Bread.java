/*
 * Hello! This is a solution of the problem which its links is:
 * https://www.codechef.com/problems/EXPIRY
 * */

package CodeChef_Training;

import java.util.Scanner;

public class Expiring_Bread {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
            int sheHas = s.nextInt();
            int expireDate = s.nextInt();
            int canEatInDay = s.nextInt();

            if(canEatInDay * expireDate >= sheHas) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
