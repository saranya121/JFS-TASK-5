package advanceJava.task3;

public class Student {

	private String studentName;

	public Student(String studentId, String studentName) {
		super();
		this.studentName = studentName;
	}

	public Student() {
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
