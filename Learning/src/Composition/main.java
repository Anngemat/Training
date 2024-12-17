package Composition;

public class main {

	
	
	public static void main(String[] args) {
		MotherBoard mb = new MotherBoard("model","Manufacturer",4,6,"Bios");
		Monitor m = new Monitor("model","Manufacturer",15,"1920x1080");
		ComputerCase cc = new ComputerCase("model","Manufacturer","PowerSupply");
		PersonalComputer pc = new PersonalComputer("model","Manufacturer",cc,m,mb);
		pc.powerUp();
		SmartKitchen sk = new SmartKitchen();
		
	}
}
