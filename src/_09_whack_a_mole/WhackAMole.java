package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();
JButton b6 = new JButton();
JButton b7 = new JButton();
JButton b8 = new JButton();
JButton b9 = new JButton();
JButton b10 = new JButton();
JButton b11 = new JButton();
JButton b12 = new JButton();
JButton b13 = new JButton();
JButton b14 = new JButton();
JButton b15 = new JButton();
JButton b16 = new JButton();
JButton b17 = new JButton();
JButton b18 = new JButton();
JButton b19 = new JButton();
JButton b20 = new JButton();
JButton b21 = new JButton();
JButton b22 = new JButton();
JButton b23 = new JButton();
JButton b24 = new JButton();
Random r = new Random();
Random rr = new Random();
	int ran;
	int rran;
	int count;
	int wrong;
	Date d = new Date();
	public void drawButtons() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		panel.add(b19);
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);
		frame.setSize(50, 70);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);

		
	for(int i=0; i<10; i++) {
	 ran = r.nextInt(24);
	 if (ran==1) {
			b1.setText("mole!");
		}else if (ran==2) {
			b2.setText("mole!");
		}else if (ran==3) {
			b3.setText("mole!");
		}else if (ran==4) {
			b4.setText("mole!");
		}else if (ran==5) {
			b5.setText("mole!");
		}else if (ran==6) {
			b6.setText("mole!");
		}else if (ran==7) {
			b7.setText("mole!");
		}else if (ran==8) {
			b8.setText("mole!");
		}else if (ran==9) {
			b9.setText("mole!");
		}else if (ran==10) {
			b10.setText("mole!");
		}else if (ran==11) {
			b11.setText("mole!");
		}else if (ran==12) {
			b12.setText("mole!");
		}else if (ran==13) {
			b13.setText("mole!");
		}else if (ran==14) {
			b14.setText("mole!");
		}else if (ran==15) {
			b15.setText("mole!");
		}else if (ran==16) {
			b16.setText("mole!");
		}else if (ran==17) {
			b17.setText("mole!");
		}else if (ran==18) {
			b18.setText("mole!");
		}else if (ran==19) {
			b19.setText("mole!");
		}else if (ran==20) {
			b20.setText("mole!");
		}else if (ran==21) {
			b21.setText("mole!");
		}else if (ran==22) {
			b22.setText("mole!");
		}else if (ran==23) {
			b23.setText("mole!");
		}else if (ran==24) {
			b24.setText("mole!");
		}

	}//endGame(d, count);
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == b1 && ran==1) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
	count++;
	}if (e.getSource() == b2 && ran==2) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b3 && ran==3) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b4 && ran==4) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b5 && ran==5) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b6 && ran==6) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b7 && ran==7) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b8 && ran==8) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b9 && ran==9) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b10 && ran==10) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b11 && ran==11) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b12 && ran==12) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b13 && ran==13) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b14 && ran==14) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b15 && ran==15) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b16 && ran==16) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b17 && ran==17) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b18 && ran==18) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b19 && ran==19) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b20 && ran==20) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b21 && ran==21) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b22 && ran==22) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b23 && ran==23) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} if (e.getSource() == b24 && ran==24) {
		JOptionPane.showMessageDialog(null, "you hit the mole");
		count++;
	} else{
		rran = rr.nextInt(3);
		if(rran==1) {
		speak("you did not hit the mole");
		} else if(rran==3) {
			speak("wrong try again");
			}else if(rran==3) {
				speak("oops better luck next time");
			}
		wrong ++;
	}
		if(wrong == 5) {
		//	endGame(d, count);
			JOptionPane.showMessageDialog(null, "you lost the game");
		}
	}
	
//	private void endGame(Date timeAtStart, int molesWhacked) { 
//	    Date timeAtEnd = new Date();
//	    JOptionPane.showMessageDialog(null, "Your whack rate is "
//	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
//	                  + " moles per second.");
//	}
	

}
