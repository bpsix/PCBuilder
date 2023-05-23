package computer.components;

public class Fan extends Component {

    private int rpm;

    Fan(String name, double price, int rpm) {
        super(name, price);
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return super.toString() + "RPM = " + rpm + "\n";
    }

}
