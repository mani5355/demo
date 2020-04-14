package com.mani.demo;

public class KadaneAlgo {
	// Largest Sum Contiguous Subarray
	public static void main(String[] args) {

		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int sum = kadaneAlgo(arr);
		System.out.print(sum);
	}

	private static int kadaneAlgo(int[] arr) {

		int tempSum =0;
		int finalSum =0;
		
		for(int i =0; i< arr.length;i++) {
			
			tempSum = tempSum+arr[i];
			if(tempSum<0) {
				tempSum = 0;
			}
			 if(tempSum>finalSum) {
				finalSum = tempSum;
			}
		}

		return finalSum;
	}

}
