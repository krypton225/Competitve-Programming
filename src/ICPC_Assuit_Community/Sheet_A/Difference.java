/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/D
 * */

package ICPC_Assuit_Community.Sheet_A;

import java.util.Scanner;

public class Difference {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();

        long diff = (a * b) - (c * d);
        System.out.println("Difference = " + diff);
    }
}
