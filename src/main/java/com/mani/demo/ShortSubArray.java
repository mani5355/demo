package com.mani.demo;

/*. Implement a function that takes in an array of non-negative numbers and an integer. 
 * You want to return the "LENGTH" of the shortest subarray whose sum is at least the integer and
 *  -1 if no such sum exists.*/
public class ShortSubArray {

	public static void main(String[] args) {

		int[] intArr = { 1, 12, 100, 1, 0, 200, 3, 2, 1, 250 };
		int b = shortSubArray(intArr, 300);
		int c = shortSubArrayMinT(intArr, 12);

		System.out.print("first" + b);
		System.out.print("Second" + c);

	}

	private static int shortSubArrayMinT(int[] intArr, int num) {

		int length = intArr.length;
		int result = length + 1;

		for (int i = 0; i < length; i++) {

			if (intArr[i] >= num) {
				return 1;
			}
			int count = 0;
			int sum = 0;

			for (int j = i; j < length; j++) {
				sum = sum + intArr[j];
				count++;
				if (sum >= num && count < result) {
					result = count;
					break;
				}
			}
		}

		return result == length + 1 ? 0 : result;
	}

	private static int shortSubArray(int[] intArr, int s) {

		int inCount = intArr.length + 1;
		for (int i = 0; i < intArr.length; i++) {
			int sum = intArr[i];
			if (sum >= s) {
				return 1;
			}
			int count = 1;
			for (int j = i + 1; j < intArr.length; j++) {

				sum = sum + intArr[j];
				count++;
				if (sum > s && count < inCount) {
					inCount = count;
					break;
				}
			}
		}
		return inCount != intArr.length + 1 ? inCount : -1;
	}

}
