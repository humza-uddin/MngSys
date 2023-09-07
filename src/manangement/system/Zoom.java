package manangement.system;

import javax.swing.*;
import java.awt.*;

public class Zoom extends JFrame implements Runnable{
	Thread thread;

	Zoom(){
		//Hard coded 
		//setSize(800,600);
		//setLocation(200,100);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash1.jpg"));
		Image icon1a = icon1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
		ImageIcon icon1b = new ImageIcon(icon1a);
		JLabel image1 = new JLabel(icon1b);
		add(image1);
		
		
		setVisible(true);
		thread = new Thread(this);
		thread.start();  // multi-threaded function
	}
	
	public void run() {
		try {

			Thread.sleep(7000);
			//new Login();
			setVisible(false);
		}catch (Exception a) {	}
	}
	
	public static void main(String[] args) {
		Zoom frame = new Zoom();
		
		int x = 1;
		for (int i =1; i <=500; x+=7, i+=6)
		{
			frame.setLocation(580-(x+i)/2,320-(i/2));
			frame.setSize(x+i,i);
			try {
				Thread.sleep(10);
			} catch(Exception a) {}
		}
	}

}
