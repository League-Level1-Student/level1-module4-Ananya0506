package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JButton spin = new JButton();
JLabel l1 = new JLabel();
JLabel l2 = new JLabel();
JLabel l3 = new JLabel();
JPanel panel = new JPanel();
Random ran  = new Random();
Random ran2 = new Random();
Random ran3 = new Random();
int r;
int r2;
int r3; 
public void makeReels() {
frame.setVisible(true);
	frame.add(panel);
panel.add(spin);
panel.add(l1);
panel.add(l2);
panel.add(l3);
frame.pack();
spin.setText("SPIN");
spin.addActionListener(this);



}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == spin) {
		r = ran.nextInt(3);
		r2 = ran2.nextInt(3);
		r3 = ran3.nextInt(3);
		if(r==0) {
			l1.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/CherryForSMGame.jpeg"));
		} else if(r==1) {
			l1.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/LemonForSMGame.jpeg"));
		} else if(r==2) {
			l1.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/OrangeForSMGame.jpeg"));
			
		}
		if(r2==0) {
			l2.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/CherryForSMGame.jpeg"));
		} else if(r2==1) {
			l2.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/LemonForSMGame.jpeg"));
		} else if(r2==2) {
			l2.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/OrangeForSMGame.jpeg"));
			
		}
		if(r3==0) {
			l3.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/CherryForSMGame.jpeg"));
		} else if(r3==1) {
			l3.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/LemonForSMGame.jpeg"));
		} else if(r3==2) {
			l3.setIcon(new ImageIcon("/Users/league/git/level1-module4-Ananya0506/src/_10_slot_machine/OrangeForSMGame.jpeg"));
			
		}	
	} 

if (r == r2 && r2 == r3) {
	JOptionPane.showMessageDialog(null, "YOU WON!");
}

}
}