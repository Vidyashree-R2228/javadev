package com.practice;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int factorial=1;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			factorial*=i;
			
		}
		System.out.println(factorial);
	}

}
