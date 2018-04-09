package com.github.mmuffole.hackerrank30days.day0;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Create a scanner to read from stdin
        Scanner scan = new Scanner(System.in);

        //Read a full line of input from stdin and save to
        //variable called inputString
        String inputString = scan.nextLine();

        //Close scanner object, because we're finished reading
        //all of the input from stdin for the challenge.
        scan.close();

        //Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
    }
}
