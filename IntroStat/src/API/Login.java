package API;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame{
	private JTextField usernameTF;
	private JPasswordField passwordTF;
	public Login() {
		
		this.setVisible(true);
		getContentPane().setBackground(new Color(128, 0, 128));
		getContentPane().setLayout(null);
		setBounds(100, 100, 350, 500);
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(132, 11, 80, 45);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 67, 319, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(43, 128, 89, 23);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(43, 186, 80, 14);
		getContentPane().add(lblNewLabel_1_1);
	
		JButton loginB = new JButton("Login");
		loginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Account acc = Main.data.findAccountByUsername(usernameTF.getText());
				if(acc == null)
					JOptionPane.showMessageDialog(null, "Wrong Username!");
				else {
					if(acc.getPassword().equals(passwordTF.getText())) {
						JOptionPane.showMessageDialog(null, "login was successful!");
						if(acc.getIdentity() == 1) {
							EventTicket eveT = new EventTicket();
						}else {
							OfficeMenu offM = new OfficeMenu();
						}
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Wrong Password!");
				}
			}
		});
		loginB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginB.setBounds(73, 299, 89, 38);
		getContentPane().add(loginB);
		
		usernameTF = new JTextField();
		usernameTF.setBounds(157, 132, 121, 20);
		getContentPane().add(usernameTF);
		usernameTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(157, 186, 121, 23);
		getContentPane().add(passwordTF);
		
		JButton backB = new JButton("Back");
		backB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome wel = new Welcome();
				dispose();
			}
		});
		backB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backB.setBounds(172, 299, 89, 38);
		getContentPane().add(backB);
	}
}
