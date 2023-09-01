package manangement.system;

import javax.swing.*;


public class Zoom extends JFrame {

	Zoom(){
		setSize(800,600);
		setLocation(200,100);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Zoom();

	}

}
