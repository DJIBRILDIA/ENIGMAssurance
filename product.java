import java.util.ArrayList;

public abstract class product {
    protected String name;
    protected double price;

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType();
}
