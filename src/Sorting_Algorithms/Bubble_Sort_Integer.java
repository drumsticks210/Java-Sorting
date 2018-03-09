//Bubble Sort Definition:
//    Bubble sort is a simple sorting algorithm that works by repeatedly stepping 
//    through the list to be sorted, comparing each pair of adjacent items and 
//    swapping them if they are in the wrong order. The pass through the list is 
//    repeated until no swaps are needed, which indicates that the list is sorted.
//    Complexity:
//
//    Worst Case: O(n^2) – reverse ordered list
//    Best Case: O(n) – fully sorted list
//
//Note:
//    Bubble Sort is not a good solution if you have a large number of items to 
//    be sorted. This is due to the time Complexity. Bubble Sort can however be 
//    used to quickly find if a list is already sorted. Below is my java 
//    implementation of Bubble Sort algorithm. I have provided methods to do 
//    sorting in both ascending and descending order. This program sorts an 
//    integer array, although it can also be extended to do sorting for doubles 
//    and floats.
   

package Sorting_Algorithms;

public class Bubble_Sort_Integer {

    public static void main(String[] args) {
 
        int[] unsortedArray = { 6, 5, 2, 5, 6, 3, 4, 2, 7, 8, 9, 0 };
        printArray("Unsorted Array:", unsortedArray);
 
        int[] sortedArray = bubbleSortAscending(unsortedArray);
 
        printArray("Sorted Array (Ascending):", sortedArray);
 
        sortedArray = bubbleSortDescending(unsortedArray);
 
        printArray("Sorted Array (Descending):", sortedArray);
 
    }
 
    private static int[] bubbleSortDescending(int[] unsortedArray) {
 
        for (int index = unsortedArray.length - 1; index > 0; index--) {
            for (int bubbleIndex = 0; bubbleIndex < index; bubbleIndex++) {
 
                if (unsortedArray[index] > unsortedArray[bubbleIndex]) {
                    swap(unsortedArray, index, bubbleIndex);
                }
 
            }
        }
 
        return unsortedArray; // which is now sorted
    }
 
    private static int[] bubbleSortAscending(int[] unsortedArray) {
 
        for (int index = unsortedArray.length - 1; index > 0; index--) {
            for (int bubbleIndex = 0; bubbleIndex < index; bubbleIndex++) {
 
                if (unsortedArray[index] < unsortedArray[bubbleIndex]) {
                    swap(unsortedArray, index, bubbleIndex);
                }
 
            }
        }
 
        return unsortedArray; // which is now sorted
    }
 
    private static void swap(int[] unsortedArray, int firstIndex, int secondIndex) {
        if (unsortedArray == null || firstIndex < 0 || firstIndex > unsortedArray.length
                || secondIndex < 0 || secondIndex > unsortedArray.length) {
            return;
        }
        int tempInteger = unsortedArray[firstIndex];
        unsortedArray[firstIndex] = unsortedArray[secondIndex];
        unsortedArray[secondIndex] = tempInteger;
 
    }
 
    private static void printArray(String string, int[] array) {
 
        if (array != null && array.length > 0) {
            System.out.print(string + " ");
            for (int i = 0; i < array.length; i++) {
                System.out.print((i > 0 ? "," : "") + array[i]);
            }
        }
 
        System.out.println();
 
    }
 
}
    
    

