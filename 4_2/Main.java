import sweets.Biscuit;
import sweets.Bubblegum;
import sweets.Chocolate;
import sweets.Sweets;

public class Main {

    public static void main(String[] args) {
        Biscuit biscuit1 = new Biscuit("Oreo", 650, 280, "черный");
        Bubblegum bubblegum1 = new Bubblegum("Love is", 100, 150, 8);
        Chocolate chocolate1 = new Chocolate("Milka", 200, 400, "молочный");
        Chocolate chocolate2 = new Chocolate("Алёнка", 300, 250, "горький");
        Sweets[] box = {biscuit1, bubblegum1, chocolate1, chocolate2};

        double totalWeight = 0;
        double totalPrice = 0;
        System.out.println("Получен подарок из сладостей:");
        for (Sweets someSweet: box) {
            System.out.println(someSweet.toString());
            totalPrice += someSweet.getPrice();
            totalWeight += someSweet.getWeight();
        }
        System.out.println("Общая стоимость подарка: " + totalPrice + ". Общий вес подарка: " + totalWeight + ".");
    }
}
