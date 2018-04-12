package javaexamples.basic;

public class Exercises {
   public static void main() {
      //Write a program that counts from 1 to 15, printing out each number,
      //and then counts backward by twos back to 1, again printing out each number.
      //count();
      
      //Each term of the Fibonacci series is formed by adding the previous two terms.
      //What sort of series do you get if you add the previous three terms?
      //Write a program to print the first 20 terms of this series.
      fibopp();

   }
   
   public static void count() {
      int top = 15;
      for (int i = 0; i <= top; i++) {
         System.out.println(i);
      }      
      for (int i = top; i >= 0; i = i-2) {
         System.out.println(i);
      }
   }
   
   public static void fibopp() {
      int top = 20;
      int t;
      int a = 1;
      System.out.println(a);
      int b = 1;
      System.out.println(b);
      int c = 2;
      System.out.println(c);
      for (int i = 4; i <= top; i++) {
         t = a + b + c;         
         System.out.println(t);
         a = b;
         b = c;
         c = t;
      }
   }
}
