package API;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hitmap extends JFrame{
	public Hitmap(EventsC eve, EventTicketC eveT, int choice) {
		
		String team;
		if(choice == 0)
			team = eveT.getHome();
		else
			team = eveT.getAway();
		
		double dAttack;
		double attack;
		double lAttack;
		double rAttack;
		double possesion;
		int sum = eve.getDangerousAttack(choice) + eve.getLeftAttack(choice) + eve.getAttack(choice) + eve.getPossesion(choice) + eve.getRightAttack(choice);
		if(sum == 0) {
			JOptionPane.showMessageDialog(null, "There was no actions on the field for the team!");
			dAttack = 0;
			attack = 0;
			lAttack = 0;
			rAttack = 0;
			possesion = 0;
		}
		else {
			dAttack = ((double)eve.getDangerousAttack(choice)) / sum * 100;
			attack = ((double)eve.getAttack(choice)) / sum * 100;
			lAttack = ((double)eve.getLeftAttack(choice)) / sum * 100;
			rAttack = ((double)eve.getRightAttack(choice)) / sum * 100;
			possesion = ((double)eve.getPossesion(choice)) / sum * 100;
		}
		
		this.setVisible(true);
		this.setSize(700, 500);
		
		getContentPane().setBackground(new Color(128, 0, 128));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		panel.setBounds(0, 0, 684, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel(String.valueOf(dAttack)+"%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_5.setBounds(524, 244, 145, 119);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel(String.valueOf(attack)+"%");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(349, 244, 172, 119);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel(String.valueOf(rAttack)+"%");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3_1.setBounds(349, 364, 240, 69);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel(String.valueOf(lAttack)+"%");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(349, 174, 240, 69);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel(String.valueOf(possesion)+"%");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(104, 174, 240, 259);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Hitmap.class.getResource("/gipedo.png")));
		lblNewLabel.setBounds(73, 160, 548, 287);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hitmap");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(272, 23, 152, 47);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 68, 659, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("Team:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(92, 92, 97, 57);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel(team);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_6_1.setBounds(199, 92, 210, 57);
		panel.add(lblNewLabel_6_1);
		
		JButton btnNewButton = new JButton("Bact To Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficeMenu offM = new OfficeMenu();
				dispose();
			}
		});
		btnNewButton.setBounds(468, 112, 113, 32);
		panel.add(btnNewButton);
	}
}
