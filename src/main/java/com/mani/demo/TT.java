package com.mani.demo;

public class TT {

	public static void main(String[] args) {
		BS bs = new BS();
		bs.hd = new Nod(1);
		bs.hd.next = new Nod(2);
		bs.hd.pre = new Nod(3);
		bs.hd.next.next = new Nod(4);
		bs.hd.next.pre = new Nod(5);
		bs.hd.pre.next = new Nod(6);
		bs.hd.pre.pre = new Nod(7);
		bs.hd.pre.next.next = new Nod(8);

		System.out.println("PRE ORDER: ");
		bs.preOrd();
		
		System.out.println("\n\nPOST ORDER: ");
		bs.postOrd();
		
		System.out.println("\n\nIN ORDER: ");
		bs.inOrd();

	}

}

class BS {

	Nod hd;

	BS() {
		hd = null;
	}

	public void preOrd() {
		preOrd(hd);
	}

	private void preOrd(Nod hd) {

		if (hd == null) {
			return;
		}
		System.out.print(hd.val + " ");
		preOrd(hd.pre);
		preOrd(hd.next);

	}

	public void postOrd() {
		postOrd(hd);
	}

	private void postOrd(Nod hd) {

		if (hd == null) {
			return;
		}
		postOrd(hd.pre);
		postOrd(hd.next);
		System.out.print(hd.val + " ");

	}

	public void inOrd() {
		inOrd(hd);
	}

	private void inOrd(Nod hd) {

		if (hd == null) {
			return;
		}
		inOrd(hd.pre);
		System.out.print(hd.val + " ");

		inOrd(hd.next);

	}

}

class Nod {

	int val;
	Nod pre;
	Nod next;

	public Nod(int val) {
		this.val = val;
		pre = next = null;
	}

}
