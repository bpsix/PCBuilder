package computer;

import computer.components.Case;
import computer.components.Fan;
import computer.components.GraphicsCard;
import computer.components.Motherboard;
import computer.components.Processor;
import computer.components.Ram;

public class Director {

    public void buildServer(Builder b) {
    	b.reset();
    	b.setCase(new Case("Dell Server Rack Case", 199.99));
    	b.setFan(new Fan("Noctua Server Fan", 24.99, 800));
    	b.setGraphicsCard(new GraphicsCard("NVIDIA Quadro P4000", 1000.00, new Ram("NVIDIA GRAM", 0.00, 8000)));
    	b.setMotherboard(new Motherboard("Dell Server Motherboard 5", 295.50));
    	b.setProcessor(new Processor("Intel Xeon 64-core", 1249.95, 64));
    	b.setRam(new Ram("Micron Server DDR5 RAM", 395.00, 32000));
    }

    public void buildGamerPC(Builder b) {
    	b.reset();
    	b.setCase(new Case("Fractal Torrent", 249.00));
    	b.setFan(new Fan("Noctua NF-A12x25", 32.95, 1200));
    	b.setGraphicsCard(new GraphicsCard("NVIDIA RTX 4090", 1599.99, new Ram("NVIDIA G6X", 0.00, 24000)));
    	b.setMotherboard(new Motherboard("ASUS ROG Crosshair X670E Hero", 699.99));
    	b.setProcessor(new Processor("AMD Ryzen 9 7950X3D", 699.00, 16));
    	b.setRam(new Ram("G.SKILL Trident Z5 RGB", 249.99, 32000));
    }

    public void buildLaptop(Builder b) {
    	b.reset();
    	b.setCase(new Case("Apple MacBook Pro Titanium Case", 750.00));
    	b.setFan(new Fan("Apple Fan", 32.95, 1200));
    	b.setGraphicsCard(new GraphicsCard("Apple Integrated GPU", 600, new Ram("Apple GRAM", 0.00, 8000)));
    	b.setMotherboard(new Motherboard("Apple Integrated Motherboard", 699.99));
    	b.setProcessor(new Processor("Apple M2 Pro", 699.00, 12));
    	b.setRam(new Ram("Micron/Apple DDR3 RAM", 395.00, 32000));
    }

}
