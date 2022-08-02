package animalClasses;

public class Cat {
	// Attributes
	String name;
	String typeOfCat;
	String coatColor;
	String eyeColor;
	int lifeSpan;
	String owner;

	// Methods
	public Cat(String name, String typeOfCat, String coatColor, String eyeColor, int lifeSpan, String owner) {

		this.name = name;
		this.typeOfCat = typeOfCat;
		this.coatColor = coatColor;
		this.eyeColor = eyeColor;
		this.lifeSpan = lifeSpan;
		this.owner = owner;
	}

	// Method to compile output message
	public String toString() {
		String output = "Name: " + name;
		output += "\nBreed:" + typeOfCat;
		output += "\nCoat Color:" + coatColor;
		output += "\nEye Color:" + eyeColor;
		output += "\nLife Expectancy:" + lifeSpan;
		output += "\nOwner:" + owner;

		return output;
	}

}
