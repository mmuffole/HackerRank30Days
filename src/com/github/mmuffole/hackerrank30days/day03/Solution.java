package com.github.mmuffole.hackerrank30days.day03;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        solve(System.in);
    }

    public static void solve(InputStream inputStream) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            // Complete the code
        }
        System.out.println(ans);
    }

}
