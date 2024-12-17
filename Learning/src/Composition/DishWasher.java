package Composition;

public class DishWasher {

	private boolean hasWorkToDo = false;

	public void doDishes() {
		if (hasWorkToDo) {
			System.out.println("Do the dishes");
			hasWorkToDo = false;
		}
		
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
}
