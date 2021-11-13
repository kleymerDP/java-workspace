package Example3;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		byte age;
		
		System.out.print("Type your age: ");
		age = scanner.nextByte();
		System.out.println("Your're " + age + " years old.");
		
		
	}

}
