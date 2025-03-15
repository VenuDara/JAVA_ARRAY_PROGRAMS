package Array;

import java.util.Scanner;

public class BinarySearch {


	// 4. Binary Search
    public static void binarySearch(int[] arr, int key) {
        bubbleSort(arr); // Ensure the array is sorted
        int start = 0, end = arr.length - 1, mid;
        boolean found = false;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
    
    // 3. Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Bubble Sort):");
        displayArray(arr);
    }
    
 // Utility method to display an array
    public static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
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
        
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        binarySearch(arr, key);
        sc.close();
    }
}
