package com.syntax.class04;

public class Tren {

	public static void main(String[] args) {
		
		//Explicit/narrowing/Manual
        // As we can't fit 129 in byte we will get wrong results
        short largerBox=129; 
        byte smallerBox=(byte)largerBox;
        System.out.println(smallerBox);

        //Explicit/narrowing/Manual
        // As we can fit 129 in short we will get proper results
        int largerBox1=129; 
        short smallerBox2=(short)largerBox1;
        System.out.println(smallerBox2);
        
        
	
	
	}
	

}
