package Composition;

public class CoffeeMaker {
	
	private boolean hasWorkToDo= false;

	public void doCoffee() {
		if (hasWorkToDo) {
			System.out.println("Do Coffee");
			hasWorkToDo = false;
		}
		
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
}
