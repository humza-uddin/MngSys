package manangement.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame{

	JLabel lblusername,labelusername, lblId, lblnumber, lblName,labelName;
	JTextField tfNumber;
	JComboBox comboId;
	JRadioButton rmale, rfemale;
	
	AddCustomer(){
		setBounds(200,100,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255,255,255));
		panel2.setBounds(0,0,500,550);
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
		lblId.setBounds(30, 90, 150, 30);
		lblId.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblId);

		comboId = new JComboBox(new String[] { "Passport", "CNIC Card", "Medical Card", "Employment/Student Card"});
		comboId.setBounds(220, 90, 200, 30);
		comboId.setBackground(Color.WHITE);
		comboId.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(comboId);
		
		lblnumber = new JLabel("Number");
		lblnumber.setBounds(30, 130, 150, 30);
		lblnumber.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		lblnumber.setForeground(Color.BLACK);
		panel2.add(lblnumber);
		
		tfNumber = new JTextField();
		tfNumber.setBounds(220, 130, 200, 30);
		tfNumber.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(tfNumber);
		
		lblName = new JLabel("Name");
		lblName.setBounds(30, 170, 150, 30);
		lblName.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblName);
		
		labelName = new JLabel();
		labelName.setBounds(220, 170, 150, 30);
		panel2.add(labelName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(30, 210, 150, 30);
		lblGender.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblGender);
		
		rmale = new JRadioButton("Male");
		rmale.setBounds(220, 210, 70, 30);
		rmale.setBackground(Color.WHITE);
		panel2.add(rmale);
		
		rfemale = new JRadioButton("Female");
		rfemale.setBounds(300, 210, 70, 30);
		rfemale.setBackground(Color.WHITE);
		panel2.add(rfemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rmale);
		bg.add(rfemale);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddCustomer();

	}

}
