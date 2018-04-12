package com.github.mmuffole.hackerrank30days.day04;

import java.io.InputStream;
import java.util.Scanner;

public class Person {

        private int age;

        public Person(int initialAge) {
            String ansPerson = "";
            if(initialAge < 0){
               ansPerson = "Age is not valid, setting age to 0.";
            }
            age = initialAge;

            System.out.println(ansPerson);
        }

        public void amIOld(int initialAge) {
            // Write code determining if this person's age is old and print the correct statement:
            String ansAmIOld = "";
            if(initialAge < 13) {
                ansAmIOld = "You are young.";
            }
            else if(initialAge >= 13 && initialAge < 18) {
                ansAmIOld = "You are a teenager.";
            }
            else if(initialAge > 18) {
                ansAmIOld = "You are old.";
            }
                System.out.println(ansAmIOld);
        }

        public void yearPasses() {
            // Increment this person's age.
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

