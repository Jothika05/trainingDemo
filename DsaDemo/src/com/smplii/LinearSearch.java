package com.smplii;


public class LinearSearch {

	public static void main(String[] args) {
		int arr[] =  {10,20,30,23, 40,50, 77};
		
		int key = 77;
		
		int positionOfTheKey = linearSearch(arr, key);
		
		if(positionOfTheKey != -1) {
			System.out.println(key + " was found in index position "+ positionOfTheKey);
		}else {
			System.out.println(key + " was not found");
		}

	}

	private static int linearSearch(int[] arr, int key) {
		
		for(int i = 0; i < arr.length; i++) {
			if (key == arr[i])
				return i;
		}
		
		return -1;		
	}

}