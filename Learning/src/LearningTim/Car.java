package LearningTim;

public class Car {

	private String make = "Tesla";
	private String model = "Model 3";
	private String color = "Gray";
	private int door= 4;
	private boolean convertible = true;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isConvertible() {
		return convertible;
	}
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	
}
