package javaDemo;

public class Palindrome {
	   
	    public static boolean isPalindrome(String str) {
	        if (str.length() == 0 || str.length() == 1) { // base case
	            return true;
	        }
	        if (str.charAt(0) == str.charAt(str.length() - 1)) { // check first and last characters
	            return isPalindrome(str.substring(1, str.length() - 1)); // recursive call
	        }
	        return false; // not a palindrome
	    }

	    public static void main(String[] args) {
	        String str1 = "Vamsi";
	        String str2 = "";
	        System.out.println(str1 + " is palindrome? " + isPalindrome(str1));
	        System.out.println(str2 + " is palindrome? " + isPalindrome(str2));
	    }
	}

