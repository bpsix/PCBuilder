package computer.components;

public class Fan extends Component {

    private int rpm;

    public Fan(String name, double price, int rpm) {
        super(name, price);
        this.rpm = rpm;
    }


}
