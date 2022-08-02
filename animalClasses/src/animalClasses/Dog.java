package animalClasses;

public class Dog {

	// Attributes
	String name;
	String typeOfDog;
	String coatColor;
	String eyeColor;
	int lifeSpan;
	int age;

	// Methods
	public Dog(String name, String typeOfDog, String coatColor, String eyeColor, int lifeSpan, int age) {

		this.name = name;
		this.typeOfDog = typeOfDog;
		this.coatColor = coatColor;
		this.eyeColor = eyeColor;
		this.lifeSpan = lifeSpan;
		this.age = age;
	}

	// Method to compile output message
	public String toString() {
		String output = "Name: " + name;
		output += "\nBreed:" + typeOfDog;
		output += "\nCoat Color:" + coatColor;
		output += "\nEye Color:" + eyeColor;
		output += "\nLife Expectancy:" + lifeSpan;
		output += "\nAge:" + age;

		return output;
	}

}
