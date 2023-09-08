package manangement.system;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class passforget extends JFrame implements ActionListener{
	
	JTextField tfusername, tfEmail, tfFirstname,tfPassword;
	JButton search,recover,back;
	
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
		search.addActionListener(this);
		panel2.add(search);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setBounds(80, 210, 200, 30);
		lblFirstname.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblFirstname);
		
		tfFirstname = new JTextField();
		tfFirstname.setBounds(80, 240, 200, 30);
		tfFirstname.setBackground(new Color(235, 236, 240));
		tfFirstname.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfFirstname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(80, 270, 200, 30);
		lblEmail.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(80, 300, 200, 30);
		tfEmail.setBackground(new Color(235, 236, 240));
		tfEmail.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfEmail);
		
		recover = new JButton("Recover");
		recover.setBackground(new Color(62, 162, 255));
		recover.setBorder(BorderFactory.createEmptyBorder());
		recover.setForeground(Color.WHITE);
		recover.setBounds(80,340,200,30);
		recover.addActionListener(this);
		panel2.add(recover);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(80, 380, 200, 30);
		lblPassword.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblPassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(80, 410, 200, 30);
		tfPassword.setBackground(new Color(235, 236, 240));
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfPassword);
		
		back = new JButton("Back");
		back.setBackground(new Color(62, 162, 255));
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setForeground(Color.WHITE);
		back.setBounds(80,460,200,30);
		back.addActionListener(this);
		panel2.add(back);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == search) {
			try {
				String query = "select * from account where username = '"+tfusername.getText()+"'";	
				Jdconn c = new Jdconn();
				
				ResultSet rs = c.s.executeQuery(query);
				while(rs.next()) {
					tfFirstname.setText(rs.getString("firstname"));
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if (ae.getSource() == recover) {
			try {
				String query = "select * from account where email = '"+tfEmail.getText()+"' AND username = '"+tfusername.getText()+"'";	
				Jdconn c = new Jdconn();
				
				ResultSet rs = c.s.executeQuery(query);
				while(rs.next()) {
					tfPassword.setText(rs.getString("password"));
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			setVisible(false);
			new Login();
		}
	
	}
	
	public static void main(String[] args) {
		new passforget(); 
	}

}
