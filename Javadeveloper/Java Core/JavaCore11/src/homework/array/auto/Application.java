package homework.array.auto;

import java.util.Arrays;
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

	// Основне меню, яке зчитуватиме введену позицію і видаватиме відповідний
	// результат:
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SteerMaterial material[] = SteerMaterial.values();

		while (true) {

			menu();

			switch (scanner.nextInt()) {
			// First case

			case 1: {
				
				Car arrayOfCar[][] = new Car[getRandomFromRange(1, 10)][getRandomFromRange(1, 10)];

				for (int i = 0; i < arrayOfCar.length; i++) {
					for (int j = 0; j < arrayOfCar[i].length; j++) {

						arrayOfCar[i][j] = new Car(getRandomFromRange(100, 500), getRandomFromRange(1960, 2020),

								new Engine(getRandomFromRange(2, 12)),

								new SteerWheel(getRandomFromRange(30, 55),
										material[getRandomFromRange(0, material.length - 1)].toString()));
					}
				}
				System.out.println("Масив заповнений випадковими значеннями : ");
				System.out.println(Arrays.deepToString(arrayOfCar));

				break;
			}
			// end of first
			
			//start second case

			case 2: {
				Car car = new Car(getRandomFromRange(100, 500), getRandomFromRange(1960, 2020),
						new Engine(getRandomFromRange(2, 12)), new SteerWheel(getRandomFromRange(30, 55),
								material[getRandomFromRange(0, material.length - 1)].toString()));

				Car autoArray[] = new Car[getRandomFromRange(1, 5)];

				Arrays.fill(autoArray, car);
				System.out.println("Масив заповнений однаковим випадковим значенням : ");

				System.out.println(Arrays.deepToString(autoArray));

				break;
			}
			//end of second case
			//Якщо юзер ввів неправильну цифру в меню
			default: {
				System.out.println("Виберіть з меню 1 або 2");

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
