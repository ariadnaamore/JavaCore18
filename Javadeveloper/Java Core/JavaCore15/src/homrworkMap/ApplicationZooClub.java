package homrworkMap;

import java.util.Scanner;

public class ApplicationZooClub {

	static void menu() {
		System.out.println();
		System.out.println("Натисніть 1, щоб зареєструвати нового учасника зоо-клуба");
		System.out.println("Натисніть 2, щоб закріпити тварину за учасником");
		System.out.println("Натисніть 3, щоб видалити закріплену за учасником тварину");
		System.out.println("Натисніть 4, щоб видалити учасника з зоо-клубу");
		System.out.println("Натисніть 5, щоб видалити тварину у всіх учасників клубу");
		System.out.println("Натисніть 6, щоб вивести весь зоо-клуб");
		System.out.println("Натисніть 0, щоб вийти з програми");
	}

	public static void main(String[] args) {
		ZooClub zooClub = new ZooClub();
		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.nextInt()) {

			case 1: {
				zooClub.addZooClubMember();
				break;
			}

			case 2: {
				zooClub.addAnimal();
				break;
			}

			case 3: {
				zooClub.removeAnimal();
				break;
			}

			case 4: {
				zooClub.removeZooClubMember();
				break;
			}

			case 5: {
				zooClub.removeAnimalFromAllMembers();
				break;
			}

			case 6: {
				zooClub.viewZooClub();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введіть корректне число");
				break;
			}

			}
		}

	}

}
