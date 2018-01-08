package com.shankulk.algos.sorting;


/**
 * @author shankulk
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] unsortedArr = {1000, 55, 37, 94, 155, 8, 71, 560};
		
		int[] sortedArr = bubbleSort(unsortedArr);
		printArray(sortedArr);
	}

	private static void printArray(int[] sortedArr) {
		for(int a : sortedArr) {
			System.out.print(a);
			System.out.print(", ");
		}
	}
	
	private static int[] bubbleSort(int[] unsortedArr) {
		
		for(int i = 0; i < unsortedArr.length; i++) {
			for(int j = 0; j < (unsortedArr.length - i); j++) {
				if((j + 1) != (unsortedArr.length - i) && unsortedArr[j] > unsortedArr[j + 1]) {
					unsortedArr = swap(unsortedArr, j);
				}
			}
		}
		
		return unsortedArr;
	}

	private static int[] swap(int[] unsortedArr, int j) {
		int temp = unsortedArr[j];
		unsortedArr[j] = unsortedArr[j + 1];
		unsortedArr[j + 1] = temp;
		return unsortedArr;
	}

}
