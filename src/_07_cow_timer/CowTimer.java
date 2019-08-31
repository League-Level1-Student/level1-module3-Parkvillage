package _07_cow_timer;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CowTimer {

	/* 1. Make a constructor for the CowTimer class that initializes the minutes variable */
	 CowTimer(){
		minutes= 5;
	}
	/* 4. Complete the main method of the CowTimerRunner class */

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow time set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for the number of minutes
		 * using Thread.sleep(int milliseconds). 
		 */
		JOptionPane.showMessageDialog(null,"Do you want to cut the green or red wire");
		playSound("countdown.wav");
		for(int i=minutes; i>=0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		playSound("explosion.wav");
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JLabel label= new JLabel();
        label=loadImageFromWithinProject("explosionimg.jpg");
        frame.add(label);
        frame.pack();
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */
		

	}
	public JLabel loadImageFromWithinProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
