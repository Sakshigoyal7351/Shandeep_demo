package com;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		String b= "hi this is first java code!\n"
		+"this is second java code\n"
				+"this ios third line \n";
		
		Scanner sc= new Scanner(b);
		
		System.out.println("first :"+sc.next());
		System.out.println("second :"+sc.next());
		System.out.println("third :"+sc.next());
		
//		System.out.println("first"+sc.next());
//		System.out.println("second"+sc.next());
//		System.out.println("third"+sc.next());

		sc.close();
	}

}
