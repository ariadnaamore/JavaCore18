/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */

package homework1.exeption;

import java.util.Scanner;



/*
 * This is array of the seasons
 */
public enum Seasons {
	WINTER, SPRING, SUMMER, FALL;

	private static Seasons[] seasons = values();

	// case Two "The month of the season"
	public static void monthsOfSeason() {

		Month[] mon = Month.values();

		String seasonScan = scanSeason();
		System.out.println("The month of this season: ");

		validateSeasonName(seasonScan);

		for (Month m : mon) {

			if (m.getSeason().name().equalsIgnoreCase(seasonScan)) {

				System.out.println(m);
			}
		}
	}
	// end case TWO "The month of the season"
/*
 * Case 7 Find next Season
 */
	
	public static void findNextSeason() {
		String seasonScan = scanSeason();
		validateSeasonName(seasonScan);

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
	 * Case 8 Find previous Season
	 */	
	
	public static void findPrevSeason() {
		String seasonScan = scanSeason();
		validateSeasonName(seasonScan);

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
	
	

	// method for find the next season
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

	// method for find the previous seasons

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

	// Method with Enter Season
	public static String scanSeason() {
		System.out.println("Enter season: ");
		Scanner sc = new Scanner(System.in);
		String seasonScan = sc.next().toUpperCase();
		return seasonScan;
	}
	// validate season name with Validator and WrongInputDataInScanner Exception
		private static void validateSeasonName(String name) {
			try {
				Validator.checkSeason(name);

			} catch (WrongInputDataInScanner ex) {

				System.out.println(name + " This season doesn't exist");
			}
		}
}
