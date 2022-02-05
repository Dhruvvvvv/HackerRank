
package practice.java.introduct;
// Java program for the above approach
import java.time.LocalDate;
import java.util.*;

public class GetCalendarDay {

	// Driver Code
	public static void main(String args[]) {
		// Creating a calendar object
		Calendar cal = new GregorianCalendar(2020, 07, 18);

		// Getting the values of day,
		// month, and year from calendar
		// object
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		String string = LocalDate.of(2015, 8, 5).getDayOfWeek().name();

		System.out.println("Day of week:: " + string);

		int firstDayOfWeek = cal.getFirstDayOfWeek();
		System.out.println(firstDayOfWeek);
		// Printing the day, month, and year
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
}
