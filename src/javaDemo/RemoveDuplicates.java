package javaDemo;

public class RemoveDuplicates {
	
	    
	    public static int[] removeDuplicates(int[] arr) {
	        if (arr.length == 0) {
	            return arr;
	        }
	        int index = 0;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[index]) {
	                index++;
	                arr[index] = arr[i];
	            }
	        }
	        int[] result = new int[index + 1];
	        for (int i = 0; i <= index; i++) {
	            result[i] = arr[i];
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 3, 3, 3, 4, 4, 5, 6, 6};
	        int[] result = removeDuplicates(arr);
	        System.out.println("Array after removing duplicates:");
	        for (int i : result) {
	            System.out.print(i + " ");
	        }
	    }
	}
