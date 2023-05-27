import computer.Computer;
import computer.ComputerAdvertisement;
import computer.ComputerAdvertisementBuilder;
import computer.Director;
import computer.PCBuilder;
import computer.components.GraphicsCard;
import computer.components.Ram;

public class ComputerManufacturerQuoteApp {
	public static void main(String[] args) {
		// New gamer PC:
		
		// Builders - computer builder and advertisement builder
		PCBuilder pcBuilder = new PCBuilder();
		ComputerAdvertisementBuilder adBuilder = new ComputerAdvertisementBuilder();
		
		// Director with pre-planned builds
		Director computerDirector = new Director();
		
		// Build PC
		computerDirector.buildGamerPC(pcBuilder);
		Computer gamerPC = pcBuilder.build();
		
		// Build Advertisement
		computerDirector.buildGamerPC(adBuilder);
		ComputerAdvertisement gamerPCAdvertisement = adBuilder.build();
		
		System.out.println(gamerPCAdvertisement.getAdvertisement());
		
		// Gamer PC with custom parts:
		computerDirector.buildGamerPC(pcBuilder);
		computerDirector.buildGamerPC(adBuilder);
		GraphicsCard customGraphics = new GraphicsCard("NVIDIA Titan XYZ 4000", 5600.00, new Ram("NVIDIA GDDR10", 0.00, 128000));
		adBuilder.setGraphicsCard(customGraphics);
		pcBuilder.setGraphicsCard(customGraphics);
		gamerPC = pcBuilder.build();
		gamerPCAdvertisement = adBuilder.build();
		
		System.out.println("\n" + gamerPCAdvertisement.getAdvertisement());
	}
}
