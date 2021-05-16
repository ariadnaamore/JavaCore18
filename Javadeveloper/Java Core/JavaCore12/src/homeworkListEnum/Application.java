package homeworkListEnum;

import java.util.ArrayList;

import java.util.Scanner;

import homeworkListEnum.*;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Month> arrayListMon = new ArrayList<Month>();
		for (Month month : Month.values()) {
			arrayListMon.add(month);
		}

		ArrayList<Seasons> arrayListSeasons = new ArrayList<Seasons>();
		for (Seasons season : Seasons.values()) {
			arrayListSeasons.add(season);
		}

		while (true) {
			Month.menu();

			switch (sc.next()) {
			// start first
			case "1":
				System.out.println("Checking if this month exist in the list");
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = false;

				for (Month m : arrayListMon) {
					if (m.name().equals(month)) {
						System.out.println("Month exist: " + month);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("This month doesn't exist. Enter valid name.");
				}
				break;
			// end first
			// start second
			case "2":
				System.out.println("Checking  months of the season");
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String seasonScan = sc.next().toUpperCase();
				boolean flag1 = false;

				for (Month m : arrayListMon) {
					if (m.getSeason().name().equals(seasonScan)) {
						flag1 = true;
					}
				}
				if (flag1) {
					Seasons ses = Seasons.valueOf(seasonScan);
					System.out.println("The month of this season: ");

					for (Month mc : arrayListMon) {
						if (mc.getSeason().name().equalsIgnoreCase(seasonScan)) {
							System.out.println(mc);
						}
					}
				}
				if (!flag1) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
			// end second

			case "3":
				System.out.println("Show all months that have same quantity of days: ");
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String quantity = sc.next().toUpperCase();

				boolean flag2 = false;
				for (Month md : arrayListMon) {
					if (md.name().equals(quantity)) {
						System.out.println(md + ": this month have " + md.getDay() + " days");
						flag2 = true;
					}
				}
				if (flag2) {
					Month mond = Month.valueOf(quantity);

					System.out.println("All month with same day quantity: ");
					for (Month md : arrayListMon) {
						if (md.getDay() == mond.getDay()) {
							System.out.println(md.name());
						}
					}
				}
				if (!flag2) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
			// end third
			// start fourth
			case "4":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String lessDay = sc.next().toUpperCase();

				boolean flag3 = false;
				for (Month md : arrayListMon) {
					if (md.name().equals(lessDay)) {
						System.out.println(md + ": this month have " + md.getDay() + " days");
						flag3 = true;
					}
				}
				if (flag3) {
					Month mondLess = Month.valueOf(lessDay);
					System.out.println("All month with less day quantity: ");
					for (Month md : arrayListMon) {
						if ((mondLess.getDay() - md.getDay()) >= 1) {
							System.out.println(md.name());
						} else if ((mondLess.getDay() - md.getDay()) < 1) {
							flag3 = false;
						}
					}
				}
				if (!flag3) {
					System.out.println("Not exist");
				}
				break;
			// end fourth
			// start fifth
			case "5":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String moreDay = sc.next().toUpperCase();
				boolean flag4 = false;

				for (Month md : arrayListMon) {

					if (md.name().equals(moreDay)) {

						System.out.println(md + ": this month have " + md.getDay() + " days");

						flag4 = true;
					}
				}
				if (flag4) {
					Month mondMore = Month.valueOf(moreDay);
					System.out.println("All month with more day quantity: ");
					for (Month md : arrayListMon) {
						if ((md.getDay() - mondMore.getDay()) >= 1) {
							System.out.println(md.name());
						} else if ((md.getDay() - mondMore.getDay()) < 0) {
							flag4 = false;

						}
					}
				}
				if (!flag4) {
					System.out.println("Not exist");
				}
				break;
			// end of fifth
			// start sixth
			case "6":
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String nextSes = sc.next().toUpperCase();

				boolean flag5 = false;

				for (Seasons seasons : arrayListSeasons) {
					if (seasons.name().equalsIgnoreCase(nextSes)) {
						flag5 = true;
					}
				}

				if (flag5 == true) {
					System.out.println("The next season is: ");

					Seasons seasons2 = Seasons.valueOf(nextSes);
					int i = seasons2.ordinal();

					if (i == (arrayListSeasons.size() - 1)) {
						i = 0;
						System.out.println(arrayListSeasons.get(i));
					} else {
						System.out.println(arrayListSeasons.get(i + 1));
					}
				}

				if (!flag5) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
			// end of sixth
			// start of seventh
			case "7":
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String prevSes = sc.next().toUpperCase();
				boolean flag6 = false;

				for (Seasons se : arrayListSeasons) {
					if (se.name().equals(prevSes)) {

						flag6 = true;
					}
				}
				if (flag6) {

					Seasons ses = Seasons.valueOf(prevSes);
					int s2 = ses.ordinal();
					System.out.println("The previous season is: ");

					if (s2 == 0) {
						s2 = (arrayListSeasons.size() - 1);
						System.out.println(arrayListSeasons.get(s2));
					} else {
						System.out.println(arrayListSeasons.get(s2 - 1));
					}
				}
				if (!flag6) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
			// end of seventh
			// start of eighth

			case "8":
				System.out.println("Month with even numbers of day : ");

				for (Month m : arrayListMon) {
					if (m.getDay() % 2 == 0)
						System.out.println(m.name());
				}
				break;
			// end of eight
			// start of ninth
			case "9":
				System.out.println("Month with odd numbers of day :  ");
				for (Month m : arrayListMon) {
					if (m.getDay() % 2 == 1) {
						System.out.println(m.name());
					}
				}
				break;
			// end of ninth
			// start of tenth
			case "10":
				System.out.println("Let's check if this month have even or odd number of the days?");
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String dayMonth = sc.next().toUpperCase();
				
				boolean flag7 = false;
			

				for (Month m : arrayListMon) {
					if (m.name().equalsIgnoreCase(dayMonth)) {
						flag7 = true;
					}
				}
				if (flag7) {
					Month m = Month.valueOf(dayMonth);
					if (m.getDay() % 2 == 0) {
						System.out.println("This month has even number of days");
					} else {
						System.out.println("This month has odd number of days");
					}
					break;

				}
				if (!flag7)
					System.out.println("This value doesn't exist. Enter valid name");
				break;
			}

			// end of tenth
		
		}

	}


}
