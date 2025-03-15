package Array;

import java.util.Scanner;

public class FindDuplicates {

	 public static void findDuplicates(int[] arr) {
	        System.out.println("Duplicate Elements:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	            }
	        }
	        System.out.println();
	    }
	 
	 
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n]; 
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        findDuplicates(arr);
	        sc.close();
}
}
