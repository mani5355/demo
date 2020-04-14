package com.mani.demo.test;

public class Test {

	public static void main(String[] args) {

		// test kadane
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int res = findMaxSum(arr);

		System.out.println(res);

	}

	private static int findMaxSum(int[] arr) {

		int sum = 0;
		int maxSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (sum < 0) {
				sum = 0;
			}
			sum = sum + arr[i];

			if (maxSum < sum) {
				maxSum = sum;
			}

		}

		return maxSum;
	}

}
