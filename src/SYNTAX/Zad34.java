package SYNTAX;

import java.util.Scanner;

public class Zad34 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		System.out.println("Please enter number 1");
		int num1=scanner.nextInt();
		System.out.println("Please enter number 2");
		int num2=scanner.nextInt();
		System.out.println("Please enter number 3");
		int num3=scanner.nextInt();
		
		if ((num1>num2) && (num1> num3)) {
		   System.out.println("The largest number is " + num1);}
		if ((num2>num1) && (num2> num3)) {
			System.out.println("The largest number is " + num2);}	
		if ((num3>num2) && (num3> num1)) {
			System.out.println("The largest number is " + num3);}	


	}
//System.out.println("Please enter 3 distinct numbers");
}
