package homework.array.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Integer[] arrayOfint = { Application.randomVal(1, 20), Application.randomVal(1, 20),
				Application.randomVal(1, 20), Application.randomVal(1, 20), Application.randomVal(1, 20),
				Application.randomVal(1, 20), Application.randomVal(1, 20), Application.randomVal(1, 20) };

		System.out.println(Arrays.toString(arrayOfint));
		Arrays.sort(arrayOfint);
		System.out.println("Array sort asc:");
		System.out.println(Arrays.toString(arrayOfint));
		Arrays.sort(arrayOfint, Collections.reverseOrder());
		System.out.println("Array sort desc: ");
		System.out.println(Arrays.toString(arrayOfint));

	}

	// Method for fill array of random values

	public static int randomVal(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min and max  values are not correct");
		}
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}