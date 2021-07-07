package homeworksetmin;

public class RandomClass implements Comparable<RandomClass> {

	private String randString;
	private int randInt;
	public RandomClass(String randString, int randInt) {
		super();
		this.randString = randString;
		this.randInt = randInt;
	}
	public String getRandString() {
		return randString;
	}
	public int getRandInt() {
		return randInt;
	}
	@Override
	public String toString() {
		return "RandomClass [randString=" + randString + ", randInt=" + randInt + "]";
	}
	
	@Override
	public int hashCode() {
		final int finalInt = 31;
		int result = 1;
		result = finalInt * result + randInt;
		result = finalInt * result + ((randString == null) ? 0 : randString.hashCode());
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RandomClass newClass = (RandomClass) obj;
		if (randInt != newClass.randInt)
			return false;
		if (randString == null) {
			if (newClass.randString != null)
				return false;
		} else if (!randString.equals(newClass.randString))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(RandomClass newString) {
		
		return this.randString.compareTo(newString.getRandString());
	}
	
	
	
	
	
}
