package Example2;

public class TypeOfVariables {
	
	public static void main(String[] args) {
		
		// primitive data types
		
		byte age = 21;
		short cavePaintings = 30000;
		int timeInhabitedDinosaurs = 160000000;
		long sunAge = 4603;
		
		System.out.println("Your age is: " + age +".");
		System.out.println("Cave paintings " + cavePaintings + " years ago.");
		System.out.println("Dinosaurs inhabited the Earth for more than " + timeInhabitedDinosaurs + " million years.");
		System.out.println("The age of the sun is: " + sunAge + " billion years old.");
		
		float firstDecimal = 354.5654f;
		double secondDecimal = 356.645651684651;
		
		System.out.println("\nFirst Denimal is: " + firstDecimal);
		System.out.println("Second Denimal is: " + secondDecimal);
		
		char character = 'K';
		
		System.out.println("\nThe character is: " + character);
		
		boolean condition = true;	//or false
		
		System.out.println("\nThe condition is: " + condition);
		
		
		// NON-PRIMITIVE VARIABLES
		
		Integer numberNonPrimitive = 168451;	// or null
		System.out.println("\n\nThe number is: " + numberNonPrimitive);
		
		String fullName = "Alan Miguel Jackson Ween";	// or null
		System.out.println("\nThe full name is : " + fullName);
		
		
		// CONSTANTES
		
		final short sunDeath = 5000;
		System.out.println("The sun is going to die in about " + sunDeath + " million years");
	}
	
}
