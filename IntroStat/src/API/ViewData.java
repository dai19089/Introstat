package API;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewData extends JFrame{
	public ViewData(EventsC game, EventTicketC eveT) {
		this.setVisible(true);
		getContentPane().setBackground(new Color(128, 0, 128));
		getContentPane().setLayout(null);
		
		setBounds(200, 200, 454, 589);
		
		JLabel lblNewLabel = new JLabel("Statistics");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(155, 11, 127, 53);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 75, 416, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Home:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(52, 120, 69, 21);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Teams:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(52, 88, 93, 21);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Away:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(52, 148, 69, 21);
		getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(42, 191, 351, 2);
		getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Referee:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(52, 202, 93, 21);
		getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(42, 275, 351, 2);
		getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Goal:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 339, 33, 21);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Red Card:");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(89, 339, 59, 21);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Corner:");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(10, 375, 45, 21);
		getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Faul:");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(99, 375, 33, 21);
		getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Offside:");
		lblNewLabel_1_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_4.setBounds(334, 339, 45, 21);
		getContentPane().add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("In Target:");
		lblNewLabel_1_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_1.setBounds(181, 375, 59, 21);
		getContentPane().add(lblNewLabel_1_2_3_1);
		
		JLabel lblNewLabel_1_2_3_2 = new JLabel("Yellow Card:");
		lblNewLabel_1_2_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_2.setBounds(213, 339, 69, 21);
		getContentPane().add(lblNewLabel_1_2_3_2);
		
		JLabel lblNewLabel_1_2_3_3 = new JLabel("Out of Target:");
		lblNewLabel_1_2_3_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_3.setBounds(294, 375, 81, 21);
		getContentPane().add(lblNewLabel_1_2_3_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Location:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(52, 243, 93, 21);
		getContentPane().add(lblNewLabel_2_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(42, 234, 351, 2);
		getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Statistics:");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(170, 284, 93, 21);
		getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel team1L_1 = new JLabel(eveT.getReferee());
		team1L_1.setForeground(Color.WHITE);
		team1L_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_1.setBounds(155, 203, 120, 20);
		getContentPane().add(team1L_1);
		
		JLabel team1L_2 = new JLabel(eveT.getLocation());
		team1L_2.setForeground(Color.WHITE);
		team1L_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_2.setBounds(155, 243, 120, 20);
		getContentPane().add(team1L_2);
		
		JLabel hometeamL = new JLabel(eveT.getHome());
		hometeamL.setForeground(Color.WHITE);
		hometeamL.setFont(new Font("Tahoma", Font.PLAIN, 17));
		hometeamL.setBounds(42, 303, 69, 21);
		getContentPane().add(hometeamL);
		
		JLabel awayTeamL = new JLabel(eveT.getAway());
		awayTeamL.setForeground(Color.WHITE);
		awayTeamL.setFont(new Font("Tahoma", Font.PLAIN, 17));
		awayTeamL.setBounds(42, 407, 69, 21);
		getContentPane().add(awayTeamL);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(42, 404, 351, 2);
		getContentPane().add(separator_1_2);
		
		JLabel team1L_1_1 = new JLabel(eveT.getHome());
		team1L_1_1.setForeground(Color.WHITE);
		team1L_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_1_1.setBounds(109, 121, 120, 20);
		getContentPane().add(team1L_1_1);
		
		JLabel team1L_1_2 = new JLabel(eveT.getAway());
		team1L_1_2.setForeground(Color.WHITE);
		team1L_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_1_2.setBounds(109, 148, 120, 20);
		getContentPane().add(team1L_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Day:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(243, 88, 69, 21);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Month:");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_4.setBounds(243, 126, 69, 21);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel team1L_1_1_1 = new JLabel(eveT.getDay());
		team1L_1_1_1.setForeground(Color.WHITE);
		team1L_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_1_1_1.setBounds(306, 88, 120, 20);
		getContentPane().add(team1L_1_1_1);
		
		JLabel team1L_1_1_2 = new JLabel(eveT.getMonth());
		team1L_1_1_2.setForeground(Color.WHITE);
		team1L_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		team1L_1_1_2.setBounds(306, 126, 120, 20);
		getContentPane().add(team1L_1_1_2);
		
		JLabel lblNewLabel_1_2_5 = new JLabel(String.valueOf(game.getGoal(0)));
		lblNewLabel_1_2_5.setForeground(Color.WHITE);
		lblNewLabel_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_5.setBounds(46, 339, 33, 21);
		getContentPane().add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_6 = new JLabel(String.valueOf(game.getCorner(0)));
		lblNewLabel_1_2_6.setForeground(Color.WHITE);
		lblNewLabel_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_6.setBounds(56, 375, 33, 21);
		getContentPane().add(lblNewLabel_1_2_6);
		
		JLabel lblNewLabel_1_2_7 = new JLabel(String.valueOf(game.getFaul(0)));
		lblNewLabel_1_2_7.setForeground(Color.WHITE);
		lblNewLabel_1_2_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_7.setBounds(138, 375, 33, 21);
		getContentPane().add(lblNewLabel_1_2_7);
		
		JLabel lblNewLabel_1_2_8 = new JLabel(String.valueOf(game.getRedCard(0)));
		lblNewLabel_1_2_8.setForeground(Color.WHITE);
		lblNewLabel_1_2_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_8.setBounds(147, 339, 33, 21);
		getContentPane().add(lblNewLabel_1_2_8);
		
		JLabel lblNewLabel_1_2_9 = new JLabel(String.valueOf(game.getInTargetShoot(0)));
		lblNewLabel_1_2_9.setForeground(Color.WHITE);
		lblNewLabel_1_2_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_9.setBounds(241, 375, 33, 21);
		getContentPane().add(lblNewLabel_1_2_9);
		
		JLabel lblNewLabel_1_2_10 = new JLabel(String.valueOf(game.getYellowCard(0)));
		lblNewLabel_1_2_10.setForeground(Color.WHITE);
		lblNewLabel_1_2_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_10.setBounds(284, 339, 28, 21);
		getContentPane().add(lblNewLabel_1_2_10);
		
		JLabel lblNewLabel_1_2_11 = new JLabel(String.valueOf(game.getOffside(0)));
		lblNewLabel_1_2_11.setForeground(Color.WHITE);
		lblNewLabel_1_2_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_11.setBounds(379, 339, 33, 21);
		getContentPane().add(lblNewLabel_1_2_11);
		
		JLabel lblNewLabel_1_2_12 = new JLabel(String.valueOf(game.getOutOfTargetShoot(0)));
		lblNewLabel_1_2_12.setForeground(Color.WHITE);
		lblNewLabel_1_2_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_12.setBounds(379, 375, 39, 21);
		getContentPane().add(lblNewLabel_1_2_12);
		
		JLabel lblNewLabel_1_2_13 = new JLabel("Goal:");
		lblNewLabel_1_2_13.setForeground(Color.WHITE);
		lblNewLabel_1_2_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_13.setBounds(10, 439, 33, 21);
		getContentPane().add(lblNewLabel_1_2_13);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Red Card:");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(89, 439, 59, 21);
		getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Corner:");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(10, 475, 45, 21);
		getContentPane().add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_3_4 = new JLabel("Faul:");
		lblNewLabel_1_2_3_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_4.setBounds(99, 475, 33, 21);
		getContentPane().add(lblNewLabel_1_2_3_4);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("Offside:");
		lblNewLabel_1_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_4_1.setBounds(334, 439, 45, 21);
		getContentPane().add(lblNewLabel_1_2_4_1);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("In Target:");
		lblNewLabel_1_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_1_1.setBounds(181, 475, 59, 21);
		getContentPane().add(lblNewLabel_1_2_3_1_1);
		
		JLabel lblNewLabel_1_2_3_2_1 = new JLabel("Yellow Card:");
		lblNewLabel_1_2_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_2_1.setBounds(213, 439, 69, 21);
		getContentPane().add(lblNewLabel_1_2_3_2_1);
		
		JLabel lblNewLabel_1_2_3_3_1 = new JLabel("Out of Target:");
		lblNewLabel_1_2_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_3_3_1.setBounds(294, 475, 81, 21);
		getContentPane().add(lblNewLabel_1_2_3_3_1);
		
		JLabel lblNewLabel_1_2_5_1 = new JLabel(String.valueOf(game.getGoal(1)));
		lblNewLabel_1_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_5_1.setBounds(46, 439, 33, 21);
		getContentPane().add(lblNewLabel_1_2_5_1);
		
		JLabel lblNewLabel_1_2_6_1 = new JLabel(String.valueOf(game.getCorner(1)));
		lblNewLabel_1_2_6_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_6_1.setBounds(56, 475, 33, 21);
		getContentPane().add(lblNewLabel_1_2_6_1);
		
		JLabel lblNewLabel_1_2_7_1 = new JLabel(String.valueOf(game.getFaul(1)));
		lblNewLabel_1_2_7_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_7_1.setBounds(138, 475, 33, 21);
		getContentPane().add(lblNewLabel_1_2_7_1);
		
		JLabel lblNewLabel_1_2_8_1 = new JLabel(String.valueOf(game.getRedCard(1)));
		lblNewLabel_1_2_8_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_8_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_8_1.setBounds(147, 439, 33, 21);
		getContentPane().add(lblNewLabel_1_2_8_1);
		
		JLabel lblNewLabel_1_2_9_1 = new JLabel(String.valueOf(game.getInTargetShoot(1)));
		lblNewLabel_1_2_9_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_9_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_9_1.setBounds(241, 475, 33, 21);
		getContentPane().add(lblNewLabel_1_2_9_1);
		
		JLabel lblNewLabel_1_2_10_1 = new JLabel(String.valueOf(game.getYellowCard(1)));
		lblNewLabel_1_2_10_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_10_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_10_1.setBounds(284, 439, 28, 21);
		getContentPane().add(lblNewLabel_1_2_10_1);
		
		JLabel lblNewLabel_1_2_11_1 = new JLabel(String.valueOf(game.getOffside(1)));
		lblNewLabel_1_2_11_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_11_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_11_1.setBounds(379, 439, 33, 21);
		getContentPane().add(lblNewLabel_1_2_11_1);
		
		JLabel lblNewLabel_1_2_12_1 = new JLabel(String.valueOf(game.getOutOfTargetShoot(1)));
		lblNewLabel_1_2_12_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_12_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_12_1.setBounds(379, 475, 39, 21);
		getContentPane().add(lblNewLabel_1_2_12_1);
		
		JButton btnNewButton = new JButton("Back To Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficeMenu offM = new OfficeMenu();
				dispose();
			}
		});
		btnNewButton.setBounds(157, 507, 125, 23);
		getContentPane().add(btnNewButton);
	}
}
