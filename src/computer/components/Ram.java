package computer.components;

public class Ram extends Component {

    // In MB
    private int size;

    Ram(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Size = " + size + "\n";
    }

    public int getSize() { return size; }

}
