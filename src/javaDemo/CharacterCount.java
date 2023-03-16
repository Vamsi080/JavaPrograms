package javaDemo;


	public class CharacterCount {
	    
	    public static void countCharacters(String str) {
	        // create an array to hold the count of each character
	        int[] count = new int[256];
	        
	        // loop through the string and count each character
	        for (int i = 0; i < str.length(); i++) {
	            int ascii = (int) str.charAt(i);
	            count[ascii]++;
	        }
	        
	        // print the count of each character
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > 0) {
	                System.out.println((char) i + ": " + count[i]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        countCharacters(str);
	    }
	}

