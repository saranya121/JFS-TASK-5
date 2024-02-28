package advanceJava.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterStudentMain {

	public static void main(String[] args) {
		FilterStudent obj = new FilterStudent();
		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList();
		/*
		 * Get count of student names
		 */
		System.out.println("Enter the no of Student Names is to be added in the list:");
		int n = sc.nextInt();
		/*
		 * Get the student name from the user
		 */
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			System.out.println("Enter the Student Name:");
			student.setStudentName(sc.next());
			studentList.add(student);
		}
		/*
		 * Filtering the student names whose name start with 'A' and assigning to
		 * newList
		 */
		obj.filterStudentNames(studentList);

	}
}
