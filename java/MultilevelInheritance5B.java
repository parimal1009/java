class Animal {
    String name;
    int birthYear;

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
    }
}

class Dog extends Animal {
    String smellingSense;

    void displayDog() {
        displayAnimal();
        System.out.println("Smelling Sense: " + smellingSense);
    }
}

class Bulldog extends Dog {
    String breed;

    void displayBulldog() {
        displayDog();
        System.out.println("Breed: " + breed);
    }
}

public class MultilevelInheritance5B {
    public static void main(String[] args) {
        Bulldog myBulldog = new Bulldog();
        myBulldog.name = "Buddy";
        myBulldog.birthYear = 2018;
        myBulldog.smellingSense = "Excellent";
        myBulldog.breed = "English Bulldog";

        // Display information using multilevel inheritance
        myBulldog.displayBulldog();
    }
}
