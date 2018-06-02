package com.github.mmuffole.hackerrank30days.day06;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        solve(System.in);
    }

    public static void solve(InputStream inputStream) {
        Scanner in = new Scanner(inputStream);
        int numberOfLoops = in.nextInt();

        for(int i = 0; i < numberOfLoops; i++) {
            String inputWord = in.next();
            StringBuilder mangledWord = new StringBuilder();

            for(int j = 0; j < inputWord.length(); j=j+2) {
                char evenIndices = inputWord.charAt(j);
                mangledWord.append(evenIndices);
                }
            mangledWord.append(" ");
            for(int j = 1; j < inputWord.length(); j=j+2) {
                char oddIndices = inputWord.charAt(j);
                mangledWord.append(oddIndices);
            }

            System.out.println(mangledWord);

        }
    }

}
