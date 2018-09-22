package methods;

import javax.swing.JOptionPane;

public class Votingbooth {
	public static void main(String args[]) {
		String age_str = JOptionPane.showInputDialog(null, " You want to vote? how old r u?");
		int age_int = Integer.parseInt(age_str);
		if (age_int < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares about what you think!");

		} else {
			JOptionPane.showMessageDialog(null, "who do you think should be the next president? ");
		}

	}

}
