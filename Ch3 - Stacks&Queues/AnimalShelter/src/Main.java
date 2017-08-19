import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to animal shelter");
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("Patapouf");
        Cat cat2 = new Cat("Minkie");
        Cat cat3 = new Cat("Curry");
        Dog dog1 = new Dog("Jerry");
        Dog dog2 = new Dog("Robin");

        shelter.enqueque(cat1); // Patapouf
        shelter.enqueque(dog1); // Jerry
        shelter.enqueque(cat2); // Minkie
        shelter.enqueque(cat3); // Curry
        shelter.enqueque(dog2); // Robin

        String animal;
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Do you want to choose between animals? ");
        answer = scanner.nextLine();
        answer = answer.toLowerCase();
        if (answer.contains("yes")) {
            System.out.printf("What kind of animal do you prefer ? A dog or a cat ? ");
            animal = scanner.nextLine();
            animal = animal.toLowerCase();
            if (animal.contains("cat"))
                System.out.println(shelter.dequequeCat().getName());
            if (animal.contains("dog"))
                System.out.println(shelter.dequequeDog().getName());
        }
        else{
            System.out.println(shelter.dequeueAnimal().getName());
        }
    }
}
