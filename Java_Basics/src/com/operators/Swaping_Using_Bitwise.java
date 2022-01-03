package com.operators;

import java.util.Scanner;

public class Swaping_Using_Bitwise {
	public static void main(String args[]){
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of A and B ");
		a=s.nextInt();
		b=s.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
