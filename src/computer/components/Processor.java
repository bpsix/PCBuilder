package computer.components;

public class Processor extends Component {

    private int cores;

    public Processor(String name, double price, int cores) {
        super(name, price);
        this.cores = cores;
    }

}
