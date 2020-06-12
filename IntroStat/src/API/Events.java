package API;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class Events extends JFrame{
	
	private int goal[] = new int[2];
	private	int redCard[] = new int[2];
	private	int yellowCard[] = new int[2];
	private	int dangerousAttack[] = new int[2];
	private int attack[] = new int[2];
	private int leftAttack[] = new int[2];
	private int rightAttack[] = new int[2];
	private int possesion[] = new int[2];
	private int offside[] = new int[2];
	private	int corner[] = new int[2];
	private int faul[] = new int[2];
	private	int inTargetShoot[] = new int[2];
	private	int outOfTargetShoot[] = new int[2];
	private	int chances[] = new int[2];
	private int team = 2;
	
	public Events() {
		
		double performance[] = new double[3];
		performance[0] = 2.4;
		performance[1] = 2.6;
		performance[2] = 2.5;
		
		this.setVisible(true);
		
		getContentPane().setBackground(new Color(0, 128, 0));
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setLayout(null);
		
		setBounds(200, 200, 600, 600);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 217, 548, 287);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 100, 0));
		panel_1.setForeground(Color.MAGENTA);
		panel_1.setBounds(10, 11, 548, 201);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel p1 = new JLabel(String.valueOf(performance[0]));
		p1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.setBounds(399, 103, 39, 14);
		panel_1.add(p1);
		
		JLabel pX = new JLabel(String.valueOf(performance[2]));
		pX.setHorizontalAlignment(SwingConstants.CENTER);
		pX.setBounds(448, 103, 41, 14);
		panel_1.add(pX);
		
		JLabel p2 = new JLabel(String.valueOf(performance[1]));
		p2.setHorizontalAlignment(SwingConstants.CENTER);
		p2.setBounds(492, 103, 46, 14);
		panel_1.add(p2);
		
		panel.setLayout(null);
		
		JButton attackB = new JButton("");
		attackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(team == 0 || team == 1) {
					attack[team]++;
					performance[team] -= (performance[team]-1)/9;
					if(team == 0) {
						performance[1] += (performance[1]-1)/9;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/13;
						else
							performance[2] -= (performance[2]-1)/13;
					}
					else {
						performance[0] += (performance[0]-1)/9;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/13;
						else
							performance[2] -= (performance[2]-1)/13;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		
		JButton rightAttackB = new JButton("");
		rightAttackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1) {
					rightAttack[team]++;
					performance[team] -= (performance[team]-1)/10;
					if(team == 0) {
						performance[1] += (performance[1]-1)/10;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/15;
						else
							performance[2] -= (performance[2]-1)/15;
					}
					else {
						performance[0] += (performance[0]-1)/10;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/15;
						else
							performance[2] -= (performance[2]-1)/15;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		
		JButton dangerousAttackB = new JButton("");
		dangerousAttackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1) {
					dangerousAttack[team]++;
					performance[team] -= (performance[team]-1)/7;
					if(team == 0) {
						performance[1] += (performance[1]-1)/7;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/10;
						else
							performance[2] -= (performance[2]-1)/10;
					}
					else {
						performance[0] += (performance[0]-1)/7;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/10;
						else
							performance[2] -= (performance[2]-1)/10;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		
		JButton possesionB = new JButton("");
		possesionB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1)
					possesion[team]++;
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		possesionB.setBounds(35, 11, 230, 265);
		possesionB.setIcon(new ImageIcon(Events.class.getResource("/possesion.png")));
		panel.add(possesionB);
		
		JButton leftAttackB = new JButton("");
		leftAttackB.setBounds(292, 11, 228, 74);
		panel.add(leftAttackB);
		leftAttackB.setIcon(new ImageIcon(Events.class.getResource("/LAttack.png")));
		
		leftAttackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(team == 0 || team == 1) {
					leftAttack[team]++;
					performance[team] -= (performance[team]-1)/10;
					if(team == 0) {
						performance[1] += (performance[1]-1)/10;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/15;
						else
							performance[2] -= (performance[2]-1)/15;
					}
					else {
						performance[0] += (performance[0]-1)/10;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/15;
						else
							performance[2] -= (performance[2]-1)/15;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		dangerousAttackB.setIcon(new ImageIcon(Events.class.getResource("/DAttack.png")));
		dangerousAttackB.setBounds(452, 84, 58, 119);
		panel.add(dangerousAttackB);
		rightAttackB.setBounds(294, 202, 226, 74);
		rightAttackB.setIcon(new ImageIcon(Events.class.getResource("/RAttack.png")));
		panel.add(rightAttackB);
		attackB.setIcon(new ImageIcon(Events.class.getResource("/Attack.png")));
		attackB.setBounds(275, 84, 167, 119);
		panel.add(attackB);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 548, 287);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Events.class.getResource("/gipedo.png")));
		
		JRadioButton team1S = new JRadioButton("TEAM 1");
		team1S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				team = 0;
			}
		});
		team1S.setBounds(10, 32, 84, 42);
		panel_1.add(team1S);
		
		JRadioButton team2S = new JRadioButton("TEAM 2");
		team2S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				team = 1;
			}
		});
		team2S.setBounds(103, 32, 84, 42);
		panel_1.add(team2S);
		
		ButtonGroup group = new ButtonGroup();
		group.add(team1S);
		group.add(team2S);
		
		JButton finishedB = new JButton("MATCH \r\nFINISHED");
		finishedB.setFont(new Font("Tahoma", Font.BOLD, 15));
		finishedB.setForeground(Color.DARK_GRAY);
		finishedB.setBackground(new Color(255, 0, 0));
		finishedB.setBackground(Color.red);
		finishedB.setOpaque(true);
		finishedB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chances[0] = inTargetShoot[0] + outOfTargetShoot[0];
				chances[1] = inTargetShoot[1] + outOfTargetShoot[1];
				Main.data.setEventsInfo(goal, redCard, yellowCard, dangerousAttack, attack,	leftAttack, rightAttack, possesion,	offside, corner, faul, inTargetShoot, outOfTargetShoot,	chances);
				Welcome wel = new Welcome();
				dispose();
			}
		});
		finishedB.setBounds(305, 133, 204, 57);
		panel_1.add(finishedB);
		
		JButton rCardB = new JButton("RED CARD");
		rCardB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(team == 0 || team == 1) {
					redCard[team]++;
					performance[team] -= (performance[team]-1)/5;
					if(team == 0) {
						performance[1] += (performance[1]-1)/5;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/7;
						else
							performance[2] -= (performance[2]-1)/7;
					}
					else {
						performance[0] += (performance[0]-1)/5;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/7;
						else
							performance[2] -= (performance[2]-1)/7;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		rCardB.setBounds(10, 167, 118, 23);
		panel_1.add(rCardB);
		
		JButton yCardB = new JButton("YELLOW CARD");
		yCardB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1)
					yellowCard[team]++;
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		yCardB.setBounds(10, 133, 118, 23);
		panel_1.add(yCardB);
		
		JButton offsideB = new JButton("OFFSIDE");
		offsideB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1)
					offside[team]++;
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		offsideB.setBounds(138, 99, 118, 23);
		panel_1.add(offsideB);
		
		JButton cornerB = new JButton("CORNER");
		cornerB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1)
					corner[team]++;
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		cornerB.setBounds(138, 133, 118, 23);
		panel_1.add(cornerB);
		
		JButton faulB = new JButton("FAUL");
		faulB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1)
					faul[team]++;
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		faulB.setBounds(138, 167, 118, 23);
		panel_1.add(faulB);
		
		JButton goalB = new JButton("GOAL");
		goalB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1) {
					goal[team]++;
					performance[team] -= (performance[team]-1)/2;
					if(team == 0) {
						performance[1] += (performance[1]-1)/2;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/4;
						else
							performance[2] -= (performance[2]-1)/4;
					}
					else {
						performance[0] += (performance[0]-1)/2;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/4;
						else
							performance[2] -= (performance[2]-1)/4;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		goalB.setBounds(10, 99, 118, 23);
		panel_1.add(goalB);
		
		JButton inTargetB = new JButton("IN TARGET");
		inTargetB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1) {
					inTargetShoot[team]++;
					performance[team] -= (performance[team]-1)/7;
					if(team == 0) {
						performance[1] += (performance[1]-1)/7;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/10;
						else
							performance[2] -= (performance[2]-1)/10;
					}
					else {
						performance[0] += (performance[0]-1)/7;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/10;
						else
							performance[2] -= (performance[2]-1)/10;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		inTargetB.setBounds(216, 33, 118, 23);
		panel_1.add(inTargetB);
		
		JButton outOfTargetB = new JButton("OUT OF TARGET");
		outOfTargetB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(team == 0 || team == 1) {
					outOfTargetShoot[team]++;
					performance[team] -= (performance[team]-1)/8;
					if(team == 0) {
						performance[1] += (performance[1]-1)/8;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/11;
						else
							performance[2] -= (performance[2]-1)/11;
					}
					else {
						performance[0] += (performance[0]-1)/8;
						if(goal[0]>=goal[1])
							performance[2] += (performance[2]-1)/11;
						else
							performance[2] -= (performance[2]-1)/11;
					}
					p1.setText(String.valueOf(performance[0]));
					p2.setText(String.valueOf(performance[1]));
					pX.setText(String.valueOf(performance[2]));
				}
				else
					JOptionPane.showMessageDialog(null, "Select a team!");
			}
		});
		outOfTargetB.setBounds(344, 33, 118, 23);
		panel_1.add(outOfTargetB);
		
		JLabel lblNewLabel_2 = new JLabel("MISSED SHOOT:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(278, 4, 141, 18);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Live Performance:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(266, 99, 118, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("1:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(410, 85, 16, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("X:");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(459, 85, 16, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("2:");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setBounds(503, 85, 16, 14);
		panel_1.add(lblNewLabel_3_2);
	}
}
