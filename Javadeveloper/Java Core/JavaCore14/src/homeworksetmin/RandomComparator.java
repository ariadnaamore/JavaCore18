package homeworksetmin;

import java.util.Comparator;

public class RandomComparator implements Comparator <RandomClass>{

	@Override
	public int compare (RandomClass ex1, RandomClass ex2) {
		if (ex1.getRandInt() > ex2.getRandInt()) {
			return 1;
		} else if (ex1.getRandInt() <  ex2.getRandInt()) {
			return -1;
		}
		return 0;
	}

}
