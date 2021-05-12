package homework.array.auto;

public class Car {

	private int horsePower;
	private int ageOfBuilt;
	private Engine engine;
	private SteerWheel steer;

	// Generate Constructor:
	public Car(int horsePower, int ageOfBuilt, Engine engine, SteerWheel steer) {

		this.horsePower = horsePower;
		this.ageOfBuilt = ageOfBuilt;
		this.engine = engine;
		this.steer = steer;
	}

	// Generate Getters and Setters for all fields of Car
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getAgeOfBuilt() {
		return ageOfBuilt;
	}

	public void setAgeOfBuilt(int ageOfBuilt) {
		this.ageOfBuilt = ageOfBuilt;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public SteerWheel getSteer() {
		return steer;
	}

	public void setSteer(SteerWheel steer) {
		this.steer = steer;
	}

	// Generate toString:
	@Override
	public String toString() {
		return "Car [horsePower=" + horsePower + ", ageOfBuilt=" + ageOfBuilt + ", engine=" + engine + ", steer="
				+ steer + "]";
	}

}
