package computer;

import computer.components.*;

public class Computer {

    private final Case c;
    private final Fan f;
    private final GraphicsCard gc;
    private final Motherboard mb;
    private final Processor p;
    private final Ram r;

    Computer(Case c, Fan f, GraphicsCard gc, Motherboard mb, Processor p, Ram r) {
        this.c = c;
        this.f = f;
        this.gc = gc;
        this.mb = mb;
        this.p = p;
        this.r = r;
    }

}
