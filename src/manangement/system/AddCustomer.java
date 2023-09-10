package manangement.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame{

	JLabel lblusername,labelusername,lblId;
	
	AddCustomer(){
		setBounds(200,100,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255,255,255));
		panel2.setBounds(0,0,350,550);
		panel2.setLayout(null);
		add(panel2);	
		
		lblusername = new JLabel("Username");
		lblusername.setBounds(30, 50, 150, 30);
		lblusername.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblusername);
		
		labelusername = new JLabel();
		labelusername.setBounds(220, 50, 150, 30);
		panel2.add(labelusername);
		
		lblId = new JLabel("ID");
		lblId.setBounds(30, 90, 200, 30);
		lblId.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblId);

		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddCustomer();

	}

}
