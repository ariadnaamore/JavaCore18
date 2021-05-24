package homeworkIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public final class Rada {

//Створюємо один екземпляр Ради:

	private static Rada instance = new Rada();

	private Rada() {
	}

	public static Rada getInstance() {
		if (instance == null) {
			instance = new Rada();
		}

		return instance;
	}
//Додаємо в раду список Фракцій:

	List<Fraction> radaArray = new ArrayList<Fraction>();

//Додаємо нову фракцію

	public void addFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Назва фракції: ");
		String fractionName = scan.next();

		Fraction fraction = new Fraction(fractionName);

		radaArray.add(fraction);
		System.out.println(fraction.toString() + " добавлено в Раду!");
	}

//Видаляємо фракцію
	public void removeFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Вкажіть назву : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {

			Iterator<Fraction> iterator = radaArray.iterator();

			while (iterator.hasNext()) {
				Fraction iterFraction = iterator.next();

				if (iterFraction.getFractionName().equalsIgnoreCase(fractionName)) {
					iterator.remove();
					System.out.println(iterFraction.toString() + " видалена!");
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

// Вивести всі фракції в Раді

	public void allFraction() {
		System.out.println("Усі фракції в Раді: ");
		for (Fraction fraction : radaArray) {
			System.out.println(fraction.toString());
		}
	}

//Очистити фракцію
	public void clearFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву:");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.clearList();
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

//Вивести фракцію
	public void getFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву:");
		String fractionName = scan.next();

		for (Fraction fraction : radaArray) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
				System.out.println(fraction.toString());
				fraction.allDeputatsInList();
			}
		}
	}
// Додати депутата в фракцію

	public void addDeputatFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву фракції : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.addDeputat();
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

//видалити депутата з фракції
	public void removeDeputFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву фракції : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.removeDeputat();
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

//Вивести хабарників у фракції
	public void bribersOfFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву фракції : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.getBribers();
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

// Вивести найбільшого хабарника з фракції

	public void biggestBriberFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву фракції : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.biggestBriber();
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}
//Вивести всіх депуататів з фракції

	public void allDeputatsInFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Внесіть назву фракції : ");
		String fractionName = scan.next();

		boolean validator = isFractionExists(radaArray, fractionName);

		if (validator) {
			for (Fraction fraction : radaArray) {
				if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
					fraction.allDeputatsInList();
					;
				}
			}

		} else {
			System.out.println("Така фракція відсутня, введіть коректну назву.");
		}
	}

	// Validator flag

	static boolean isFractionExists(List<Fraction> radaArray, String fractionName) {
		boolean flag = false;

		for (Fraction fraction : radaArray) {
			if (fraction.getFractionName().equalsIgnoreCase(fractionName)) {
				flag = true;
			}
		}

		return flag;
	}

}
