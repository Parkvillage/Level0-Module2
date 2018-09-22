package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */

		// String animal = JOptionPane.showInputDialog(null, "whats your animal?");

		/* 2. Make it so that the user can keep entering new animals. */

		for (int i = 0; i < 5; i++) {
			String animal = JOptionPane.showInputDialog(null, "");
			if (animal.equals("cow")) {
				playMoo();
			}
			if (animal.equals("duck")) {
				playQuack();
			}
			if (animal.equals("dog")) {
				playWoof();
			}
			if (animal.equals("cat")) {
				playMeow();
			}
			if (animal.equals("llama")) {
				playLlama();
			}

		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
