package com.practice;

public class palindrome {
	

	public static void main(String[] args) {
		int num=1221,rev=0,rem,temp;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		
		if(num==rev) {
			System.out.println(num+"its is palindrom");
		}
		else {
			System.out.println(num+"its not palendrom");
		}
		
	}

}
