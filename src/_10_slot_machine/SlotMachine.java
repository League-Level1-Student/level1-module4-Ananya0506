package _10_slot_machine;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame = new JFrame();
JButton spin = new JButton();
JLabel label = new JLabel();
JPanel panel = new JPanel();
Random ran  = new Random();
int r;
public void makeReels() {
frame.setVisible(true);
	frame.add(panel);
panel.add(spin);
panel.add(label);
spin.setText("SPIN");
r = ran.nextInt(3);
if(r==1) {
	label.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/CherryForSMGame.jpeg"));
} else if(r==2) {
	label.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/LemonForSMGame.jpeg"));
} else if(r==3) {
	label.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/OrangeForSMGame.jpeg"));
	
}




}
}