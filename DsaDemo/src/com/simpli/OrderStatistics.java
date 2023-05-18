package com.simpli;

import java.util.Arrays;

public class OrderStatistics {

	public static void main(String[] args) {
		// ASSUMPTION = values are unique.
		
		int[] arr = {2 ,6, 15, 12, 7, 64, 41};
		
		int k = 3;
		
		int result = findKtheSmallest(arr,k);
		System.out.println(k + "th smallest is "+result);
		System.out.println(k + "th smallest is of "+ Arrays.toString(arr) + " is "+ result);
	}

	private static int findKtheSmallest(int[] arr, int k) {
		if (arr == null || arr.length < k)
			throw new IllegalArgumentException("Invalid input");
		
		return quickselect(arr, 0, arr.length-1, k-1);
		
	}

	private static int  quickselect(int[] arr, int left, int right, int k) {
		// Base case
		if(left == right)
			return arr[left];
		
		
		// Recursive case
		int pivotIndex = partition(arr, left, right);
		
		if (k == pivotIndex)
			return arr[k];
		
		if (k < pivotIndex)
			return quickselect(arr, left, pivotIndex-1, k);
		else
			return quickselect(arr, pivotIndex+1, right, k);
		
	}
	private static int partition(int[] arr, int left, int right) {
		int pivotValue = arr[right];
		int pivotIndex = 0;
		
		for(int i=0; i<right; i++) {
			if(arr[i] < pivotValue) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		};
		
		swap(arr, pivotIndex, right);		
		
		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

	


}