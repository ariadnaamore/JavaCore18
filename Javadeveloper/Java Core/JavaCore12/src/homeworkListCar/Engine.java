package homeworkListCar;

public class Engine {

	private int cylindres;

	
	//Constructor for field
	public Engine(int cylindres) {
		super();
		this.cylindres = cylindres;
	}

	//gettes for fiels
	public int getCylindres() {
		return cylindres;
	}


	public void setCylindres(int cylindres) {
		this.cylindres = cylindres;
	}
	//to String
	@Override
	public String toString() {
		return "Engine [cylindres=" + cylindres + "]";
	}
	

	
	
	

	
}
