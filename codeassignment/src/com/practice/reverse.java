package com.practice;

public class reverse {
	static int reverse1(int num) {
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
	}
		return rev;

	}

	public static void main(String[] args) {
		int num=123;
		System.out.println("reversed number:"+reverse1(123));
	}

}