package sweets;

public class Chocolate extends Sweets {
    private String type;

    public Chocolate() {}

    public Chocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Шоколад: " + super.toString() + ", вид: " + type;
    }
}
