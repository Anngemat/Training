package Composition;

public class ComputerCase extends Product {
	private String powerSupply;
	
	public ComputerCase(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public ComputerCase(String model, String manufacturer, String powerSupply) {
		super(model, manufacturer);
		this.powerSupply = powerSupply;
	}

	public void pressPowerButton() {
		System.out.println("Computer Opening");
	}
}
