package homeworkListCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	// Першочергове меню, що дозволяє вибрати метод заповнення нашого масиву
	// автомобілей
	static void menu() {
		System.out.println();
		System.out.println("Показати масив випадкових авто: 1");
		System.out.println("Показати масив однакових значень:  2");
		System.out.println("Зробити вибір: ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<SteerMaterial> steerMatList = new ArrayList<SteerMaterial>();
		// заганяємо наші значення матеріалу в список метеріалів для керма
		for (SteerMaterial material : SteerMaterial.values()) {
			steerMatList.add(material);
		}
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			// First case
			case 1: {

				List<Car> carrArray = new ArrayList<Car>();

				for (int i = 0; i < getRandomFromRange(1, 5); i++) {
					List<Car> carArray1 = new ArrayList<Car>();
					for (int j = 0; j < getRandomFromRange(1, 5); j++) {
						carArray1.add(new Car(getRandomFromRange(100, 500), getRandomFromRange(1960, 2020),
								new Engine(getRandomFromRange(2, 12)), new SteerWheel(getRandomFromRange(35, 50),
										steerMatList.get(getRandomFromRange(0, steerMatList.size() - 1)).toString())));
					}
					carrArray.addAll(carArray1);
				}

				System.out.print(carrArray);

				break;
			}

			// Second case

			case 2: {

				Car car = new Car(getRandomFromRange(100, 500), getRandomFromRange(1960, 2020),
						new Engine(getRandomFromRange(2, 12)), new SteerWheel(getRandomFromRange(35, 50),
								steerMatList.get(getRandomFromRange(0, steerMatList.size() - 1)).toString()));

				List<Car> carrArray = new ArrayList<Car>();

				for (int i = 0; i < getRandomFromRange(1, 5); i++) {
					carrArray.add(car);
				}

				System.out.println(carrArray);

				break;

			}

			}

		}

	}

	// Method for Random
	public static int getRandomFromRange(int from, int to) {
		if (from >= to) {
			throw new IllegalArgumentException("Помилка: Мінімальне число не може бути більше за максимальне");
		}

		Random random = new Random();
		return random.nextInt(to - from + 1) + from;
	}

}
