package computer.components;

public class Processor extends Component {

    private int cores;

    Processor(String name, double price, int cores) {
        super(name, price);
        this.cores = cores;
    }

    @Override
    public String toString() {
        return super.toString() + "Cores = " + cores + "\n";
    }
}
