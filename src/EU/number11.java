package EU;

public class number11 {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6
        String[] names = { "Jane", "Anastasiia", "Guljan", "Judith", "Diana", "Diana", "Guljan", "Adem", "Ruslan",
                "Ruslan" };// the number of elements

        for (int i = 0; i < names.length; i++)//
        {
            for (int j = i + 1; j < names.length; j++) {
                if ((names[i].equals(names[j])))

                    System.out.println("Duplicate Element is : " + names[j]);
               
            }
        }
    }

}
