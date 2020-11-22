package homework.string.vowels;

public class LoremIpsum {
	/*
	 * String with some text - Ciceron tractatus:
	 */
	String lorem = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

	/*
	 * Replacing all vowels letters to "-" with standard String method:
	 */
	public void replacingVowels() {
		String replacingO = lorem.replaceAll("[AaEeIiOoUu]", "-");
		System.out.println(replacingO);
	}

}
