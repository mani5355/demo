package com.mani.demo;

public class SmallesttElmntinSortedRotated {

	public static void main(String[] args) {

		int[] arr = { 2,1};
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		if(high == 0) {
			return arr[0];
		}
		
		while (low < high) {

			int mid = (low + high + 1) / 2;

			if (mid < high && arr[mid] > arr[mid + 1]) {
				return arr[mid + 1];
			} else if (mid > low && arr[mid] < arr[mid - 1]) {
				return arr[mid];
			} else if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return arr[low];
	}

}
