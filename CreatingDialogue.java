package miniProjects;

import javax.swing.JOptionPane;

public class CreatingDialogue {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your age is "+age);
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
		JOptionPane.showMessageDialog(null, "Your weight is "+weight+ " is that right");
		
		String order = JOptionPane.showInputDialog("Your order please");
		JOptionPane.showMessageDialog(null, "You have ordered "+order);
		

	}

}
