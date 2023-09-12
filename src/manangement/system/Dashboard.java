package manangement.system;

import javax.swing.*;
import java.awt.*;


public class Dashboard extends JFrame{

	Dashboard() {
		//setBounds(-10,0,1385,760);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color (27, 29, 33));
		panel1.setBounds(0,0,1385,65);
		add(panel1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/manclimb.png"));
		Image icon1a = icon1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
		ImageIcon icon1b = new ImageIcon(icon1a);
		JLabel image1 = new JLabel(icon1b);
		image1.setBounds(5,0,70,70);
		panel1.add(image1);
		
		JLabel heading = new JLabel("Dashboard");
		heading.setBounds(80,10,300,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel1.add(heading);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color (27, 29, 33));// (35,37,41);
		panel2.setBounds(0,65,300,760);
		add(panel2);
		
		JButton addPersonalDetails = new JButton("Add Personal Details");
		addPersonalDetails.setBounds(0,0,300,50);
		addPersonalDetails.setBackground(new Color (40,44,47));
		addPersonalDetails.setForeground(Color.WHITE);
		addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addPersonalDetails.setMargin(new Insets(0,0,0,70));
		panel2.add(addPersonalDetails);
		
		JButton updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,50,300,50);
		updatePersonalDetails.setBackground(new Color (40,44,47));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,40));
		panel2.add(updatePersonalDetails);

		JButton viewPersonalDetails = new JButton("View Personal Details");
		viewPersonalDetails.setBounds(0,100,300,50);
		viewPersonalDetails.setBackground(new Color (40,44,47));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,60));
		panel2.add(viewPersonalDetails);

		JButton deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,150,300,50);
		deletePersonalDetails.setBackground(new Color (40,44,47));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,40));
		panel2.add(deletePersonalDetails);

		JButton checkpackages = new JButton("Check Packages");
		checkpackages.setBounds(0,200,300,50);
		checkpackages.setBackground(new Color (40,44,47));
		checkpackages.setForeground(Color.WHITE);
		checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkpackages.setMargin(new Insets(0,0,0,110));
		panel2.add(checkpackages);		

		JButton bookpackage = new JButton("Book Package");
		bookpackage.setBounds(0,250,300,50);
		bookpackage.setBackground(new Color (40,44,47));
		bookpackage.setForeground(Color.WHITE);
		bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bookpackage.setMargin(new Insets(0,0,0,130));
		panel2.add(bookpackage);		

		JButton viewpackage = new JButton("View Package");
		viewpackage.setBounds(0,300,300,50);
		viewpackage.setBackground(new Color (40,44,47));
		viewpackage.setForeground(Color.WHITE);
		viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		viewpackage.setMargin(new Insets(0,0,0,130));
		panel2.add(viewpackage);		

		JButton viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,350,300,50);
		viewhotels.setBackground(new Color (40,44,47));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
		viewhotels.setMargin(new Insets(0,0,0,140));
		panel2.add(viewhotels);
		
		JButton bookhotel = new JButton("Book Hotel");
		bookhotel.setBounds(0,400,300,50);
		bookhotel.setBackground(new Color (40,44,47));
		bookhotel.setForeground(Color.WHITE);
		bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bookhotel.setMargin(new Insets(0,0,0,150));
		panel2.add(bookhotel);
		
		JButton viewbookhotel = new JButton("View Booked Hotel");
		viewbookhotel.setBounds(0,450,300,50);
		viewbookhotel.setBackground(new Color (40,44,47));
		viewbookhotel.setForeground(Color.WHITE);
		viewbookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		viewbookhotel.setMargin(new Insets(0,0,0,80));
		panel2.add(viewbookhotel);
		
		JButton destination = new JButton("Destination");
		destination.setBounds(0,500,300,50);
		destination.setBackground(new Color (40,44,47));
		destination.setForeground(Color.WHITE);
		destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
		destination.setMargin(new Insets(0,0,0,140));
		panel2.add(destination);

		JButton payments = new JButton("Payments");
		payments.setBounds(0,550,300,50);
		payments.setBackground(new Color (40,44,47));
		payments.setForeground(Color.WHITE);
		payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
		payments.setMargin(new Insets(0,0,0,160));
		panel2.add(payments);		
		
		JButton about = new JButton("About");
		about.setBounds(0,600,300,50);
		about.setBackground(new Color (40,44,47));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma", Font.PLAIN, 20));
		about.setMargin(new Insets(0,0,0,190));
		panel2.add(about);		
		
		ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("icons/splash2.jpg"));
		Image image1aa = image1a.getImage().getScaledInstance(1370,780, Image.SCALE_DEFAULT);
		ImageIcon image1bb = new ImageIcon(image1aa);
		JLabel image1a1 = new JLabel(image1bb);
		image1a1.setBounds(0,0,1380,780);
		add(image1a1);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Dashboard();
	}

}
