package manangement.system;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Loading extends JFrame implements Runnable{
	
	Thread t;
	JProgressBar bar;
	String username;
	public void run() {
		try {
			for (int i = 1; i <=101; i++)
			{
				int max = bar.getMaximum();
				int value = bar.getValue();
				
				if (value < max ) {
					bar.setValue(bar.getValue() + 1);
				} else {
					setVisible(false);
				}
				Thread.sleep(50);
			}
		} catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	
	Loading(String username){
		this.username = username;
		
		t = new Thread(this);
		
		setSize(800,600);
		setLocation(300,100);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel text = new JLabel("Travel Management Application");
		text.setBounds(100,20,600,50);
		text.setForeground(Color.BLUE);
		text.setFont(new Font("Raleway", Font.BOLD, 40 ));
		add(text);
		
		bar = new JProgressBar();
		bar.setBounds(250,250,300, 35);
		bar.setStringPainted(true);
		add(bar);
		
		JLabel textUser = new JLabel("Welcome " + username);
		textUser.setBounds(20,500,600,50);
		textUser.setForeground(Color.RED);
		textUser.setFont(new Font("Raleway", Font.BOLD, 20 ));
		add(textUser);
		
		t.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Loading("");
	}

}
