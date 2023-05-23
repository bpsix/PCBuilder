package computer.builders;

import computer.components.*;

public interface Builder {

    void reset();

    void setCase(Case c);
    void setFan(Fan f);
    void setGraphicsCard(GraphicsCard card);
    void setMotherboard(Motherboard board);
    void setProcessor(Processor processor);
    void setRam(Ram r);


}
