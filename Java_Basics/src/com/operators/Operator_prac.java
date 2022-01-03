package com.operators;

import java.util.Scanner;

public class Operator_prac {
	public static void main(String args[]) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a=s.nextInt();
		b=s.nextInt();
		//arithmatic operator
		System.out.println("arithmatic operator");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
	}

}
