package sweets;

public class Bubblegum extends Sweets {
    private int amountInPackage;

    public Bubblegum(String name, double weight, double price, int amountInPackage) {
        super(name, weight, price);
        this.amountInPackage = amountInPackage;
    }

    public int getAmountInPackage() {
        return amountInPackage;
    }

    public void setAmountInPackage(int amountInPackage) {
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String toString() {
        return "Жвачка: " + super.toString() + ", количество штук в пачке: " + amountInPackage;
    }
}
