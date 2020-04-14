package com.mani.demo;

public class ConvertString {

	public static void main(String[] args) {
		System.out.println(convertString("aaabbbggyyyyyddddttttqqqaa"));
	}

	private static String convertString(String str) {
		int count;
		String res ="";
		for(int i=0;i<str.length();i++) {
			for(count = 1;i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ;i++,count++);
			res = res + str.charAt(i)+String.valueOf(count);
		}
		return res;
	}

}
/*LinkedHashMap<Character, Integer> tempMap = new LinkedHashMap<Character, Integer>();

for (int i = 0; i < str.length(); i++) {

	if (tempMap.containsKey(str.charAt(i))) {
		tempMap.put(str.charAt(i), tempMap.get(str.charAt(i)) + 1);
	} else {
		tempMap.put(str.charAt(i), 1);
	}
}

String ans = "";
for (Entry<Character, Integer> s : tempMap.entrySet()) {

	ans = ans.concat(s.getKey().toString()).concat(s.getValue().toString());
}*/