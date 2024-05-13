package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random r = new Random();
int q =r.nextInt(4);
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
String question= JOptionPane.showInputDialog("ASK YOUR QUESTION!!! Remember, you only get ONE, so CHOOSE WISELY!");
	// 5. If the random number is 0

if(q==0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "YES!!!");
	// 6. If the random number is 1
} else if (q==1) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "NO!!!");
	// 7. If the random number is 2
} else if (q==2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null, "ASK ANOTHER ALL KNOWING THING-- GOOGLE!!!!");
	// 8. If the random number is 3
} else if (q==3) {
	// -- write your own answer
	JOptionPane.showMessageDialog(null, "NEVER EVER speak of that again...");
}
}
}
