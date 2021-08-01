package homeworkReflection;

public class Vehicle {

	
	public String type;
	private String name;
	private int yearOfProduction;
	private int coast;
	
	
	public Vehicle () {
	
	}
	
	public Vehicle(String type) {
		super();
		this.type = type;
	}
	
	

	public Vehicle(String type, String name, int yearOfProduction) {
		
		this.type = type;
		this.name = name;
		this.yearOfProduction = yearOfProduction;
	}
	
	

	public Vehicle(String type, int coast) {
		super();
		this.type = type;
		this.coast = coast;
	}

	public Vehicle(String type, String name, int yearOfProduction, int coast) {
		super();
		this.type = type;
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.coast = coast;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}
	
	public void getInGarage(int garagePlace) {
		System.out.println("ТЗ поміщено в гараж на місце № " + garagePlace);
	}

	public void getDriver(String driver) {
		System.out.println("Водій " + driver + " купив " + type + " " + name +" за "+coast +" грн.");
	}

	@Override
	public String toString() {
		return "Vehicle [тип = " + type + ", назва= " + name + ", виготовлено = " + yearOfProduction +" рік" +", ціна= "
				+ coast +" грн." +"]";
	}
	
	
}
