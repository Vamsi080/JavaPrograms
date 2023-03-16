package javaDemo;

public class ReverseWords {

	
	    
	    public static String reverseWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]).append(" ");
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String str = "Girmiti";
	        String result = reverseWords(str);
	        System.out.println("Reversed sentence: " + result);
	    }
	}

