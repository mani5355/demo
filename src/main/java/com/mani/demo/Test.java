package com.mani.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Vector;
import java.util.Map.Entry;

/*done---
 * ShortSubArray
 * ConvertString
 * kadane algo
 * median 
 * 
 * 
 * merge sort quick sort -> try by yourself-> 2 hours -> 12 to 2 -> explain
 * tree traversal -> explain -> 4-5
 * mashmap -> concurrent hashmap  -> exception handling-> 5-6 -> explain
 * dynamic programming -> ds -> 6-7 -> explain properly
 * practice all coding -> ip address (8) -> kadane algo (9) -> median (1) -> String manipulations (5)
 * 6-7 -> khana
 * 7-12 -> first part
 * 12 onwards -> second part
 * */
public class Test {

	public static void main(String[] args) {

		System.out.println("1. To find the first non-repeating character in a string ->");
		String str = "Priyadarshi Manisha";
		char ch = testQ1(str);

		System.out.println(ch == 0 ? "\t No non-repeating character found"
				: "\t First non-repeating character in " + str + " is: " + ch);
		System.out.println("############################################################");

		System.out.println("2. To find the most frequent IP address in a given vector ->");
		Vector<String> vec = new Vector();
		vec.add("12");
		vec.add("12");
		vec.add("18");
		vec.add("18");
		vec.add("18");
		vec.add("15");
		vec.add("15");
		vec.add("14");
		vec.add("15");
		vec.add("18");
		vec.add("16");
		vec.add("14");
		String ans1 = testQ2(vec);
		System.out.println("\t Most frequent IP address in a given vector: " + ans1);
		System.out.println("############################################################");

		System.out.println("3. Finding median of 2 sorted arrays ->");
		int[] first = { 1, 3, 8, 10, 15 };// { 2, 4, 7, 8, 10, 12 };
		int[] sec = { 7, 11, 18, 19, 25 };// { 3, 5, 9, 11, 16, 18 };
		float median = testQ3(first, sec);
		float median1 = testQ31(first, sec); // median : TEST- 1 - success in first attempt
		System.out.println("\t TEST######### Median of 2 sorted arrays is: " + median1);

		System.out.println("\t Median of 2 sorted arrays is: " + median);
		System.out.println("############################################################");

		System.out.println(
				"4. String was given and he had to write the function to find the min distance between the mid element of two words ->");
		String str1 = "book word geek and so many book so and";
		int minDis = testQ4(str1, "book", "so");
		System.out.println("\t Min distance between the mid element of two words: " + minDis);
		System.out.println("############################################################");
		/*
		 * Given a string which we have to convert into integer. The string can be in
		 * form of either positive, negative, Alphabetical or special characters. –
		 * (atoi function)
		 */
		System.out.println(
				"5. Given a string which we have to convert into integer. The string can be in form of either positive, negative, Alphabetical or special characters. (atoi function) ->");
		String str2 = "-145book word geek and98 so many book88 so and";
		int num = testQ5(str2);
		System.out.println("\t ATIO of '" + str2 + "' :" + num);
		System.out.println("############################################################");

		/*
		 * Find minimum element in sorted rotated array. The time complexity should be O
		 * (logn).
		 */

		System.out.println("6. Find minimum element in sorted rotated array ->");
		int[] numArr = { 17, 18, 19, 20, 40, 49, 1 };

		int minEl = testQ6(numArr);
		int minEl1 = testQ61(numArr);// PRACTICE AGAIN
		System.out.println("\t TEST#### Minimum element in sorted rotated array: " + minEl1);

		System.out.println("\t  Minimum element in sorted rotated array: " + minEl);
		System.out.println("############################################################");

		/*
		 * Find maximum average from a list in which the marks obtained of a student can
		 * be positive or negative and a student may have multiple marks.
		 */
		System.out.println(
				"7. Find maximum average from a list in which the marks obtained of a student can be positive or negative and a student may have multiple marks ->");

		String[][] arr = { { " Charles", "84" }, { "John", "100" }, { "Andy", "67" }, { "John", "22" } };

		int maxAvg = testQ7(arr);
		System.out.println("\t  Maximum average from a list: " + maxAvg);

		/*
		 * Merge Sort
		 */
		System.out.println("7. Merge Sort");
		int[] num3 = { 10, 9, 7, 3, 1, 15 };
		testQ8(num3);

		/* convert this string (aabbb into a2b3) , (aaaa into a4), (a into a1). */

		String str3 = "aabbccaagggggl";

		int count;
		String res = "";
		for (int i = 0; i < str3.length(); i++) {

			for (count = 1; i < str3.length() - 1 && str3.charAt(i) == str3.charAt(i + 1); i++, count++)
				;
			res = res + str3.charAt(i) + count;
		}
		System.out.print("convert string: " + res);
	}

