/*LOGOS ACADEMY JAVA CORE COURCES 9.
 * Author Iryna Rodionova
 */
package homework1.exeption;

public class WrongInputDataInScanner extends Exception {
	/*This is class of the 
	 * my particular exception when input value in the Scanner doesn't valid.
	 */
	
	public WrongInputDataInScanner() {
	super();
	
}


public WrongInputDataInScanner(String sc) {
System.err.println("You entered bad value. Please try again!");
//The message shown for user when user
//input wrong value.
}




}
