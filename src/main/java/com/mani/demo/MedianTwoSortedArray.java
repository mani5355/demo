package com.mani.demo;

/*. Implement a function that takes in an array of non-negative numbers and an integer. 
 * You want to return the "LENGTH" of the shortest subarray whose sum is at least the integer and
 *  -1 if no such sum exists.*/
public class MedianTwoSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 8, 10, 15 };
		int[] arr2 = { 7, 11, 18, 19, 25 };

		float c = calculateMedian1(arr1, arr2);

		System.out.print("median : " + c);

	}

	/**
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static float calculateMedian1(int[] arr1, int[] arr2) {

		int l1 = arr1.length;
		int l2 = arr2.length;

		if (l1 > l2) {
			calculateMedian1(arr2, arr1);
		}

		int start = 0;
		int end = l1;
		while (start <= end) {

			int part1 = (start + end )/ 2; //5+3/2 = 4
			int part2 = (l1 + l2 + 1) / 2 - part1;  //=1

			int maxLeft1 = part1 == 0 ? Integer.MIN_VALUE : arr1[part1 - 1];
			System.out.println("maxLeft1  " +maxLeft1);

			int minRight1 = part1 == l1 ? Integer.MAX_VALUE : arr1[part1];

			int maxLeft2 = part2 == 0 ? Integer.MIN_VALUE : arr2[part2 - 1];
			int minRight2 = part2 == l2 ? Integer.MAX_VALUE : arr2[part2];
			System.out.println("minRight2  " +minRight2);


			if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {

				if ((l1 + l2) % 2 == 0) {
					return ((float) Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
				} else {
					return Math.max(maxLeft1, maxLeft1);
				}

			} else if (maxLeft1 > minRight2) {

				end = part1 - 1;

			} else {
				start = part1 + 1;

			}

		}

		return 0;
	}

}
