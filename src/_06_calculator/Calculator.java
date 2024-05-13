package _06_calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

	
	static JTextField nummy1 = new JTextField();
static JTextField nummy2 = new JTextField();
JFrame frame = new JFrame();
static JLabel label = new JLabel();
static Double num1 = Double.parseDouble(nummy1.getText());
static Double num2 = Double.parseDouble(nummy2.getText());
static Double num3;

	
	public static void add() {
		num3 = num1+num2;
}
public static void subtract() {
		num3 = num1-num2;
	}
public static void multiply() {
	num3 = num1*num2; 
}
public static void divide() {
	num3 = num1/num2;
}
}
