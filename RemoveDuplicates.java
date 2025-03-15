package Array;

import java.util.Scanner;

public class RemoveDuplicates {

	// 8. Remove duplicates in the array
    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        System.out.println("Array without duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
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
        
        removeDuplicates(arr);
        sc.close();
}
}
