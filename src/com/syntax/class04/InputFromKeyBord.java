package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBord {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that help
		 * it contains many different smaller modules called methods that can help
		 * us take Strings booleans basically all types of data from the keyboard
		 */
		Scanner input= new Scanner(System.in);
		// A message will be displayed to the console to enter his/her name	
		System.out.println("Please enter your name");
		//Activates the java program to take the input from the keyboard and store
		//it inside the name variable
		String name=input.next();
		name=input.next();
		//prints.whater name user enters on the keyboard on the console
		System.out.println("Hello"+name+ "don't be confused");
		

 }

}