package API;

import java.awt.*; 

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame{
	private String username;
	private String password;
	private int identity;
	
	private JTextField usernameTF;
	private JTextField passwordTF;
	public Registration() {
		this.setVisible(true);
		
		getContentPane().setBackground(new Color(128, 0, 128));
		setBounds(100, 100, 299, 482);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setBounds(39, 11, 198, 60);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(39, 117, 81, 14);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setBounds(39, 178, 81, 21);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		usernameTF = new JTextField();
		usernameTF.setBounds(140, 117, 112, 20);
		usernameTF.setColumns(10);
		
		passwordTF = new JTextField();
		passwordTF.setBounds(140, 181, 112, 20);
		passwordTF.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 77, 263, 7);
		
		JButton createAsObserver = new JButton("Observer");
		createAsObserver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		createAsObserver.setBounds(140, 295, 100, 41);
		createAsObserver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = usernameTF.getText();
				password = passwordTF.getText();
				identity = 1;
				Account acc = new Account(username, password, identity);
				if(!acc.checkPassword())
					JOptionPane.showMessageDialog(null, "WRONG PASSWORD TYPE!\nMust contain: At least 1 letter, 1 digit and 8-16 characters!"
							+ "\nMust not contain: Special characters!)\nPlease enter a new password.");
				else {
					if(Main.data.checkUsername(username) == 0) {
						Main.data.setAccountInfo(username, password, identity);
						JOptionPane.showMessageDialog(null, "Account was successfully created");
						Welcome wel = new Welcome();
						dispose();
					}
					else if(Main.data.checkUsername(username) == 1)
						JOptionPane.showMessageDialog(null, "Username must contain 3-15 characters");
					else
						JOptionPane.showMessageDialog(null, "Username allready exists");
				}
			}
		});
		
		JButton createAsOffice = new JButton("Office");
		createAsOffice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = usernameTF.getText();
				password = passwordTF.getText();
				identity = 0;
				Account acc = new Account(username, password, identity);
				if(!acc.checkPassword())
					JOptionPane.showMessageDialog(null, "WRONG PASSWORD TYPE!\nMust contain: At least 1 letter, 1 digit and 8-16 characters!"
							+ "\nMust not contain: Special characters!)\nPlease enter a new password.");
				else {
					if(Main.data.checkUsername(username) == 0) {
						Main.data.setAccountInfo(username, password, identity);
						JOptionPane.showMessageDialog(null, "Account was successfully created");
						Welcome wel = new Welcome();
						dispose();
					}
					else if(Main.data.checkUsername(username) == 1)
						JOptionPane.showMessageDialog(null, "Username must contain 3-15 characters");
					else
						JOptionPane.showMessageDialog(null, "Username allready exists");
				}
			}
		});
		createAsOffice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		createAsOffice.setBounds(39, 295, 91, 41);
		
		JLabel lblNewLabel_2 = new JLabel("Create Account As:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(63, 242, 165, 41);
		getContentPane().setLayout(null);
		getContentPane().add(createAsObserver);
		getContentPane().add(createAsOffice);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(lblNewLabel_1_1);
		getContentPane().add(passwordTF);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(usernameTF);
		getContentPane().add(separator);
		getContentPane().add(lblNewLabel);
		
		JButton BackB = new JButton("Back");
		BackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wel = new Welcome();
				dispose();
			}
		});
		BackB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BackB.setBounds(92, 371, 91, 41);
		getContentPane().add(BackB);
	}
}
