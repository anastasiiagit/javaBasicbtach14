package com.syntax.class09;

public class DZ {

	public static void main(String[] args) {
	//	for(int i=1; i<4; i++) {
	//		for(int j=0; j<=2; j++) {
	//			System.out.println("Hello");
	//			break;
	//		}
	//		System.out.println("Bye");
	//		
	//		boolean day=true;
	//		for(int i=1; i<=3; i++) {
	//			while(day) {
	//				System.out.println("Good Day");
	//		System.out.println(i);
      //       break;
	
		int[] a = new int[] {-14, 23, 9, -4, 12, -1};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				sum += a[i];
		} 
		if (sum == 0) 
			System.out.println("Нет цифер меньше 0");
		else
			System.out.println("sum = " + sum);
	}
}

//}
