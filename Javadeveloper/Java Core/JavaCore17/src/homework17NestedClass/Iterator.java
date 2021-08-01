package homework17NestedClass;

public interface Iterator {

	public boolean hasNext();
	public int next ();
	
}
class Collection {
	private static Integer[] array;

	Collection(Integer[] array) {
		Collection.array = array;
	}
	
	public class Forward implements Iterator{
		
		private int count=0;
		
		@Override
		public boolean hasNext() {
			
			return count  < array.length;
		}

		@Override
		public int next() {
			
			return array[count++];
		}
		
	}
	public Forward createForwardIterator() {
		return new Forward();
	}
	public class Backward implements Iterator {

		private int count = array.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public int next() {
			
			return array[count--];
		}
	}
	public Backward createBackward() {
		return new Backward();
	}
}


