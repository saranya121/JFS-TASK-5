package advanceJava.task4;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public static void main(String a[]) throws AgeException {
		System.out.println("********Calculate Age********");
		/*
		 * Getting the input from the user
		 */
		System.out.println("Enter Your Birth Date(yyyy-mm-dd):");
		Scanner sc = new Scanner(System.in);
		String dateOfBirthStr = sc.next();
		try {
			AgeCalculatorApp ageCalculator = new AgeCalculatorApp();
			/*
			 * Parsing String to Date
			 */
			LocalDate parsedDate = ageCalculator.parseStringToDate(dateOfBirthStr);
			/*
			 * Calculating the age
			 */
			ageCalculator.calculateAge(parsedDate);
		} catch (DateTimeParseException e) {
			throw new AgeException(e.getMessage());
		}
	}
}
