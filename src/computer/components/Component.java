package computer.components;

public abstract class Component {

    String name;
    double price;

    Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Price = " + price + "\n";
    }

}