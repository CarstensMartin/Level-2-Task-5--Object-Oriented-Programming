package animalClasses;

public class School {

	public static void main(String[] args) {
		// Properties of the dogs
		Dog sally = new Dog("Sally", "labrador", "black", "brown", 12, 3);
		Dog sam = new Dog("Sam", "golden retriever", "golden", "brown", 14, 5);
		Dog hassie = new Dog("Hassie", "husky", "black and white", "blue", 13, 10);

		// Properties of the cats
		Cat kietsie = new Cat("Kietsie", "persian", "white", "hazel", 13, "Jana");
		Cat bennie = new Cat("Bennie", "bengal", "brown", "green", 15, "Sarah");
		Cat samie = new Cat("Samie", "siamese", "silver-gray", "blue", 11, "John");

		// Display on console all the dogs with their properties
		System.out.println("Dogs: \n");
		System.out.println(sally + "\n");
		System.out.println(sam + "\n");
		System.out.println(hassie + "\n");

		// Display on console all the cats with their properties
		System.out.println("Cats: \n");
		System.out.println(kietsie + "\n");
		System.out.println(bennie + "\n");
		System.out.println(samie + "\n");
	}

}
