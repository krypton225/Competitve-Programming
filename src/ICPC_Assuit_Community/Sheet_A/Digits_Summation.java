/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/F
 * */

package ICPC_Assuit_Community.Sheet_A;

import java.util.Scanner;

public class Digits_Summation {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        long x = s.nextLong();
        long y = s.nextLong();

        long sum = (x % 10) + (y % 10);
        System.out.println(sum);
    }
}
