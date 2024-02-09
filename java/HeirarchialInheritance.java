class Drink {
    String name;
    String type;

    void displayDrink() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

class SodaDrink extends Drink {
    String flavor;

    void displaySodaDrink() {
        displayDrink();
        System.out.println("Flavor: " + flavor);
    }
}

class WithoutSoda extends Drink {
    String ingredient;
    boolean soda;

    void displayWithoutSoda() {
        displayDrink();
        System.out.println("Ingredient: " + ingredient);
        System.out.println("soda " + soda);
    }
}

public class HeirarchialInheritance {
    public static void main(String[] args) {
        SodaDrink soda = new SodaDrink();
        soda.name = "Coca-Cola";
        soda.type = "Carbonated";
        soda.flavor = "Cola";

        WithoutSoda withoutSoda = new WithoutSoda();
        withoutSoda.name = "Orange Juice";
        withoutSoda.type = "juice";
        withoutSoda.ingredient = "Orange";

        System.out.println("Soda Drink Information:");
        soda.displaySodaDrink();

        System.out.println("\nWithout Soda Drink Information:");
        withoutSoda.displayWithoutSoda();
    }
}
