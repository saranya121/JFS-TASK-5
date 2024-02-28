package advanceJava.task2;

import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyString {
	/**
	 * Display List values
	 */
	public void displayList(List<String> list) {
		list.forEach(System.out::println);

	}

	/**
	 * Method to convert list of string to upper case
	 * 
	 * @param list
	 * @return
	 */
	public void getNonEmptyList(List<String> list) {
		System.out.println("Non-Empty Strings in the List:");
		list = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		displayList(list);
	}

}
