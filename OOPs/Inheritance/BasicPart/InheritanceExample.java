package JavaBackend.OOPs.Inheritance.BasicPart;

// Parent class (Superclass)
class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String species, String breed) {
        super(species); // Call the constructor of the parent class
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " dog barks loudly!");
    }

    // Overriding the eat() method from the parent class
    @Override
    public void eat() {
        System.out.println("The " + breed + " dog is happily eating its kibble.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.eat();
        genericAnimal.sleep();

        System.out.println("---");

        // Create an instance of the Dog class
        Dog myDog = new Dog("Canine", "Golden Retriever");
        myDog.eat(); // Calls the overridden method in Dog
        myDog.sleep(); // Inherited from Animal
        myDog.bark(); // Specific to Dog
    }
}