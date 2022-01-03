package com.operators;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		double base,height;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the base and height");
		base=s.nextDouble();
		height=s.nextDouble();
		double area;
		area=(1f/2f)*(base*height);
		System.out.println("area of triangle is "+area);
		
	}

}
