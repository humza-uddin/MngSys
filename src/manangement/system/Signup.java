package manangement.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Signup extends JFrame{

	Signup(){
		setSize(800,600);
		setLocation(300,100);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(0,0,400,600);
		panel1.setLayout(null);
		add(panel1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/backpack.png"));
		Image icon1a = icon1.getImage().getScaledInstance(400, 251, Image.SCALE_DEFAULT);
		ImageIcon icon1b = new ImageIcon(icon1a);
		JLabel image1 = new JLabel(icon1b);
		image1.setBounds(10,100,400,390);
		panel1.add(image1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255,255,255));
		panel2.setBounds(400,0,400,600);
		panel2.setLayout(null);
		add(panel2);
		
		JLabel lblcreateAcc = new JLabel("Create an Account");
		lblcreateAcc.setBounds(80, 40, 200, 30);
		lblcreateAcc.setFont(new Font("SAN SERIF", Font.PLAIN,20));
		panel2.add(lblcreateAcc);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(80, 90, 200, 30);
		lblusername.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblusername);
		
		JTextField tfusername = new JTextField();
		tfusername.setBounds(80, 120, 200, 30);
		tfusername.setBackground(new Color(235, 236, 240));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfusername);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setBounds(80, 150, 200, 30);
		lblFirstname.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblFirstname);
		
		JTextField tfFirstname = new JTextField();
		tfFirstname.setBounds(80, 180, 200, 30);
		tfFirstname.setBackground(new Color(235, 236, 240));
		tfFirstname.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfFirstname);
		
		JLabel lblLastname = new JLabel("Username");
		lblLastname.setBounds(80, 90, 200, 30);
		lblLastname.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblLastname);
		
		JTextField tfLastname = new JTextField();
		tfLastname.setBounds(80, 120, 200, 30);
		tfLastname.setBackground(new Color(235, 236, 240));
		tfLastname.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfLastname);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Signup S = new Signup();
	}
}
