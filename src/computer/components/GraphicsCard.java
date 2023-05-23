package computer.components;

public class GraphicsCard extends Component {

    private Ram vram;

    GraphicsCard(String name, double price, Ram vram) {
        super(name, price);
        this.vram = vram;
    }

    @Override
    public String toString() {
        return super.toString() + "VRAM = " + vram.getSize() + "\n";
    }
}
