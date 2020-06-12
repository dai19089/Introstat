package API;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventTicket extends JFrame {
	
	private String home;
	private String away;
	private String referee;
	private String day;
	private String month;
	private String location;
	
	private JPanel contentPane;
	private JTextField homeTF;
	private JTextField awayTF;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1;
	private JTextField refereeTF;
	private JTextField dayTF;
	private JTextField monthTF;
	private JTextField locationTF;
	private JButton BackB;
	
	public EventTicket() {
		
		this.setVisible(true);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		homeTF = new JTextField();
		homeTF.setBounds(36, 131, 127, 33);
		homeTF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u0391\u03B3\u03CE\u03BD\u03B1:");
		lblNewLabel.setBounds(108, 11, 160, 22);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		awayTF = new JTextField();
		awayTF.setBounds(217, 131, 129, 33);
		awayTF.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Home:");
		lblNewLabel_2.setBounds(36, 99, 127, 21);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		lblNewLabel_1_2 = new JLabel("Away:");
		lblNewLabel_1_2.setBounds(217, 99, 134, 21);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(homeTF);
		contentPane.add(lblNewLabel_1_2);
		contentPane.add(awayTF);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 36, 390, 2);
		contentPane.add(separator);
		
		lblNewLabel_1 = new JLabel("Referee");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 350, 97, 22);
		contentPane.add(lblNewLabel_1);
		
		refereeTF = new JTextField();
		refereeTF.setBounds(36, 383, 127, 33);
		contentPane.add(refereeTF);
		refereeTF.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Day:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(36, 229, 127, 21);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Month:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(217, 229, 127, 21);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Location:");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_4.setBounds(219, 351, 127, 21);
		contentPane.add(lblNewLabel_2_4);
		
		dayTF = new JTextField();
		dayTF.setColumns(10);
		dayTF.setBounds(36, 261, 127, 33);
		contentPane.add(dayTF);
		
		monthTF = new JTextField();
		monthTF.setColumns(10);
		monthTF.setBounds(219, 261, 127, 33);
		contentPane.add(monthTF);
		
		locationTF = new JTextField();
		locationTF.setColumns(10);
		locationTF.setBounds(219, 383, 127, 33);
		contentPane.add(locationTF);
		
		JButton submitB = new JButton("SUBMIT");
		submitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Permission per = new Permission();
				if(homeTF.getText().length()>0 && awayTF.getText().length()>0 && dayTF.getText().length()>0 && monthTF.getText().length()>0 && 
				   refereeTF.getText().length()>0 && locationTF.getText().length()>0) {
					if(per.askForPermission(homeTF.getText(), awayTF.getText(), dayTF.getText(), monthTF.getText(), refereeTF.getText(), locationTF.getText())) {
						JOptionPane.showMessageDialog(null, "Permission Granted!");
						Main.data.setEventTicketInfo(homeTF.getText(), awayTF.getText(), dayTF.getText(), monthTF.getText(), refereeTF.getText(), locationTF.getText());
						Events eve = new Events();
						dispose();
					}
				}
				else
					JOptionPane.showMessageDialog(null, "Please fill in all the details");
			}
		});
		submitB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submitB.setBackground(Color.RED);
		submitB.setForeground(Color.BLACK);
		submitB.setBounds(52, 464, 134, 48);
		contentPane.add(submitB);
		
		BackB = new JButton("Back");
		BackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				dispose();
			}
		});
		BackB.setForeground(Color.BLACK);
		BackB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BackB.setBackground(Color.LIGHT_GRAY);
		BackB.setBounds(196, 464, 134, 48);
		contentPane.add(BackB);
	}
}
