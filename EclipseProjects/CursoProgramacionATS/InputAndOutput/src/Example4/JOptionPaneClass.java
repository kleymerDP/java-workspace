package Example4;

import javax.swing.JOptionPane;

public class JOptionPaneClass {
	
	/*
	 * Data input and output using JOptionPane class.
	 */
	
	public static void main(String[] args) {
		
		String fullName;
		fullName = JOptionPane.showInputDialog("Write your full name:");
		JOptionPane.showMessageDialog(null, "Your full name is: "+ fullName);
		
		byte age;
		age = Byte.parseByte(JOptionPane.showInputDialog("Write your age: "));
		JOptionPane.showMessageDialog(null, "You are "+ age +" years old.");
		
		float monthlySalary;
		monthlySalary = Float.parseFloat(JOptionPane.showInputDialog("How much is your monthly salary?"));
		JOptionPane.showMessageDialog(null, "$"+ monthlySalary);
		
	}
	
}
