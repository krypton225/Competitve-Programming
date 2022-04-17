/*
 * Hello! This is a solution of the problem which its links is:
 * https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/B
 * */

package ICPC_Assuit_Community;

import java.util.Scanner;

public class Basic_Data_Types {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int x = s.nextInt();
        long y = s.nextLong();
        char c = s.next().charAt(0);
        float f = s.nextFloat();
        double d = s.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(f);
        System.out.printf("%.1f" , d);
    }
}
