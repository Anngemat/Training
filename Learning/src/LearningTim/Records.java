package LearningTim;

import java.util.ArrayList;

record Grocery(int a) {
	
}
public class Records {

	public static void main(String[] args) {
		Grocery grocery = new Grocery(2);
		ArrayList objectList = new ArrayList<Grocery>();
		objectList.add(grocery);
		objectList.add(new Grocery(5));
		ArrayList StringList = new ArrayList<String>();
		StringList.add("Hasan");
		
		System.out.println(objectList.toString());
		System.out.println(StringList);
	}
}
