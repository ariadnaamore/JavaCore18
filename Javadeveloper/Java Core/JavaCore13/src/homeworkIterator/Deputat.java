package homeworkIterator;
import java.util.Scanner;


public class Deputat extends Human {
	
//Властивості Депутата

	private String name;
	private String surname;
	private int age;
	private boolean bribable;
	private int bribeSum;
	
//Конструктор класу з унаслідуванням полей класу Human
	public Deputat(String name, String surname, int age,int height, int weight, boolean bribable) {
		super(height, weight);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bribable = bribable;
	}
	
//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean bribable() {
		return bribable;
	}

	public void setBribable(boolean bribable) {
		this.bribable = bribable;
	}

	public int getBribeSum() {
		return bribeSum;
	}

	public void setBribeSum(int bribeSum) {
		this.bribeSum = bribeSum;
	}
	
	public boolean isBribable() {
		return bribable();
	}


	
//Виведення чи хабарник депутат в текстовому форматі
	public String bribeTaker() {
		if (this.bribable) {
			return "бере хабаря";
		} else { return "не бере хабаря";
		}
		
	}
		
//Метод дати хабаря, якщо хабар більше 5000 - виводним "Поліція ув*язнить депутата"
	public void getBribe() {
		if (this.bribable == false) {
			System.out.println("цей депутат не бере хабарів");
		}
		if (this.bribable == true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Вкажіть суму хабаря: ");
			int bribeSize = scan.nextInt();

			if (bribeSize > 5000) {
				System.out.println("Поліція ув'язнить депутата");
			} else {
				this.bribeSum = bribeSize;
			}
		}
		
	}

//Приводимо до стрінга для виводу на консоль
	@Override
	public String toString() {
		return "Депутат [Ім'я = " + name + ", Фамілія = " + surname + ", Вік = " + age + ", Хабарник = " + bribeTaker()
				 + "]";
	}
	

}

