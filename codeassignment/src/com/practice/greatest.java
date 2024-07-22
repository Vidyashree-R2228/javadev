package com.practice;
import java.util.Scanner;
public class greatest {

	public static void main(String[] args) {
		System.out.println("enetr the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enetr the number");
		Scanner sc1=new Scanner(System.in);
		int num1=sc.nextInt();
		if(num>num1) {
			System.out.println("number1 is greater");
		}
		else if(num1>num) {
			System.out.println("number2 is greater");
		}
		

	}

}
