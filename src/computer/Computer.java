package computer;

import computer.components.*;

public class Computer {

    private final Case c;
    private final Fan f ;
    private final GraphicsCard card;
    private final Motherboard motherboard;
    private final Processor processor;
    private final Ram ram;

    public Computer(Case c, Fan f, GraphicsCard card, Motherboard motherboard, Processor processor, Ram ram) {
        this.c = c;
        this.f = f;
        this.card = card;
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
    }
}
