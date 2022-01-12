
package com.bridgelabz;

public class MethodOverloading {
     // static void telljoke() {              // no return is required as void is used.
        // System.out.println("I am fuuny");

        static void foo() {              // no return is required as void is used.
            System.out.println("Hello");
        }
            static void foo(int a) {                         /* here (int a) is called parameter and when we assign value of a=100, this
                                                                is called argument. Arguments are real. */
                System.out.println("Hello " + a);
            }
                static void foo(int a, int b) {
                    System.out.print("Hello "+a+ " ");
                    System.out.println("Hello "+b);
                }


        public static void main(String[] args) {

          //  telljoke();
            foo();                      // method overloading. same name of methods but different parameters.
            foo(200);
            foo(300,100);
        }
    }

