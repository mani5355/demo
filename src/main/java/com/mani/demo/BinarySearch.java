package com.mani.demo;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {1,2,4,6,7,8,9,14,17,21,22,23,24};
		System.out.println(find(arr, 23));
	}

	private static int find(int[] arr, int num) {


		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high+1)/2;
			
			if(arr[mid]==num) {
				return mid;
			}else if(arr[mid]>num) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}


}
