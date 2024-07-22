package com.practice;

public class greatest3 {

	public static void main(String[] args) {
		int num1=10,num2=5,num3=9,max;
		max=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("number1=" +num1 +"number2=" +num2 +"number3="+ num3 +"maximum="+ max);
	}

}
