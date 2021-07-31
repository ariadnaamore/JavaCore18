package homrworkMap;

public class Animal {
	

	private String typeOfAnimal;
	private String name;

	public Animal(String typeOfAnimal, String name) {
		this.typeOfAnimal = typeOfAnimal;
		this.name = name;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((typeOfAnimal == null) ? 0 : typeOfAnimal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (typeOfAnimal == null) {
			if (other.typeOfAnimal != null)
				return false;
		} else if (!typeOfAnimal.equals(other.typeOfAnimal))
			return false;
		return true;
		
	}

	@Override
	public String toString() {
		return typeOfAnimal + " \"" + name + "\"";
	}
	
}
