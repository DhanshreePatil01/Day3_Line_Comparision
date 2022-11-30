package com.Bridgelabz;

import java.util.Scanner;

public class LineCompare {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the value of x1 and y1: ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		
		System.out.print("Enter the value of x2 and y2: ");
		int x2=input.nextInt();
		int y2=input.nextInt();
		
		double length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of Line1 is: "+length1);
		
		System.out.print("Enter the value of x3 and y3: ");
		int x3=input.nextInt();
		int y3=input.nextInt();
		
		System.out.print("Enter the value of x4 and y4: ");
		int x4=input.nextInt();
		int y4=input.nextInt();
		
		double length2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		System.out.println("Length of Line2 is: "+length2);
		
		String line1=String.valueOf(length1);
		String line2=String.valueOf(length2);
		
		if(line1.equals(line2))
		{
			System.out.println("Two Lines are equal");
		}
		else 
		{
			System.out.println("Two Lines are not equal");
		}
	  }
	}