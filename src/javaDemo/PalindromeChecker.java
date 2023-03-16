package javaDemo;
import java.util.function.Predicate;
import java.util.Scanner;
public class PalindromeChecker {
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String to Check Palindrome or not?");
        String palindrome = sc.next();
        
        //here we are using predicate interface to establish the lambdafuction
        //by reversing string we use the StringBuilder
        Predicate<String> isPalindrome = (str) -> {
            StringBuilder reversed = new StringBuilder(str).reverse();
            return str.equals(reversed.toString());
        };

        System.out.println(isPalindrome.test(palindrome)); // prints true

    }
}
