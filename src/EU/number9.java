package EU;

public class number9 {

	public static void main(String[] args) {

		 int[] arr = { 1, 2, 25, 4, 5, 6 };

	        int maxNum = arr[0];
	        int minNum = arr[0];

	        for (int i = 0; i < arr.length; i++) {

	            if (maxNum < arr[i])
	                maxNum = arr[i];

	            if (minNum > arr[i])
	                minNum = arr[i];

	        }
	        System.out.println("The maximum number is " + maxNum);
	        System.out.println("The minimum number is " + minNum);

	    }

	}
