package com.mani.demo;

public class PowOfTen {

	public static void main(String[] args) {

		long s = 1002;
		boolean b = checkPowOf10(s);
		System.out.print(b);
	}

	private static boolean checkPowOf10(long s) {
		/*
		 * double x = Math.log10(s); double sm = x - (int) x;
		 * System.out.println(Math.log10(s)); if(sm==0.0) { //System.out.print(sm);
		 * return true;
		 * 
		 * }else return false;
		 */
		while (s % 10 == 0) {
			s = s / 10;
		}
		if (s == 1) {
			return true;
		} else
			return false;
	}

}
