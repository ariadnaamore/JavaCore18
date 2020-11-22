package homework.string.palindrom;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/*
		 * Method for checking entered word and not break the program
		 */
		Palindrom palid = new Palindrom();
		while (true) {
			System.out.println("Enter word: ");
			palid.checkingpal();
		}

	}

}
