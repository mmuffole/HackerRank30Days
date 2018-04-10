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

        double tip = (meal_cost*(tip_percent/100f));
        double tax = (meal_cost*(tax_percent/100f));
        // TODO: why do I have to add the "f" after 100?
        // If I add the f after 100 or change tip/tax_percent to doubles, I get 15.36
        // else I get 12.0 as my printed answer
        double totalCost = (meal_cost + tip + tax);

        System.out.println("The total meal cost is " + totalCost + " dollars.");

        // TODO: figure out how to make the rounding function work! :(
    }
}
