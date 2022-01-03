package com.basics_java;

import java.util.Scanner;

public class ReadingFromKeyborad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner s=new Scanner(System.in);
	     System.out.println("take in put");
	     int a=s.nextInt();
	     float b=s.nextFloat();
	     String s1=s.next();
	     long l=s.nextLong();
	     double d=s.nextDouble();
	     byte by=s.nextByte();
        System.out.println(a);
        System.out.println(b);
        System.out.println(s1);
        System.out.println(l);
        System.out.println(d);
        System.out.println(by);

	}

}
