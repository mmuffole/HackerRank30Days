package com.github.mmuffole.hackerrank30days.day02;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double mealCost = in.nextDouble();
        int tipPercent = in.nextInt();
        int taxPercent = in.nextInt();
        in.close();

        // tip = 12 * 20/100 = 2.4
        // tax = 12 * 8/100 = .96
        // totalCost = mealCost + tip + tax = 12 + 2.4 + .96 = 15.36
        // round(totalCost) = 15
        // ---- All above provided by HackerRank -----

        double tip = (mealCost*(tipPercent/100f));
        double tax = (mealCost*(taxPercent/100f));
        // Since tipPercent, taxPercent, and 100 are all ints, it removes decimal places.
        // Must add f in order to change 100 into float to retain decimal places for calculation.

        long totalCost = Math.round(mealCost + tip + tax);
        // Since we don't want decimal places, must use int instead of double.
        // long is a bigger version of int. double is a bigger version of float.

        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }
}
