package homeworkIterator;

import java.util.Scanner;

public class Application {

	
	//Створюємо консольне меню
	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, додати фракцію у Раду");
		System.out.println("Введіть 2, видалити фракцію з Ради");
		System.out.println("Введіть 3, показати всі фракції у Раді");
		System.out.println("Введіть 4, очистити певну фракцію");
		System.out.println("Введіть 5, перевірити певну фракцію");
		System.out.println("Введіть 6, додати депутата у вказану фракцію");
		System.out.println("Введіть 7, удалити депутата з вказаної фракції");
		System.out.println("Введіть 8, показати хабарників в фракції");
		System.out.println("Введіть 9, показати найбільшого хаарника в фракції");
	}

	public static void main(String[] args) {
//створюємо сканер для вводу
		Scanner scan = new Scanner(System.in);
//реалізація програм у меню
		while (true) {
			menu();

			switch (scan.nextInt()) {
//Додати фракцію
			case 1: {
				Rada.getInstance().addFraction();
				break;
			}
//удалити фракцію
			case 2: {
				Rada.getInstance().removeFraction();
				break;
			}
//вивести всі фракції
			case 3: {
				Rada.getInstance().allFraction();
				break;
			}
//очистити фракцію
			case 4: {
				Rada.getInstance().clearFraction();
				break;
			}
//перевірити фракцію
			case 5: {
				Rada.getInstance().getFraction();
				break;
			}
//додати депутата
			case 6: {
				Rada.getInstance().addDeputatFraction();
				break;
			}
//удалити депутата
			case 7: {
				Rada.getInstance().removeDeputFraction();
				break;
			}
//хабарники в фракції
			case 8: {
				Rada.getInstance().bribersOfFraction();
				break;
			}
//найбільший хабарник
			case 9: {
				Rada.getInstance().biggestBriberFraction();
				break;
			}

			default: {
				System.out.println("Некоректний ввід, введіть числа від 1 до 9.");
				break;
			}
			}
		}
	}

}
