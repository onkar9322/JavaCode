// Base class
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Intermediate class (Derived from Animal)
class Mammal extends Animal {
    void sleep() {
        System.out.println("This mammal is sleeping.");
    }
}

// Derived class (Derived from Mammal, which is already derived from Animal)
class Dog extends Mammal {
    void bark() {
        System.out.println("This dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Accessing methods from all levels
        myDog.eat();   // From Animal class
        myDog.sleep(); // From Mammal class
        myDog.bark();  // From Dog class
    }
}
