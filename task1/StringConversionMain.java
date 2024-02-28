package advanceJava.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConversionMain {
	/**
	 * Main method
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		StringConversion stringConversionObj = new StringConversion();
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		/*
		 * Get the no. of Strings to be added
		 */
		System.out.println("Enter the no of strings to be added in the list:");
		int n = sc.nextInt();
		System.out.println("Enter the Strings:");
		/*
		 * Get the input from the user
		 */
		list = Stream.generate(sc::next).limit(n).collect(Collectors.toList());
		System.out.println("Added String in the List:");
		/*
		 * To display the added string in the list
		 */
		stringConversionObj.displayList(list);
		System.out.println("After changing the string in uppercase:");
		/*
		 * Converting the list of string in an array to upper case
		 */
		stringConversionObj.convertStringToUpperCase(list);
	}
}
