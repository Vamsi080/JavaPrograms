package javaDemo;
import java.util.HashMap;
import java.util.Map;

public class CharecterCountA {
	
	    
	    public static void countCharacters(String str) {
	        // create a HashMap to hold the count of each character
	        Map<Character, Integer> count = new HashMap<>();
	        
	        // loop through the string and count each character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (count.containsKey(c)) {
	                count.put(c, count.get(c) + 1);
	            } else {
	                count.put(c, 1);
	            }
	        }
	        
	        // print the count of each character
	        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        countCharacters(str);
	    }
	

}
