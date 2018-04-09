package com.github.mmuffole.hackerrank30days.day1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int i = 12;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        // ---- All of the above was provided by HackerRank ----

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int ii = scan.nextInt();
        double dd = scan.nextFloat();
        scan.nextLine();
        String ss = scan.nextLine();

        scan.close();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + ii);

        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f%n", (d + dd));
        // printf does a formatted (aka specialty print), rather than just a new line print
        // the format you want is in the double quotes
        // %.1f prints to whatever is in front to 1 decimal places, %n adds a new line
        // using %n instead of \n works agnostic of system

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + ss);
    }
}
