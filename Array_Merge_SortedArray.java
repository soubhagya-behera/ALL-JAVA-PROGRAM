import java.util.*;

public class Array_Merge_SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 1st array
        System.out.print("Enter the no. of elements of the 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the 1st array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Take input for 2nd array
        System.out.print("Enter the no. of elements of the 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the 2nd array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Call merge() and store the returned merged array
        int[] mergedArr = merge(arr1, arr2);

        // Print the merged array
        System.out.println("\nMerged Array:");
        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }

    // Method to merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        // ✅ Return the merged array
        return newArr;
    }
}
