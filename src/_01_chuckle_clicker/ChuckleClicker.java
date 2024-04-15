package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {
makeButtons();
	}

	static void makeButtons() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
b1.setText("joke");
b2.setText("punchline");
panel.add(b1);
panel.add(b2);
frame.add(panel);

	}
	
}
