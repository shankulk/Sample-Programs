package com.shankulk.algos.searching;


/**
 * @author shankulk
 */
public class BinarySearch {
	
	/** primary requirement for binary search is to have sorted array. */
	static int[] intArr = {1, 5, 25, 34, 67, 88, 100};

	public static void main(String[] args) {
		System.out.println(binarySearch(1));
	}

	private static String binarySearch(int num) {
		
		int low = 0;
		int high = intArr.length;
		int mid = (low + high) / 2;
		String result = "Number not found.";
		
		while(low <= high) {
			if(intArr[mid] > num) {
				high = mid - 1;
				mid = (low + high) /2;
			} else if (intArr[mid] < num) {
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (intArr[mid] == num) {
				result = "Number " + num + " found at array location " + mid;
				break;
			}
		}
		
		return result;
	}
}
