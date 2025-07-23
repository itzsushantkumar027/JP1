class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
    }
}
