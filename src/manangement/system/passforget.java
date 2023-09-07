package manangement.system;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class passforget extends JFrame{
	
	JTextField tfusername;
	JButton search;
	
	passforget (){
		setSize(800,600);
		setLocation(300,100);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(0,0,400,600);
		panel1.setLayout(null);
		add(panel1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/forget.png"));
		Image icon1a = icon1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		ImageIcon icon1b = new ImageIcon(icon1a);
		JLabel image1 = new JLabel(icon1b);
		image1.setBounds(10,100,400,390);
		panel1.add(image1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255,255,255));
		panel2.setBounds(400,0,400,600);
		panel2.setLayout(null);
		add(panel2);
		
		JLabel lblcreateAcc = new JLabel("Forgot your Password?");
		lblcreateAcc.setBounds(80, 40, 260, 30);
		lblcreateAcc.setFont(new Font("SAN SERIF", Font.PLAIN,20));
		panel2.add(lblcreateAcc);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(80, 90, 200, 30);
		lblusername.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblusername);
		
		tfusername = new JTextField();
		tfusername.setBounds(80, 120, 200, 30);
		tfusername.setBackground(new Color(235, 236, 240));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfusername);
		
		search = new JButton("Search");
		search.setBackground(new Color(62, 162, 255));
		search.setBorder(BorderFactory.createEmptyBorder());
		search.setForeground(Color.WHITE);
		search.setBounds(80,160,200,30);
		panel2.add(search);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new passforget(); 
	}

}
