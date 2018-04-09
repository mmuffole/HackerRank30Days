package com.github.mmuffole.hackerrank30days.day2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();

        // tip = 12 * 20/100 = 2.4
        // tax = 12 * 8/100 = .96
        // totalCost = mealCost + tip + tax = 12 + 2.4 + .96 = 15.36
        // round(totalCost) = 15
        // ---- All above provided by HackerRank -----

        int tip = (tip_percent/100);
        int tax = (tax_percent/100);

        double totalCost = meal_cost + tip + tax;

        System.out.println(totalCost);
    }
}
