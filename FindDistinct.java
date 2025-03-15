package Array;

import java.util.Scanner;

public class FindDistinct {

	 // 7. Distinct elements in the array
    public static void findDistinct(int[] arr) {
        System.out.println("Distinct Elements:");
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(arr[i] + " ");
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
        
        findDistinct(arr);
        sc.close();
}

}
