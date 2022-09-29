package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Pleas Enter your name");
		String name=scanner.nextLine();
		System.out.println("Pleas Enter your age");
		int age=scanner.nextInt();
		System.out.println("Hi " + name+ " you are "+age+ " years old ");
		
	}

}
