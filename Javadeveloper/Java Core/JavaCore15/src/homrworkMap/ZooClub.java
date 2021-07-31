package homrworkMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	Map<Person, ArrayList<Animal>> zooClub = new HashMap<Person, ArrayList<Animal>>();

	// Додати учасника клубу
	public void addZooClubMember() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести ім*я учасника Зоо-Клуба:");
		String name = scan.next();
		System.out.println("Ввести вік учасника Зоо-Клуба:");
		int age = scan.nextInt();

		Person zooClubMember = new Person(name, age);

		zooClub.put(zooClubMember, new ArrayList<Animal>());
		System.out.println(zooClubMember.toString() + " учасник зооклуба успішно доданий");
	}

//Додати тваринку до учасника клубу
	public void addAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести ім*я учасника Зоо-Клуба:");
		String name = scan.next();
		System.out.println("Ввести вік учасника Зоо-Клуба:");
		int age = scan.nextInt();

		boolean validator = clubMemberCheck(zooClub, name, age);

		if (validator) {
			System.out.println("Ввести тваринку:");
			String typeOfAnimal = scan.next();
			System.out.println("Ввести ім*я тварини:");
			String animalName = scan.next();

			Animal newAnimal = new Animal(typeOfAnimal, animalName);

			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					ArrayList<Animal> animalList = nextMember.getValue();

					animalList.add(newAnimal);
					System.out.println("Тварина " + newAnimal.toString() + " зареєстрована за учасником "
							+ nextMember.getKey() + "!");
				}
			}

		} else {
			System.out.println("Такого учасника в клубі немає!");
		}
	}

	// Видалити тваринку з учасника клубу

	public void removeAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести ім*я учасника Зоо-Клуба:");
		String name = scan.next();
		System.out.println("Ввести вік учасника Зоо-Клуба:");
		int age = scan.nextInt();

		boolean validator = clubMemberCheck(zooClub, name, age);

		if (validator) {
			System.out.println("Ввести тип тварини:");
			String typeOfAnimal = scan.next();
			System.out.println("Ввести ім*я тварини:");
			String animalName = scan.next();

			boolean typeAnimalCheck = clubMemberCheck(zooClub, name, age, typeOfAnimal, animalName);

			if (typeAnimalCheck) {
				Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

				while (iterator.hasNext()) {
					Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

					if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
						ArrayList<Animal> animalList = nextMember.getValue();

						Iterator<Animal> iterator2 = animalList.iterator();

						while (iterator2.hasNext()) {
							Animal next2 = iterator2.next();

							if (next2.getTypeOfAnimal().equalsIgnoreCase(typeOfAnimal)
									&& next2.getName().equalsIgnoreCase(animalName)) {
								iterator2.remove();
								System.out.println("Тварина " + next2.toString() + " відкріплена від учасника "
										+ nextMember.getKey() + "!");
							}
						}
					}
				}
			} else {
				System.out.println("Така тварина в Зоо-Клубі не зарєстрована!");
			}
		} else {
			System.out.println("Такого учасника в клубі немає!");
		}
	}

	// Видалити учасника з клубу
	public void removeZooClubMember() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести ім*я учасника Зоо-Клуба:");
		String name = scan.next();
		System.out.println("Ввести вік учасника Зоо-Клуба:");
		int age = scan.nextInt();

		boolean validator = clubMemberCheck(zooClub, name, age);

		if (validator) {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					iterator.remove();
					System.out.println("Учасника " + nextMember.getKey().toString() + " видалено з клуба");
				}
			}
		} else {
			System.out.println("Такого учасника в клубі немає!");
		}
	}

//Видалити конкретну тваринку зі всіх власників 
	public void removeAnimalFromAllMembers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите животное:");
		String typeOfAnimal = scan.next();

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

			ArrayList<Animal> animalList = nextMember.getValue();

			Iterator<Animal> iterator2 = animalList.iterator();

			while (iterator2.hasNext()) {
				Animal next2 = iterator2.next();

				if (next2.getTypeOfAnimal().equalsIgnoreCase(typeOfAnimal)) {
					iterator2.remove();
					System.out.println(
							"Тварина " + next2.toString() + " видалена у учасника " + nextMember.getKey() + "!");
				}
			}
		}
	}

//Метод для перегляду всіх учасників і тварин у учасника:	
	public void viewZooClub() {
		Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();

		System.out.println("В клубі зареєстрвані:");
		for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
			System.out.println("За учасником " + entry.getKey() + " зареєстровано " + entry.getValue());
		}
	}

	// Валідатор для перевірки чи є такий учасник в клубі
	static boolean clubMemberCheck(Map<Person, ArrayList<Animal>> zooClub, String name, int age) {
		boolean flag = false;

		Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();

		for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
			if (entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
				flag = true;
			}
		}

		return flag;
	}

	// валідатор для перевірки чи є така тварина в клубі

	static boolean clubMemberCheck(Map<Person, ArrayList<Animal>> zooClub, String name, int age, String species,
			String animalName) {
		boolean flag = false;

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

			if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
				ArrayList<Animal> animalList = nextMember.getValue();

				Iterator<Animal> iterator2 = animalList.iterator();

				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();

					if (next2.getTypeOfAnimal().equalsIgnoreCase(species)
							&& next2.getName().equalsIgnoreCase(animalName)) {
						flag = true;
					}
				}
			}
		}

		return flag;
	}

}
