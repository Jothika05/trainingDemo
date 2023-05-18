package com.simpli;



	public class range{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = { 4, 45, 12, 3, 7, 11 };

			SparseTable sptable = new SparseTable(arr);

			int result = sptable.query(0, 3);
			
			System.out.println("sum for range query (0, 3): " + result);//64
			
			System.out.println("sum for range query (2, 4): " + sptable.query(2, 4));//22

		}

	}

	//1<<1 2 power 1 = 2
	//1<<2 2 pow 2 = 4
	//1<<3 2 pow 3 8
	class SparseTable {
		int[][] sparseTable;

		public SparseTable(int[] arr) {
			int n = arr.length;

			int noOfColumns = (int) (Math.log(n) / Math.log(2)) + 1;

			sparseTable = new int[n][noOfColumns];

			// Initialize the sparse table with the values from the input array
			for (int i = 0; i < n; i++)
				sparseTable[i][0] = arr[i];

			// Build remaining part of the sparse table
			for (int j = 1; (1 << j) <= n; j++) {
				for (int i = 0; i + (1 << j) - 1 < n; i++) {
					sparseTable[i][j] = sparseTable[i][j - 1] + sparseTable[i + (1 << (j - 1))][j - 1];
				}
			}

		}
		
		int query(int L, int R){
			
			int answer = 0;
			int k = 16;
			
			for (int j = k; j >= 0; j--) {
				if (L + (1 << j) - 1 <= R) {
					answer = answer + sparseTable[L][j];
					L += 1 << j;
				}
			};
			
			return answer;
			
		}

	}