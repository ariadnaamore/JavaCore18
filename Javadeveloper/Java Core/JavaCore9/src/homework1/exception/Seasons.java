/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */

package homework1.exception;

import java.util.Scanner;

/*
 * This is array of the seasons
 */
public enum Seasons {
	WINTER, SPRING, SUMMER, FALL;

	private static Seasons[] seasons = values();

	// case Two "The months of the season"
	public static void monthsOfSeason() {
		Month[] mon = Month.values();
		String seasonScan = scanSeason();
		System.out.println("The month of this season: ");
		try {
			validateSeasonName(seasonScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}
		for (Month m : mon) {
			if (m.getSeason().name().equalsIgnoreCase(seasonScan)) {
				System.out.println(m);
			}
		}
	}
	
	/*
	 * Case 7 Find next Season in Enum
	 */

	public static void findNextSeason() {
		String seasonScan = scanSeason();
		try {
			validateSeasonName(seasonScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}

		Seasons ses = Seasons.valueOf(seasonScan);
		int s = ses.ordinal();
		System.out.println("The next season is: ");

		for (Seasons ns : seasons) {
			if (ns.ordinal() == s) {

				System.out.println(ns.getNextSeason(seasonScan));
				break;
			}
		}
	}

	/*
	 * Case 8 Find previous Season in Enum
	 */

	public static void findPrevSeason() {
		String seasonScan = scanSeason();
		try {
			validateSeasonName(seasonScan);
		} catch (WrongInputDataInScanner wrongInputDataInScanner) {
			return;
		}

		Seasons ses = Seasons.valueOf(seasonScan);
		int s1 = ses.ordinal();
		System.out.println("The previous season is: ");

		for (Seasons ns : seasons) {
			if (ns.ordinal() == s1) {

				System.out.println(ns.getPrevSeasons(seasonScan));
				break;
			}
		}
	}

	// Method for find the next season in Enum
	private Seasons getNextSeason(String s) {
		for (int i = 0; i < seasons.length; i++) {
			Seasons season = seasons[i];
			if (season.name().equalsIgnoreCase(s)) {
				if (i < 3) {
					return seasons[i + 1];
				}
			}
			return seasons[0];
		}
		return null;
	}

	// Method for find the previous seasons in Enum

	public Seasons getPrevSeasons(String s1) {
		for (int i = 0; i < seasons.length; i++) {
			Seasons season = seasons[i];
			if (season.name().equalsIgnoreCase(s1)) {
				if (i == 0) {
					return seasons[3];
				}
				if (i <= 3) {
					return seasons[i - 1];
				}
			}
		}
		return null;
	}

	// Method with checking Enter Season
	public static String scanSeason() {
		System.out.println("Enter season: ");
		Scanner sc = new Scanner(System.in);
		String seasonScan = sc.next().toUpperCase();
		return seasonScan;
	}

	// validate season name with Validator and WrongInputDataInScanner Exception
	private static void validateSeasonName(String name) throws WrongInputDataInScanner {
		try {
			Validator.checkSeason(name);
		} catch (WrongInputDataInScanner ex) {
			System.out.println(name + " This season doesn't exist");
			throw  new WrongInputDataInScanner (ex);
		}
	}
}
