package homework.array.auto;

public class SteerWheel {

	private int diameter;
	private String material;
	
	//Constructor
	public SteerWheel(int diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	//Getters and setters for fields

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	//Method to String for SterrWheel

	@Override
	public String toString() {
		return "SteerWheel [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
}
