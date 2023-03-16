package javaDemo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    
    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (count.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "aabbccdefg";
        char result = firstNonRepeatedChar(str);
        System.out.println("The first non-repeated character in '" + str + "' is: " + result);
    }
}
