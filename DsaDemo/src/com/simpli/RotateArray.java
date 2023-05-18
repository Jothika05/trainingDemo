package com.simpli;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {2,17,6,9,12,24};
		
		int k = 2;
		
		System.out.println("ORIGINAL ARRAY : "+ Arrays.toString(arr));
		
		int[] resultArray = rotateArrayByKPosition(arr, k);
		
		System.out.println("ROTATED ARRAY : "+ Arrays.toString(resultArray));
	}

	private static int[] rotateArrayByKPosition(int[] arr, int k) {
		int n = arr.length;
		
		if(k > n)
			k = k % n;
		
		// initilalise the result array
		int[] result = new int[arr.length];
		
		// Take the elements from the Kth position
		// of the original array
		// and put them at the start of the result array
		for (int i=0; i < k; i++)
			result[i]= arr[n-k+i];
		
		//System.out.println(Arrays.toString(result));
		
		// Fill the rest of the result array
		// picking up elements from the start of original array
		int j=0;
		for(int i=k ; i<n; i++)
			result[i]= arr[j++];
		
		return result;
		
		//System.out.println(Arrays.toString(result));
		
		
		
	}
}