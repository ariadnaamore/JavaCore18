package homework.wordscount;

public class WordsCount {
/*
 * String fiels for method
 */
	String nwstr = new String();
/*
 * Constructor:
 */
	 public WordsCount(String nwstr) {
		
		this.nwstr = nwstr;
	}

/*
 * Method for count words in the phrase nwstr:
 */
	public static void countWords(String nwstr) {
		    if (nwstr == null || nwstr.isEmpty()) {
		   System.out.println("empty");
		    }

		    String[] words = nwstr.split("\\s+");
		   
		    System.out.println("The quantity of words in your phrase is: "+words.length);
		  }




			
}
