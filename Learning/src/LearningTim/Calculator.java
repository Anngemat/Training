package LearningTim;

public class Calculator {

	private Floor floor;
	private Carpet carpet;
	public Calculator(Floor floor, Carpet carpet) {
		super();
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		return floor.getArea()*carpet.getCost();
	}
}
