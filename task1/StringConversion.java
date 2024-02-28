package advanceJava.task1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConversion {
	public static void main(String a[]) {
		/*
		 * Get the no. of Strings to be added
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings to be added in the list:");
		int n = sc.nextInt();
		String[] inputString = new String[n];
		/*
		 * Get the input from the user
		 */
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the String" + (i + 1) + ":");
			inputString[i] = sc.next();
		}
		/*
		 * Setting the array of string to Stream class
		 */
		Stream<String> st = Stream.of(inputString);
		System.out.println("After changing the string in uppercase:");
		/*
		 * Converting the list of string in an array to uppercase
		 */
		System.out.println(st.map(s -> s.toString().toUpperCase()).collect(Collectors.toList()));

	}

}
