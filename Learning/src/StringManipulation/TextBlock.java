package StringManipulation;

public class TextBlock {

	
	public static void main(String[] args) {
		String bulletedList = "print a bulleted list: \n \u2022 First Point ";
		//System.out.println(bulletedList);
		String textBlock = """
				print a bulleted list: 
				\u2022 First Point
				\u2022 Second Point
				 """;
		//System.out.println(textBlock);
		int age = 24;
		int year = 2024;
		//System.out.printf("Your age is %d" , age);
		//System.out.printf("Your age is %d and year is %d" , age,year);
		double random = 202.052;
		String name = "Hasan";
		int index = name.indexOf("a",3);
		System.out.println(index);
		//System.out.printf("Here is a random number: %.2f",random);
		//System.out.printf("Here is the age %6d",age);
		//System.out.printf("Formatted name %10s",name);
		String formatted = String.format("Formatted name %10s", name);
		//System.out.println(formatted);
		
		String b = "B";
		String B = "b";
		StringBuilder c = new StringBuilder();
		c.append("b");
		//System.out.println(b.equalsIgnoreCase(B));
		System.out.println(B.contentEquals(c));
		
		
	}
}
