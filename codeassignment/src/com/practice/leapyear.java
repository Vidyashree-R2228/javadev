package com.practice;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year % 400==0) {
			System.out.println("leap year");
		}
		else if(year % 4==0 && year % 100!=0) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("not leap");
		}
	}

}
