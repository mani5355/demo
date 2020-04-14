package com.mani.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequentIP {

	public static void main(String[] args) {

		String[] str = { "12", "13", "14", "15", "14", "15", "14", "20", "12", "13" };
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

		String ans1 = calcFIP(vec);
		System.out.println(ans1);
		
		System.out.println("ARRAY: ");
		String ans = calcFIP(str);
		System.out.println(ans);
		System.out.println("REDUCE: ");

		//ArrayList<Integer> arr = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14,16,18,20,2,4,6,8,10));
		//practiceStream(arr);

	}

	private static void practiceStream(ArrayList<Integer> arr) {
	    /**
	     * Returns a sequential {@code Stream} with this collection as its source.
	     *
	     * <p>This method should be overridden when the {@link #spliterator()}
	     * method cannot return a spliterator that is {@code IMMUTABLE},
	     * {@code CONCURRENT}, or <em>late-binding</em>. (See {@link #spliterator()}
	     * for details.)
	     *
	     * @implSpec
	     * The default implementation creates a sequential {@code Stream} from the
	     * collection's {@code Spliterator}.
	     *
	     * @return a sequential {@code Stream} over the elements in this collection
	     * @since 1.8
	     */
		 List<Integer> collect = arr.stream().filter(a-> a%2==0).collect(Collectors.toList());
		Integer reduce = arr.stream().filter(a-> a%2==0).reduce(10, (accumulator,i) -> accumulator+i);
		System.out.println(collect);
		
		HashMap<Integer, Integer> map = new HashMap();
		//Entry<Integer, Integer> entry = //
				Set<Entry<Integer, Integer>> entrySet = map.entrySet();
				int count =0;
			 List<Entry<Integer, Integer>> collect2 = entrySet.stream().filter(a -> a.getKey()%2==0).collect(Collectors.toList());
/*			 
			 .reduce(new HashSet<>(),(temp,a)->{
					if(temp.getValue()>a.getValue()) {
						
						return temp;
					}
					temp = a;
					return a;
				});*/
		System.out.println(collect2);
	}

	private static String calcFIP(Vector<String> vec) {

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
			System.out.print(set.getKey() + " " + set.getValue() + "\n");

		}
		return val;
	}

	private static String calcFIP(String[] str) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else
				map.put(str[i], 1);
		}

		int count = 0;
		String val = "";

		for (Entry<String, Integer> set : map.entrySet()) {

			if (set.getValue() > count) {
				count = set.getValue();
				val = set.getKey();
			}
			System.out.print(set.getKey() + " " + set.getValue() + "\n");

		}
		return val;
	}

}
