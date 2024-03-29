package advanceJava.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonEmptyStringMain {
	public static void main(String[] args) {
		NonEmptyString nonEmptyStringObj = new NonEmptyString();
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		/*
		 * Get the no. of Strings to be added
		 */
		System.out.println("Enter the no of strings to be added in the list:");
		int n = sc.nextInt();
		/*
		 * Get the input from the user
		 */
		System.out.println("Enter the String:");
		for (int i = 0; i <= n; i++) {
			String inputString = sc.nextLine();
			list.add(inputString);
		}
		/*
		 * Displaying the added List
		 */
		System.out.println("Added String in the List:" + list);

		/*
		 * Checking whether list of string is empty or not and setting into another list
		 */
		nonEmptyStringObj.getNonEmptyList(list);
	}

}
