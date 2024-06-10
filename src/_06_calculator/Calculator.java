package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	
	 JTextField nummy1 = new JTextField();
 JTextField nummy2 = new JTextField();
 JFrame frame = new JFrame();
JPanel panel = new JPanel();
 JLabel label = new JLabel();
 Double num1; 
 Double num2;
 Double num3;
 JButton b1 = new JButton();
 JButton b2 = new JButton();
 JButton b3 = new JButton();
 JButton b4 = new JButton();

	public void add() {
		num1 = Double.parseDouble(nummy1.getText());
		num2 = Double.parseDouble(nummy2.getText());
		num3 = num1+num2;
		String nummy3 = String.valueOf(num3);
		label.setText(nummy3);
	}
public void subtract() {
		num1 = Double.parseDouble(nummy1.getText());
	num2 = Double.parseDouble(nummy2.getText());
	num3 = num1-num2;
		String nummy3 = String.valueOf(num3);
		label.setText(nummy3);
}
public void multiply() {
	num1 = Double.parseDouble(nummy1.getText());
	num2 = Double.parseDouble(nummy2.getText());
	num3 = num1*num2; 
	String nummy3 = String.valueOf(num3);
	label.setText(nummy3);
}
public void divide() {
	num1 = Double.parseDouble(nummy1.getText());
	num2 = Double.parseDouble(nummy2.getText());
	num3 = num1/num2;
	String nummy3 = String.valueOf(num3);
	label.setText(nummy3);
}


public void createGUI() {
	frame.setVisible(true);
nummy1.setSize(50, 20);
nummy2.setSize(50, 20);
	frame.add(panel);
	panel.add(b1);
	panel.add(b3);
	panel.add(b2);
	panel.add(b4);
	panel.add(nummy2);
	panel.add(nummy1);
	panel.add(label);
frame.pack();
b1.setText("add");
b2.setText("subtract");
b3.setText("multiply");
b4.setText("divide");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == b1) {
	add();
} else if (e.getSource() == b2) {
	subtract();
} else if (e.getSource() == b3) {
	multiply();
} else if (e.getSource() == b4) {
	divide();
}
	
	
	
	
}
}
