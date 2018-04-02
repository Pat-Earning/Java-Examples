package javaexamples.basic;

public class Fibonacciseries {
    
    public static void main() {
        int i1 = 1;
        int i2 = 1;
        int i3;
        
        for (int k = 3; k <= 20; k++) {
            i3 = i1 + i2;
            System.out.println(k + ": " + i3);
            i1 = i2;
            i2 = i3;
        }
        
    }
}
