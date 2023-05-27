package computer.components;

public class GraphicsCard extends Component {

    private Ram vram;

    public GraphicsCard(String name, double price, Ram vram) {
        super(name, price);
        this.vram = vram;
    }

}
