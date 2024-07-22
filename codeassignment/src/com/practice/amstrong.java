package com.practice;
import java.lang.Math;
import java.util.Scanner;
public class amstrong {
	static boolean isAmstrong(int n) {
		
		int temp,last=0;
		int sum=0;
		temp=n;
		while(temp>0) {
		last=temp%10;
		sum+=(Math.pow(last,3));
		temp/=10;
		}
		if(n==sum) {
		return  true;
		}
		else
		{
		return false;	
		}
		 
		}
		


		


	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		if(isAmstrong(num)) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
		
		
	}
}
