package homework.string.palindrom;

import java.util.Scanner;

public class Palindrom {

	static String word;

	static StringBuffer palindroms = new StringBuffer();
/*
 * Constructor:
 */
	public Palindrom() {

	}
	/*
	 * For scan the entered word and apped it to StringBuffer:
	 */
	public static String newscanWord() {		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		palindroms.append(word);
		return word;
	}

	/*
	 * checking if the entered word is palindrom
	 */
	public static void checkingpal() {

		
		String word = newscanWord();
		System.out.println("Checking if palidrome : " + word);
		try {
			checkLenth(word);
		} catch (IllegalArgumentException ee) {
			System.err.println("Word must have 5 letters!");
			ee.printStackTrace();
		}
	}
	/*
	 * Check for word have 5 letters if no - throws exception
	 */
	public static void checkLenth(String s) {
		int le = s.length();
		if (le != 5) {
			throw new IllegalArgumentException("Bad lenght!");

		} else {
			equalsReverso(s);
		}
	}

	/*
	 * checking if random word is palindrom with StringBuffer library
	 */
	static void equalsReverso(String s) {
		String reverse = new StringBuffer(s).reverse().toString();

		if (s.equalsIgnoreCase(reverse)) {
			System.out.println(s + " - is a PALINDROM!");
		} else {
			System.err.println("Not a PALINDROM!");
		}
	}
}
