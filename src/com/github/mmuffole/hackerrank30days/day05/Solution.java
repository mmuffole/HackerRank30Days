package com.github.mmuffole.hackerrank30days.day05;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            solve(System.in);
        }

        public static void solve(InputStream inputStream) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }

