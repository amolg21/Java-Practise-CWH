package com.bridgelabz;

public class PracticeSetJavaMethods {
    // Question 1
    static void multiplication(int n) {
        // System.out.println("The table of " + n + " is");
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x = i * n;
            // System.out.println(x);
        }
    }

    // Question 2
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //     System.out.print("*");
            }
            // System.out.println(" ");
        }
    }

    // Question 3
    static void pattern1(int n) {
        ;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
               // System.out.print("*");
            }
           // System.out.println(" ");
        }
    }


            public static void main (String[]args){
                // multiplication(45);
                // pattern(5);
               //  pattern1(6);

            }
        }
