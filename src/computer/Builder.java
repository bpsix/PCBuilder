package computer;

import computer.components.*;

public interface Builder {

    void reset();

    void setCase(Case c);
    void setFan(Fan f);
    void setGraphicsCard(GraphicsCard gc);
    void setMotherboard(Motherboard mb);
    void setProcessor(Processor p);
    void setRam(Ram r);


}
