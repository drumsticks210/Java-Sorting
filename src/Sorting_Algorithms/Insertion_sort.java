/* Algorithm:
    Take one element, compare with the one next to it and put in the order it 
    belongs to, thus forming a partially sorted list.
    Iterate through the list, one item at a time until no input elements remain.

Pseudo code is given below:

1
2
3
4
5

for i ← 1 to length(A)
j ← i
while j > 0 and A[j-1] > A[j]
swap A[j] and A[j-1]
j ← j - 1

Complexity:
    Best Case: O(n) – For already sorted list
    Average Case: O(n^2)
    Worst Case: O(n^2)

Notes / Usage:
    Insertion Sort is:
        Stable
        Takes O(1) extra space for swapping
        In-Place Sorting – No extra memory is required
        One real life usage of this kind of sorting is sorting a deck of cards. */

package Sorting_Algorithms;

import java.util.Arrays;

/**
 *
 * @author drums
 */
public class Insertion_sort {
    
    public static void main(String args[]) {
    int[] numberArray = { 5, 4, 7, 3, 3, 9, 0, 1, 2, 8, 6, -5 };
 
    sort(numberArray);
 
}
 
public static void sort(int[] numberArray) {
 
     System.out.println("Input Array: " + Arrays.toString(numberArray));
 
     for (int i = 1; i < numberArray.length; i++) {         
         for (int j = i; j > 0; j--) {
             // Start comparing data with adjacent one and swap if smaller
             if (numberArray[j] < numberArray[j - 1]) {
             swap(numberArray, j, j - 1);
         }
     }
}
 
System.out.println("Sorted Array: " + Arrays.toString(numberArray));
 
}
 
/**
* Swaps data from an array.
*/
private static void swap(int[] array, int firstIndex, int secondIndex) {
   if (array == null || firstIndex < 0 || firstIndex > array.length
     || secondIndex < 0 || secondIndex > array.length) {
    return;
   }
   int temp = array[firstIndex];
   array[firstIndex] = array[secondIndex];
   array[secondIndex] = temp;
 
}
 

}
