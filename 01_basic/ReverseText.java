package javaexamples.basic;

public class ReverseText {
    public static void main() {
       Reverse("Hello World!");
    }
    
    private static void Reverse(String text) {
       for (int i = text.length() - 1; i >= 0; i--) {
          System.out.print(text.charAt(i));
       }
       System.out.println( );
    }
} 
