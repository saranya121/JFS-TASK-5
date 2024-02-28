package advanceJava.task4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class AgeCalculatorApp {
	/**
	 * Parse String input to date
	 * 
	 * @param dateOfBirthStr
	 * @return
	 * @throws AgeException
	 */
	public LocalDate parseStringToDate(String dateOfBirthStr) throws AgeException {
		try {
			LocalDate parsedDate = LocalDate.parse(dateOfBirthStr);
			return parsedDate;
		} catch (DateTimeParseException e) {
			throw new AgeException("Please enter a valid date");
		}

	}

	/**
	 * To calculate age for the given input
	 * 
	 * @param parsedDate
	 */
	public void calculateAge(LocalDate parsedInputDate) {
		LocalDate currentDate = LocalDate.now();
		Period p = Period.between(parsedInputDate, currentDate);
		System.out.println(
				"Your Age is: " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days");

	}
}
