/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */

package homework1.exeption;

public class Validator {
	/*
	 * This is class for validate the Scanner input and throw exception
	 * WrongInputDataInScanner.
	 */
/*
 * Validate input Season
 */
	public static void checkSeason(String sc) throws WrongInputDataInScanner {
		try {
			Seasons.valueOf(sc);
		

		} catch (IllegalArgumentException e) {

			throw new WrongInputDataInScanner(sc);

		}
	}

	/*
	 * Validate input Month
	 */
	
	 public static void checkMonth(String sc) throws WrongInputDataInScanner { 
		 try { 
			 Month.valueOf(sc);
	 } catch (IllegalArgumentException e) {
		  throw new WrongInputDataInScanner(sc);
		 }
	  
	  }
	 
}
