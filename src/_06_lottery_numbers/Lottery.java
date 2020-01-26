package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	int ask = new Random().nextInt(6);
	int ask2 = new Random().nextInt(6);
	int ask3 = new Random().nextInt(6);
	int ask4 = new Random().nextInt(6);
	int ask5 = new Random().nextInt(6);
	
	JOptionPane.showMessageDialog(null, ask +" "+ ask2+ " "+ask3+" "+ask4+ " "+ask5);
	
	
	
	
	
	
	
}
}
