package Composition;

public class Refrigerator {

	private boolean hasWorkToDo = false;
	
	public void orderFood() {
		if (hasWorkToDo) {
			System.out.println("Food ordered");
			hasWorkToDo = false;
		}
		
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

}
