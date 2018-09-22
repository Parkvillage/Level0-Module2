package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String args[]) {
		String height_str = JOptionPane.showInputDialog(null,
				"welcome to the rollercoaster, how tall are you? (in inches)");
		int height_int = Integer.parseInt(height_str);
		if (height_int > 48) {
			JOptionPane.showMessageDialog(null, "You are welcome to ride on the rollercoaster");

		} else {
			JOptionPane.showMessageDialog(null, " You need to grow first");

		}

	}
}
