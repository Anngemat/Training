package Composition;

public class MotherBoard extends Product{

	private int ramSlots;
	private int cardSlots;
	private String bios;
	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super(model, manufacturer);
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public MotherBoard(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}
	public void loadProgram(String programName) {
		System.out.println(programName + " booting up");
	}
}
