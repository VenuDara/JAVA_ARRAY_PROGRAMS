package Array;

import java.util.Scanner;

public class InsertAnElement {

	 // 9. Insert an element in the array
    public static void insertElement(int[] arr, int size, int element, int position) {
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        System.out.println("Array after insertion:");
        displayArray(arr, size + 1);
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
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter the position (0-based index): ");
        int position = sc.nextInt();
        insertElement(arr, n, element, position);
        sc.close();
}
}
