package advanceJava.task3;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStudent {
	/**
	 * Filter the student names
	 * 
	 * @param studentList
	 */
	public void filterStudentNames(List<Student> studentList) {
		studentList = studentList.stream()
				.filter(s -> s.getStudentName().startsWith("A") || s.getStudentName().startsWith("a"))
				.collect(Collectors.toList());
		/*
		 * Check whether the list is empty or not.If it is empty, just sending message
		 * to the user. Else listing the filtered student list
		 */
		if (!studentList.isEmpty()) {
			System.out.println("The Following is the student list whose name starts with 'A'");
			studentList.forEach(s -> {
				System.out.println("* " + s.getStudentName());
			});
		} else
			System.out.println("There is no student name which starts with 'A'");
	}

}
