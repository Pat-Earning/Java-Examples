package javaexamples.basic;

public class Factorials {
    
    public static void main() {
        System.out.println("Factorial of 5=" + Factorial(5));
        }
        	
	public static int Factorial(int num) {
	    if (num == 0) {
	        return 0;
	    }
	    
	    if (num < 0) throw new IllegalArgumentException("x must be >= 0");

	    int fact = 1;
		for (int i =1; i<=num; i++){
		    fact *= i;
		}
		return fact;
	}
}
