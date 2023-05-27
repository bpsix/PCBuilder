package computer;

import computer.components.Case;
import computer.components.Fan;
import computer.components.GraphicsCard;
import computer.components.Motherboard;
import computer.components.Processor;
import computer.components.Ram;

public class ComputerAdvertisementBuilder implements Builder {

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
	
	public ComputerAdvertisement build() {
		return new ComputerAdvertisement(c, f, gc, mb, p, r);
	}

}
