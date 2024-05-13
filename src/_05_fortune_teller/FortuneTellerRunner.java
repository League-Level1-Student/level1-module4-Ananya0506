package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
JOptionPane.showMessageDialog(null, "Welcome. Here is your hint to the SECRET LOCATION: it's closest to the top left corner. If you guess the secret location, you get to ask a question to ME, THE ALL KNOWING FORTUNE-TELLER!!! Good luck!");
    }
}
