abstract class Animal {
   
    abstract void makeSound();

    
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another subclass inheriting from Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls Dog's implementation
        myDog.sleep(); // Inherited method

        Animal myCat = new Cat();
        myCat.makeSound(); // Calls Cat's implementation
        myCat.sleep(); // Inherited method
    }
}
