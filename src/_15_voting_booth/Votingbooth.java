package _15_voting_booth;

import javax.swing.JOptionPane;

public class Votingbooth {
public static void main(String[] args) {
	
	String Quantity = JOptionPane.showInputDialog("how old are you? this information is needed to ake sure you are old enough to vote");
	
	int age = Integer.parseInt(Quantity);
	
	
    if (age > 18){
    	JOptionPane.showMessageDialog(null, "you are old enough to decide the next president");
    }
    
    if (age < 18) {
    	JOptionPane.showMessageDialog(null, "no one cares what you think, zoomer");
    }
	
	
	
}
}
