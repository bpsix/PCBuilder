package computer.components;

public class Ram extends Component {

    // In MB
    private int size;

    public Ram(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

}
