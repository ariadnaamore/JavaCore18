/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */

package homework1.exception;

import java.util.Scanner;

/*
 * Month enumeration:
 */
public enum Month {
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULLY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL), OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);

	public int day;
	public Seasons season;

	// Class constructor:
	private Month(int day, Seasons season) {
		this.day = day;
		this.season = season;
	}

//Method for get the days of the month:
	public int getDay() {
		return day;
	}

//Method for get the season of the month:
	public Seasons getSeason() {
		return season;
	}

	/*
	 * Menu for the application
	 */
	static void menu() {
		System.out.println("Press 1 for show the name of month ");
		System.out.println("Press 2 for show all months of this season: ");
		System.out.println("Press 3 for show all months that have same quantity of days: ");
		System.out.println("Press 4 for show all months that have less days:");
		System.out.println("Press 5 for show all months that have more days:");
		System.out.println("Press 6 for show next season");
		System.out.println("Press 7 for show previous season");
		System.out.println("Press 8 for show all months have even number of days");
		System.out.println("Press 9 for show all months have odd number of days");
		System.out.println("Press 10 show if entered month have even number of days");

	}

//Method for Scanner Enter Month:
	public static String nameOfMonth() {
		System.out.println("Enter month: ");
		Scanner sc = new Scanner(System.in);
		String monthScan = sc.next().toUpperCase();
		return monthScan;
	}

	// Method for 1 case "Show the name of month":
	public static void showTheMonth() {
		Month[] mon = Month.values();
		String monthScan = nameOfMonth();
		try {
			validateMonthName(monthScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}
		for (Month m : mon) {
			if (m.name().equalsIgnoreCase(monthScan)) {
				System.out.println(m + "This month exist!");
			}
		}
	}
//Method for case3 show all months that have same quantity of days:

	public static void sameQuantityOfDays() {
		Month[] mon = Month.values();
		String monthScan = nameOfMonth();
		try {
			validateMonthName(monthScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}
		checkDaysInMonth(mon, monthScan);
		System.out.println("All month with same day quantity: ");
		Month mond = Month.valueOf(monthScan);
		for (Month md : mon) {
			if (md.getDay() == mond.getDay()) {
				System.out.println(md.name());
			}
		}
	}

	/*
	 * Method for case 4 - show all months that have less days:
	 */
	public static void lessDaysMonths() {
		Month[] mon = Month.values();
		String monthScan = nameOfMonth();
		try {
			validateMonthName(monthScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {

			return;
		}
		checkDaysInMonth(mon, monthScan);
		System.out.println("Months that have less days are: ");
		Month mondLess = Month.valueOf(monthScan);
		for (Month md : mon) {
			if ((mondLess.getDay() - md.getDay()) >= 1) {
				System.out.println(md.name());
			} else if (md.getDay() <= 29) {
				System.out.println("Not exist such");
				break;
			}
		}
	}

	/*
	 * Method for case 5 - for show all months that have more days:
	 */

	public static void moreDaysMonths() {
		Month[] mon = Month.values();
		String monthScan = nameOfMonth();
		try {
			validateMonthName(monthScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}
		checkDaysInMonth(mon, monthScan);
		System.out.println("Months that have more days are: ");
		Month mondMore = Month.valueOf(monthScan);
		for (Month md : mon) {
			if ((md.getDay() - mondMore.getDay()) >= 1) {
				System.out.println(md.name());
			} else if (mondMore.getDay() == 31) {
				System.out.println("Not exist such");
				break;
			}
		}
	}

	// Method to check Month with even days
	public static void checkEvenDays() {
		Month[] mon = Month.values();
		for (Month m : mon) {
			if (m.getDay() % 2 == 0)
				System.out.println(m.name());
		}
	}

	// Method show all months have odd number of days
	public static void checkOddDays() {
		Month[] mon = Month.values();
		for (Month m : mon) {
			if (m.getDay() % 2 == 1) {
				System.out.println(m.name());
			}
		}
	}

	// Method show entered month odd or even days
	public static void checkMonthEvenOdd() {
		Month[] mon = Month.values();
		String monthScan = nameOfMonth();
		try {
			validateMonthName(monthScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {

			return;
		}
		checkDaysInMonth(mon, monthScan);
		int day = getDayFromMonth(mon, monthScan);

		if (day % 2 == 0) {
			System.out.println("This month has even number of days");
		} else {
			System.out.println("This month has odd number of days");

		}

	}

	// Method to validate input month in the scanner with Validator Class:
	private static void validateMonthName(String nameMonth) throws WrongInputDataInScanner {
		try {
			Validator.checkMonth(nameMonth);
		} catch (WrongInputDataInScanner ex) {
			System.out.println(nameMonth + " This month doesn't exist");
			throw new WrongInputDataInScanner(ex);
		}
	}

	// Method to check and out quantity of days in the entered month:
	private static void checkDaysInMonth(Month[] mon, String monthScan) {
		for (Month m : mon) {
			if (m.name().equals(monthScan)) {
				System.out.println("Month exist: " + monthScan);
				System.out.println("This month have " + m.getDay() + " days");

			}
		}
	}
/*
 * Method for find and return the number of the days in the Month 
 */
	private static int getDayFromMonth(Month[] mon, String monthScan) {
		for (Month m : mon) {
			if (m.name().equals(monthScan)) {
				return m.getDay();
			}
		}
		throw new IllegalArgumentException("This is wrong number");
	}

	/*
	 * End of Month Enum
	 */
}
