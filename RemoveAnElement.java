package Array;

import java.util.Scanner;

public class RemoveAnElement {

	// 10. Remove an element from the array
    public static void removeElement(int[] arr, int size, int position) {
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Array after deletion:");
        displayArray(arr, size - 1);
    }
    
    public static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        
        System.out.print("Enter the position (0-based index) to remove: ");
        int position = sc.nextInt();
        removeElement(arr, n, position);
        sc.close();
}
}
