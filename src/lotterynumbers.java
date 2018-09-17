import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
	public static void main(String[] args) {
		String message = "";
		Random ticket = new Random();

		for (int i = 0; i < 5; i++) {
			int num = ticket.nextInt(60);
			message += num;
			message += " ";
		}

		JOptionPane.showMessageDialog(null, message);
	}
}
