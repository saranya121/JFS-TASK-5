package advanceJava.task1;

import java.util.List;
import java.util.stream.Collectors;

public class StringConversion {
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
	public void convertStringToUpperCase(List<String> list) {
		System.out.println("Non-Empty Strings in the List:");
		list = list.stream().map(s -> s.toString().toUpperCase()).collect(Collectors.toList());
		displayList(list);
	}

}
