package homework17NestedClass;

public class Application {

	
	public static void main(String[] args) {
		 

			Integer[] array = { 1, 43, -2, 34, 9, 17, -82, 1, 6, 55 };

			Collection collection = new Collection(array);

			System.out.println("Масив від початку до кінця з заміною непарних на null:");
			Iterator iteratorForward = collection.createForwardIterator();

			while (iteratorForward.hasNext()) {
				Integer next = iteratorForward.next();

				if (next % 2 != 0) {
					System.out.println("null");
				} else
					System.out.println(next);
			}

			System.out.println();

			System.out.println("Масив від кінця до почку");
			Iterator iteratorBackward = collection.createBackward();

			while (iteratorBackward.hasNext()) {
				Integer next = iteratorBackward.next();

				System.out.println(next);
			}
	}
}
