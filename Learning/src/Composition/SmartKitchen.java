package Composition;

public class SmartKitchen {

	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;
	
	public SmartKitchen() {
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
		iceBox = new Refrigerator();
	}
	
	public void addWater()
	{
		iceBox.setHasWorkToDo(true);
	}
	public void pourMilk() {
		brewMaster.setHasWorkToDo(true);
	}
	public void loadDishWasher() {
		dishWasher.setHasWorkToDo(true);
	}
	public void setKitchenState(boolean cf,boolean dw,boolean rf) {
		brewMaster.setHasWorkToDo(rf);
		dishWasher.setHasWorkToDo(dw);
		iceBox.setHasWorkToDo(rf);
	}
	public void doKitchenWork(CoffeeMaker cf,DishWasher dw,Refrigerator rf) {
		cf.doCoffee();
		dw.doDishes();
		rf.orderFood();

	}
}
