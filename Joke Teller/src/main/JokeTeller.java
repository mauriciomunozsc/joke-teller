package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JokeTeller extends Jokes {
	
	//Random number generator 
	static Random rand = new Random();
	//Sets the max number generated to 2 and the min to 1
	//(high) + low... try if not working (high-low) + low
	static Jokes jokes = new Jokes();
	
	static JFrame window = new JFrame("YOU LAUGH, YOU LOSE");
	static JButton button = new JButton("NEW JOKE");
	static JLabel text = new JLabel();
	
	
	//main- prints out the joke
	public static void main(String[] args) 
	{
		jokes.addJokes();
		
		out();
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				out();
			}
		});
		window.setSize(1280,800);
		window.setVisible(true);


	}
	
	public static void out() {
		int random = rand.nextInt(3)+0;
		
		text.setText(Jokes.jokeMap.get(random));
		text.setFont (text.getFont ().deriveFont (64.0f));
		
		button.setFont(button.getFont().deriveFont(20.0f));
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(button, BorderLayout.SOUTH);
		window.getContentPane().add(text, BorderLayout.CENTER);
		
	}
	

}
