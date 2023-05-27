package computer;

import computer.components.Case;
import computer.components.Fan;
import computer.components.GraphicsCard;
import computer.components.Motherboard;
import computer.components.Processor;
import computer.components.Ram;

public class ComputerAdvertisement {

    private final Case c;
    private final Fan f;
    private final GraphicsCard gc;
    private final Motherboard mb;
    private final Processor p;
    private final Ram r;

    ComputerAdvertisement(Case c, Fan f, GraphicsCard gc, Motherboard mb, Processor p, Ram r) {
        this.c = c;
        this.f = f;
        this.gc = gc;
        this.mb = mb;
        this.p = p;
        this.r = r;
    }
    
    public String getAdvertisement() {
    	return "Case:\t" + c.getName() + "\n" +
    			"Fan:\t" + f.getName() + "\n" +
    			"GPU:\t" + gc.getName() + "\n" +
    			"Mobo:\t" + mb.getName() + "\n" +
    			"CPU:\t" + p.getName() + "\n" +
    			"RAM:\t" + r.getName() + "\n" +
    			"all that for ONLY $" + (c.getPrice() + f.getPrice() + gc.getPrice() + mb.getPrice() + p.getPrice() + r.getPrice()) + "!!!!";
    }

}