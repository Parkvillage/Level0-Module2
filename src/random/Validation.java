//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();
for(int i=0; i<10;i++) {
	

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "u are da bomb");


		}
		else if(randomNumber==2){
			JOptionPane.showMessageDialog(null, "U are amazing like the doge");
		}else if(randomNumber==3){
			JOptionPane.showMessageDialog(null, "so good at programing");
		}else if(randomNumber==4){
			JOptionPane.showMessageDialog(null,"U the best in the class");
		}else if(randomNumber==5){
			JOptionPane.showInternalInputDialog(null, "why are you so amazing");
		}else {
			JOptionPane .showMessageDialog(null,"u are hte best!!!");
		}
			
		
	}
	}

	// 2. Repeat all the code above 10 times

	// 3. Find someone to test out your program. They will like it :)


}

