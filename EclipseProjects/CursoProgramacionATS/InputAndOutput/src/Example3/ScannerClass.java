package Example3;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		byte age;
		String fullName, numberPhone, country;
		
		System.out.println("Type your age: ");
		age = scanner.nextByte();
		
		System.out.println("Type your full name: ");
		fullName = scanner.nextLine();
		
		System.out.println("Type your phone number: ");
		numberPhone = scanner.next();
		
		System.out.println("Type your country: ");
		country = scanner.next();
		
		
		System.out.println(age);
		System.out.println(fullName);
		System.out.println(numberPhone);
		System.out.println(country);
		
	}

}
