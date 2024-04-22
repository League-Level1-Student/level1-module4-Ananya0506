package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
ChuckleClicker chuckleClicker = new ChuckleClicker();
chuckleClicker.makeButtons();
	}
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	public void makeButtons() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
b1.setText("joke");
b2.setText("punchline");
panel.add(b1);
panel.add(b2);
frame.add(panel);
b1.addActionListener(this);
b2.addActionListener(this);
frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Do you want to hear a construction joke?\n Sorry, I'm still working on it.");
		} else if(e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "I failed math so many times at school, I can’t even count.");
		}
		
		
	}
	
}
