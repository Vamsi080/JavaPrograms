package javaDemo;

public class StringReverse {

	    
	    public static String reverse(String str) {
	        if (str.isEmpty()) { // base case
	            return str;
	        }
	        return reverse(str.substring(1)) + str.charAt(0); // recursive call
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        String reversed = reverse(str);
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reversed);
	    }
	}


