package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	
	String Quantity = JOptionPane.showInputDialog("how tall are you (in inches) ");
	
	int hight = Integer.parseInt(Quantity);
	
	if (hight > 48  ) {
		JOptionPane.showMessageDialog(null, "good, you are able to ride the roller coaster with a 70% chance of survival now instead of 20%");
	}
	
	if (hight < 48 ) {
		JOptionPane.showMessageDialog(null, "you are not tall enough to ride safely. survival rate: 20% ");
	}
}
}

