package StringManipulation;

public class Manipulation {
	
	public static void main(String[] args) {
		String birthDate= "03.07.2000";
		int startingIndex = birthDate.indexOf("2000");
		String yearOfBirth = birthDate.substring(startingIndex);
		//System.out.println(yearOfBirth);
		String monthOfBirth = birthDate.substring(3,5);
		//System.out.println(monthOfBirth);
		String newDateFormat = String.join("/", "03","07","2000");
		//System.out.println(newDateFormat);
		String birthDateRep = birthDate.replace(".", "/");
		System.out.println(birthDateRep);
		//replaceFirst and replaceAll
		String face = "*";
		System.out.println(face.repeat(3).indent(8));
		
	}

}
