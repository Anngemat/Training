package Composition;

public class PersonalComputer extends Product {

	private ComputerCase computerCase;
	private Monitor monitor;
	private MotherBoard motherBoard;
	public PersonalComputer(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}
	public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
			MotherBoard motherBoard) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	/*
	public ComputerCase getComputerCase() {
		return computerCase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public MotherBoard getMotherBoard() {
		return motherBoard;
	}
	
	*/
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	public void powerUp() {
		computerCase.pressPowerButton();
		drawLogo();
	}
}
