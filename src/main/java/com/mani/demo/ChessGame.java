package com.mani.demo;

public class ChessGame {
	// String was given and he had to write the function to find the min distance
	// between the mid element of two words.
	/* package whatever //do not write package name here */

	public static void main(String[] args) {

		String str = "the quick the brown quick brown the frog";
		int a = findMin(str, "quick", "frog");
		System.out.print(a);
	}

	static int findMin(String str, String one, String two) {
		if (one.equals(two)) {
			return 0;
		}
		String[] temp = str.split(" ");
		int a = temp.length + 1;
		int b = temp.length + 1;
		int min = temp.length + 1;
		for (int i = 0; i < temp.length; i++) {

			if (temp[i].equals(one)) {
				a = i;
			}
			if (temp[i].equals(two)) {
				b = i;
			}
			// System.out.print(" abs : "+Math.abs(a-b));

			if (a != b && min > Math.abs(a - b) - 1) {
				min = Math.abs(a - b) - 1;
				// System.out.print(" min : "+min);
			}

		}

		return min;

	}
}