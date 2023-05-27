package computer;

import computer.components.*;

public class PCBuilder implements Builder {

    private Case c;
    private Fan f;
    private GraphicsCard gc;
    private Motherboard mb;
    private Processor p;
    private Ram r;

    @Override
    public void reset() {
        this.c = null;
        this.f = null;
        this.gc = null;
        this.mb = null;
        this.p = null;
        this.r = null;
    }

    @Override
    public void setCase(Case c) {
        this.c = c;
    }

    @Override
    public void setFan(Fan f) {
        this.f = f;
    }

    @Override
    public void setGraphicsCard(GraphicsCard gc) {
        this.gc = gc;
    }

    @Override
    public void setMotherboard(Motherboard mb) {
        this.mb = mb;
    }

    @Override
    public void setProcessor(Processor p) {
        this.p = p;
    }

    @Override
    public void setRam(Ram r) {
        this.r = r;
    }

    public Computer build() {
        Computer computer = new Computer(c, f, gc, mb, p, r);
        this.reset();
        return computer;
    }

}
