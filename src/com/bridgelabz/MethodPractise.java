package com.bridgelabz;

public class MethodPractise {
            //static int logic(int a, int b) {        // static method( no need to create object).
              int logic (int a, int b) {              // non-static method ( object should be created).
               int c = a+b;          // if you give values of a and b. Don't worry values of x,y,p,q will not change.
               return c;            /* a and b are just the copies of x,y,p,q. when you change the values of x,y,p,q
                               values of a and b will automatically change. */
           }
    public static void main(String[] args) {
	// hello, practising java by self. focused and working hard to learn java.

                            int x=6;
                            int y=9;
                            MethodPractise obj = new MethodPractise();
                            int z= obj.logic(x,y);
                            int p= 4;
                            int q= 8;
                            int r= obj.logic(p,q);
        System.out.println(z);
        System.out.println(r);

                                                      }

}
