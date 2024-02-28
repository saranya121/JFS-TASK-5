package advanceJava.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList();
		System.out.println("Enter the no of Student Names is to be added in the list:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			System.out.println("Enter the Student Name:");
			student.setStudentName(sc.next());
			studentList.add(student);
		}

		List<Student> newStudentList = studentList.stream()
				.filter(s -> s.getStudentName().startsWith("A") || s.getStudentName().startsWith("a"))
				.collect(Collectors.toList());
		if (!newStudentList.isEmpty()) {
			System.out.println("The Following is the student list whose name starts with 'A'");
			int i = 1;
			for (Student s : newStudentList) {
				System.out.println(i + "." + s.getStudentName());
				i++;
			}
		} else 
			System.out.println("There is no student name which starts with 'A'");
	}
}
