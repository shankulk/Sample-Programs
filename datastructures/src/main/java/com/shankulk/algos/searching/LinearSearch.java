package com.shankulk.algos.searching;


/**
 * @author shankulk
 */
public class LinearSearch {
	
	static int[] intArr = {1, 5, 100, 25, 67, 88, 34};

	public static void main(String[] args) {
		System.out.println(linearSearch(100));
	}

	public static String linearSearch(int num) {
		for(int i = 0; i <  intArr.length; i++) {
			if(intArr[i] == num) {
				return num + " found at array location " + i;
			}
		}
		
		return "Number " + num + " not found.";
	}
}
