package com.practice;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println(" not prime");
		}
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println("not prime");
			
		}
			else {
				System.out.println("prime");
			}
			}

	}
	}

