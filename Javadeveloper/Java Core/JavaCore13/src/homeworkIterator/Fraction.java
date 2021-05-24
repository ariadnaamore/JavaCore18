package homeworkIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	private String fractionName;

	public Fraction(String fractionName) {
		this.fractionName = fractionName;
	}

	public String getFractionName() {
		return fractionName.toString();
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}
	
	 
// Список депутатів:

	List<Deputat> listOfDeputats = new ArrayList<Deputat>();

  

	// Метод для заповнення анкети для нового депутата в фракцію
	public void addDeputat() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Вкажіть прізвище: ");
		String surname = scan.next();

		System.out.println("Вкажіть ім*я: ");
		String name = scan.next();

		System.out.println("Вкажіть вік:");
		int age = scan.nextInt();

		System.out.println("Вкажіть зріст:");
		int height = scan.nextInt();

		System.out.println("Вкажіть вагу:");
		int weight = scan.nextInt();

		System.out.println("Чи депутат хабарник? (true/false):");
		boolean bribable = scan.nextBoolean();

// Створюємо депутата на основі анкети
		Deputat deputat = new Deputat(surname, name, age, height, weight, bribable);

// Якщо хабарник, застосовуємо метод дати хабаря:
		if (deputat.isBribable()) {

			deputat.getBribe();
		}

// Добавляємо депутата в список
		listOfDeputats.add(deputat);

// виводимо повідомлення на консоль, що ми добавили депутата.
		System.out.println("Депутата " + deputat.toString() + "  добавлено у Фракцію");
	}

// Метод видалення депутата зі списку

	public void removeDeputat() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Вкажіть прізвище:");
		String surname = scan.next();
		System.out.println("Вкажіть ім*я:");
		String name = scan.next();

// перевіряємо, чи є такий депутат за допомогою додаткового методу
// isDeputatExists

		boolean validator = isDeputatExists(listOfDeputats, surname, name);

		if (validator) {

			Iterator<Deputat> iterator = listOfDeputats.iterator();

			while (iterator.hasNext()) {
				Deputat nextDeputat = iterator.next();

				if (nextDeputat.getSurname().equalsIgnoreCase(surname)
						&& nextDeputat.getName().equalsIgnoreCase(name)) {

					iterator.remove();
					System.out.println("Депутат " + nextDeputat.toString() + " видалений!");
				}
			}

		} else {
			System.out.println("Такого депутата не існує.");
		}
	}

// Виявляємо хабарників
	 public void getBribers() {
		System.out.println("Хабарники: ");
		System.out.println();
		for (Deputat deput : listOfDeputats) {
			if (deput.isBribable()) {
				System.out.println(deput.toString());
			}
		}
	}

// Найбільший хабарник:
	public void biggestBriber() {
		int bribeSum = 0;
		int deputyIndex = -1;

		for (int i = 0; i < listOfDeputats.size(); i++) {
			if (listOfDeputats.get(i).isBribable()) {
				if (listOfDeputats.get(i).getBribeSum() > bribeSum) {
					bribeSum = listOfDeputats.get(i).getBribeSum();
					deputyIndex = listOfDeputats.indexOf(listOfDeputats.get(i));
				}

			}
		}
// Вивиодимо хабарника на консоль
		if (deputyIndex >= 0) {
			System.out.println("Найбільший хабарник:  " + listOfDeputats.get(deputyIndex).toString());
		} else {
			System.out.println("Хабарники відсутні в списку");

		}
	}

//Вивести увесь список депутатів

	public void allDeputatsInList() {
		System.out.println("Увесь список депутатів: ");
		for (Deputat deput : listOfDeputats) {
			System.out.println(deput.toString());
		}
	}

// Очистити список депутатів:

	public void clearList() {
		listOfDeputats.clear();
		System.out.println("Список очищено");
	}

// Метод для перевірки чи існує такий депутат в списку - flag

	static boolean isDeputatExists(List<Deputat> listOfDeputats, String surname, String name) {
		boolean flag = false;

		for (Deputat deputat : listOfDeputats) {
			if (deputat.getSurname().equalsIgnoreCase(surname) && deputat.getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}

		return flag;
	}

}
