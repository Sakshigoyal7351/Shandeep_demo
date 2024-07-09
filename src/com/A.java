package com;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		String x;
		System.out.println("enter the name : ");
		x=in.next();
		
		int eng;
		System.out.println("enter english marks :");
		eng=in.nextInt();
		
		int maths;
		System.out.println("enter maths marks :");
		maths=in.nextInt();
		
		int science;
		System.out.println("enter science marks :");
		science=in.nextInt();
		
		int sst;
		System.out.println("enter sst marks :");
		sst=in.nextInt();
		
		int comp;
		System.out.println("enter computer marks :");
		comp=in.nextInt();
		
		int sum;
		
		sum= eng+maths+science+sst+comp;
		System.out.println(x);
		System.out.println("sum of subjects are : "+sum);
		
		double per;
		
		per= sum/5;
		
		System.out.println("percentage is : "+per);
		
		

	}

}
