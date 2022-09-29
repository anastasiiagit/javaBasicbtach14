package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=8;
		String day="Sunday";
		/*
		 * it is called outer if condition if it is true then only inner conditions will be checked.
		 * if it is false noting from inner if-conditions will be executed. it is like the main door
		 * if main door is closed. we can't enter the building
		 */
		//other if-conditions
		if(day.equals("Manday")) {
			if (time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}

	}

}
