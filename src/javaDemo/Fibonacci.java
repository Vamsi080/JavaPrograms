package javaDemo;

public class Fibonacci {
	
	    
	    public static int fibonacci(int n) {
	        if (n <= 1) { // base case
	            return n;
	        }
	        return fibonacci(n-1) + fibonacci(n-2); // recursive call
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
	}


