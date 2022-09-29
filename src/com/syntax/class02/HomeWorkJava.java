package com.syntax.class02;

public class HomeWorkJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1=5.5;
		double num2=2.25;
		
		double add=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
	
		System.out.println("The addition of 2 numbers" + num1 + "and" + num2 + " = " + add);
		System.out.println("The subtration of 2 numbers" + num1 + " and " + num2 + " = "+ sub);
		System.out.println("The multiplication of 2 numbers" + num1 + " and " + num2 + " = " + mult);
		System.out.println("The division of 2 numbers" + num1 + " and " + num2 + " = " + div);
		
		//part2
		
		double num3=3.9;
		double square=num3*num3;
		
		System.out.println("The square of the " + num3 + " is "+ square);
		
		//part3
		
		int a=5;
		int b=8;
		
		int p=2*(a+b);
		int s=a*b;
		
		System.out.println("The perimeter of a rectangle with width " + a +  " and height " + b + " is equal to " + p + " and the area is " + s);
				
	}

}