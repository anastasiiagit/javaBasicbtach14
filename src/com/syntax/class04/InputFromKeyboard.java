package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Pleas enter any sentence");
		String sentence=scanner.nextLine();
		System.out.println(sentence);
		

	}

}
