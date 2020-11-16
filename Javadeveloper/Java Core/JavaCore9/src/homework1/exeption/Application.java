/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */

package homework1.exeption;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Month mon[] = Month.values();
		Seasons season[] = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			/*
			 * The menu, user see in the console:
			 * This menu is in Class Month.homework1
			 */
			Month.menu();

			switch (sc.next()) {
/*
 * 1 case of Menu:
 * "Press 1 for Show the name of month"
 */
			case "1":
				{Month.showTheMonth();

				break;}
		
/*
 * 2nd case of Menu:
 * "Press 2 for show all months of this season: "
 */
			case "2":
				{Seasons.monthsOfSeason();
				break;}

/*
 * 3d case of Menu
 * "Press 3 for show all months that have same quantity of days:"
 */
			case "3":
				{Month.sameQuantityOfDays();
				break;}
/*
 * 4th case of Menu
 * "Press 4 for show all months that have less days:"
 */
			case "4":
				Month.lessDaysMonths();
			
				break;
/*
 * 5th case of Menu
 * "Press 5 for show all months that have more days:"
 */
			case "5":
				Month.moreDaysMonths();
				
				break;
/*
 * 6th case of Menu
 * "Press 6 for show next season":
 */
			case "6":
				Seasons.findNextSeason();
				break;
			
			
/*
 * 7th case of Menu
 * "Press 7 for show previous season":
 */
			case "7":
				Seasons.findPrevSeason();				
				break;
/*
 * 8th case of Menu
 * "Press 8 for show all months have even number of days"
 */

			case "8":
				System.out.println("Month with even numbers of day : ");
				Month.checkEvenDays();
				break;
/*
 * 9th case of Menu
 * "Press 9 for show all months have odd number of days"
 */
			case "9":
				System.out.println("Month with odd numbers of day :  ");
				Month.checkOddDays();
				break;
/*
 * 10th case of Menu
 * 	"Press 10 show if entered month have even number of days":
 */
			case "10":
				Month.checkMonthEvenOdd();
				break;
//end of Menu
			}

		}

	}


}
