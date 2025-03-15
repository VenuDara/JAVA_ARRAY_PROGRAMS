package Array;

import java.util.Scanner;

public class Palindrome {

	 // 2. Check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
        
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Buffer for insertion
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    
        sc.close();
        
}
}
