package com.operators;

import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
		int a,b,c;
		double root_1,root_2;
		System.out.println("enter the values ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		root_1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
	    root_2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("Root one is"+root_1 +"Root second is "+root_2);
	}

}
