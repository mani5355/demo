package com.mani.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxAvg {
	public static void main(String[] args) {
		String[][] arr = { { "Bob", "87" }, { "Mike", "35" }, { "Bob", "52" }, { "Jason", "35" }, { "Mike", "55" },
				{ "Jessica", "99" } };

		int str = avgMax(arr);

		System.out.println(str);

	}

	private static int avgMax(String[][] arr) {

		HashMap<String, ArrayList<Integer>> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i][0])) {
				ArrayList<Integer> al = hm.get(arr[i][0]);
				al.add(Integer.parseInt(arr[i][1]));
				hm.put(arr[i][0], al);
			} else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(Integer.parseInt(arr[i][1]));
				hm.put(arr[i][0], al);
			}

		}
		int avg = 0;
		for (Map.Entry<String, ArrayList<Integer>> set : hm.entrySet()) {

			ArrayList<Integer> al = set.getValue();
			int sum = 0;
			int count = 0;
			for (int val : al) {
				sum = sum + val;
				count++;
			}
			if (sum / count > avg) {
				avg = sum / count;
			}

		}
		return avg;
	}

}