	private static int testQ61(int[] numArr) {
//18 { 17,18,19,20,40,49,1 };

		if (numArr == null || numArr.length == 0)
			return 0;
		if (numArr[0] == 18)
			return numArr[0];

		int low = 0;
		int high = numArr.length;

		while (low < high) {
			int mid = (low + high + 1) / 2;
			if (numArr[mid] == 18) {
				return numArr[mid];
			}
			if (numArr[mid] > 18 && numArr[numArr.length - 1] < 18) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return 0;
	}

	private static float testQ31(int[] first, int[] sec) {

		int l1 = first.length;
		int l2 = sec.length;

		int midPoint = (l1 + l2 + 1) / 2;

		int low = 0;
		int high = l1;

		while (low < high) {

			int mid1 = (low + high) / 2;
			int mid2 = midPoint - mid1;

			int left1 = mid1 == 0 ? Integer.MIN_VALUE : first[mid1 - 1];
			int right1 = mid1 == l1 ? Integer.MAX_VALUE : first[mid1];

			int left2 = mid2 == 0 ? Integer.MIN_VALUE : sec[mid2 - 1];
			int right2 = mid2 == l2 ? Integer.MAX_VALUE : sec[mid2];

			if (left1 <= right2 && left2 <= right1) {

				if ((l1 + l2) % 2 == 0) {
					return ((float) Math.max(left1, left2) + Math.min(right1, right2)) / 2;
				} else {
					return Math.max(left1, left2);
				}
			} else if (left1 > right2) {
				high = mid1 - 1;
			} else {
				low = mid1 + 1;
			}

		}

		return 0;
	}

	private static void testQ8(int[] num3) {

		testQ8(num3, 0, num3.length - 1);
		System.out.println("\t  Merge sort : ");
		for (int i : num3) {

			System.out.print(i + " ");
		}

	}

	private static void testQ8(int[] num3, int start, int end) {

		int mid = (start + end) / 2;

		if (start >= end) {
			return;
		}

		testQ8(num3, start, mid);

		testQ8(num3, mid + 1, end);

		sort(num3, start, mid, end);

	}

	private static void sort(int[] num3, int start, int mid, int end) {

		int[] test1 = new int[mid - start + 1];
		int[] test2 = new int[end - mid];
		int l = start;

		int count = 0;
		while (count < test1.length) {
			test1[count] = num3[start];
			count++;
			start++;
		}

		count = 0;
		while (count < test2.length) {
			test2[count] = num3[start];
			count++;
			start++;
		}

		int i = 0;
		int j = 0;
		while (i < test1.length && j < test2.length) {

			if (test1[i] >= test2[j]) {
				num3[l] = test2[j];
				j++;
			} else {
				num3[l] = test1[i];
				i++;
			}
			l++;

		}

		while (i < test1.length) {
			num3[l] = test1[i];
			l++;
			i++;
		}

		while (j < test2.length) {
			num3[l] = test2[j];
			l++;
			j++;
		}

	}

	private static int testQ7(String[][] arr) {

		HashMap<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i][0])) {
				List<Integer> list = map.get(arr[i][0]);
				list.add(Integer.parseInt(arr[i][1]));
				map.put(arr[i][0], list);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(Integer.parseInt(arr[i][1]));
				map.put(arr[i][0], list);
			}
		}

		int maxAvg = 0;
		for (Entry<String, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			int sum = list.stream().reduce(0, (a, i) -> a + i);
			int avg = sum / list.size();
			if (avg > maxAvg) {
				maxAvg = avg;
			}
		}
		return maxAvg;
	}

	private static int testQ6(int[] numArr) {

		if (numArr == null || numArr.length == 0) {
			return 0;
		}
		if (numArr.length == 1) {
			return numArr[0];
		}

		int low = 0;
		int high = numArr.length;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (mid > 0 && numArr[mid] < numArr[mid - 1]) {
				return numArr[mid];
			} else if (mid > 0 && numArr[mid] > numArr[mid - 1] && numArr[mid] > numArr[numArr.length - 1]) {
				low = mid + 1;
			} else
				high = mid - 1;

		}
		return numArr[0];
	}

	private static int testQ5(String str) {

		if (str == null || str.length() <= 0) {
			return 0;
		}
		str = str.trim();

		boolean flag = true;
		char[] ch = str.toCharArray();
		if (ch[0] == '-') {
			flag = false;
		}

		double d = 0.0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= '0' && ch[i] <= '9') {
				System.out.println((int) ch[i]);

				d = d * 10 + (ch[i] - '0');
			}
		}

		if (!flag) {
			d = -d;
		}
		// TODO: add check to max and min integer...
		return (int) d;
	}

	private static int testQ4(String str1, String start, String end) {

		if (start.equals(end)) {
			return 0;
		}
		String[] str = str1.split(" ");

		int min = str.length + 1;
		int in = str.length + 1;
		int out = str.length + 1;

		for (int i = 0; i < str.length; i++) {

			if (str[i].equals(start)) {
				in = i;
			}
			if (str[i].equals(end)) {
				out = i;
			}
			if (in != out && min > Math.abs(in - out) - 1) {
				min = Math.abs(in - out) - 1;
			}

		}

		return min;
	}

	private static String testQ2(Vector<String> vec) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < vec.size(); i++) {

			if (map.containsKey(vec.get(i))) {
				map.put(vec.get(i), map.get(vec.get(i)) + 1);
			} else
				map.put(vec.get(i), 1);
		}

		int count = 0;
		String val = "";

		for (Entry<String, Integer> set : map.entrySet()) {

			if (set.getValue() > count) {
				count = set.getValue();
				val = set.getKey();
			}

		}
		return val;
	}

	private static float testQ3(int[] first, int[] sec) {
		int l1 = first.length;
		int l2 = sec.length;
		if (l1 > l2) {
			testQ3(sec, first);
		}
		int low = 0;
		int high = l1;
		while (low <= high) {
			int mid1 = (low + high) / 2;
			int mid2 = (l1 + l2 + 1) / 2 - mid1;

			int firstLeft = mid1 == 0 ? Integer.MIN_VALUE : first[mid1 - 1];
			int firstRight = mid1 == l1 ? Integer.MAX_VALUE : first[mid1];

			int secLeft = mid2 == 0 ? Integer.MIN_VALUE : sec[mid2 - 1];
			int secRight = mid2 == l2 ? Integer.MAX_VALUE : sec[mid2];

			if (firstLeft <= secRight && firstRight >= secLeft) {
				if ((l1 + l2) % 2 == 0) {
					return ((float) Math.max(firstLeft, secLeft) + Math.min(firstRight, secRight)) / 2;
				} else {
					return Math.max(firstLeft, secLeft);
				}
			} else if (firstLeft > secRight) {
				high = mid1 - 1;
			} else {
				low = mid1 + 1;
			}
		}
		return 0;
	}

	private static char testQ1(String str) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i)) + 1;
				map.put(str.charAt(i), count);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
