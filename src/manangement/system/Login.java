package manangement.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login;
	JButton signup,forget;
	JTextField tfusername, tfPassword;
	
	Login(){
		setSize(800,600);
		setLocation(300,100);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 58, 108));
		panel1.setBounds(0,0,400,600);
		panel1.setLayout(null);
		add(panel1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/login2.png"));
		Image icon1a = icon1.getImage().getScaledInstance(315, 380, Image.SCALE_DEFAULT);
		ImageIcon icon1b = new ImageIcon(icon1a);
		JLabel image1 = new JLabel(icon1b);
		image1.setBounds(10,100,400,390);
		panel1.add(image1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255,255,255));
		panel2.setBounds(400,0,400,600);
		panel2.setLayout(null);
		add(panel2);
		
		JLabel lbllogin = new JLabel("Log in");
		lbllogin.setBounds(80, 80, 200, 50);
		lbllogin.setFont(new Font("SAN SERIF", Font.PLAIN,20));
		panel2.add(lbllogin);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(80, 150, 200, 30);
		lblusername.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblusername);
		
		tfusername = new JTextField();
		tfusername.setBounds(80, 180, 200, 30);
		tfusername.setBackground(new Color(235, 236, 240));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(80, 220, 200, 30);
		lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN,14));
		panel2.add(lblpassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(80, 250, 200, 30);
		tfPassword.setBackground(new Color(235, 236, 240));
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(tfPassword);
		
		login = new JButton("Login");
		login.setBackground(new Color(62, 162, 255));
		login.setBorder(BorderFactory.createEmptyBorder());
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		login.setBounds(80,300,200,30);
		panel2.add(login);
		
		forget = new JButton("Forget Password?");
		forget.setBackground(new Color(255, 255, 255));
		forget.setBorder(BorderFactory.createEmptyBorder());
		forget.setForeground(new Color(205, 206, 200));
		forget.setBounds(80,340,200,30);
		forget.addActionListener(this);
		panel2.add(forget);
		
		JLabel lblor = new JLabel("_______________ or _______________");
		lblor.setBounds(80, 380, 200, 30);
		lblor.setFont(new Font("SAN SERIF", Font.PLAIN,10));
		lblor.setForeground(new Color(225, 226, 220));
		panel2.add(lblor);

		
		signup = new JButton("Sign Up");
		signup.setBackground(new Color(62, 162, 255));
		signup.setBorder(BorderFactory.createEmptyBorder());
		signup.setForeground(Color.WHITE);
		signup.setBounds(80,410,200,30);
		signup.addActionListener(this);
		panel2.add(signup);
		

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == login)
		{
			try {
				String username = tfusername.getText();
				String password = tfPassword.getText();
				
				String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
				Jdconn c = new Jdconn();
				ResultSet rs = c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Loading(username);
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect username and password");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		} else if(ae.getSource()== forget) {
			setVisible(false);
			new passforget();
		}
		else if(ae.getSource() == signup) {
			setVisible(false);
			new Signup();
		}
	}
	
	public static void main(String[] args) {
		Login L = new Login();
		
	}
}
