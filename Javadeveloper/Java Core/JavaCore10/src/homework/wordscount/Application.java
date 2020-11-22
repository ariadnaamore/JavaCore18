package homework.wordscount;

public class Application {
public static void main(String[] args) {
	WordsCount wrd = new WordsCount(null);
	/*
	 * Input phrase to count:
	 */
	String newstr = new String("After arriving in orbit, the spacecraft separated from the rocket's second stage and unfolded its twin sets of solar arrays."); 
	/*
	 * Calling the Method:
	 */
	wrd.countWords(newstr);
}
}
