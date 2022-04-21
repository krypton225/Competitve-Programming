/*
 * Hello! This is a solution of the problem which its links is:
 * https://www.codechef.com/problems/WATERREQ
 * */

package CodeChef_Training;

import java.util.Scanner;

public class WaterRequirement {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
            int numberOfHours = s.nextInt();

            int litters = (2 * numberOfHours);
            System.out.println(litters);
        }
    }
}
