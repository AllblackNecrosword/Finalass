package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import Data.FetchData;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Login_form {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_form window = new Login_form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 570, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 556, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 273, 382);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("     Herald College ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(20, 10, 243, 94);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kathmandu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(65, 93, 154, 41);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image profile3= new ImageIcon(this.getClass().getResource("/herald-college.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(profile3));
		lblNewLabel_6.setBounds(41, 144, 200, 186);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(117,192,67,255));
		panel_2.setBounds(271, 0, 285, 382);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		username = new JTextField();
		username.setBounds(67, 94, 173, 30);
		panel_2.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(67, 168, 173, 30);
		panel_2.add(password);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(67, 65, 86, 19);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(67, 145, 86, 13);
		panel_2.add(lblNewLabel_1);
		
		String roles[]= {"Admin","Teacher","Student"};
		JComboBox comboBox = new JComboBox(roles);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		comboBox.setBounds(67, 242, 173, 30);  
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Select user mode");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(67, 221, 160, 13);
		panel_2.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Create ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Create_acoount();
			}
		});   
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(30, 317, 93, 30);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Signin");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String u = username.getText();
				    char[] p = password.getPassword();
				    FetchData fd = new FetchData();
				    String[] userData = fd.loginData(u, p.toString(), comboBox.getSelectedItem().toString());
				    System.out.println("yehi ho"+userData.length);
				    if (u.isEmpty() || p.length == 0) {
				        JOptionPane.showMessageDialog(panel_1, "Please Fill the empty Boxes", "Warning", JOptionPane.WARNING_MESSAGE);     
				    } else if (userData == null || userData.length != 2 || userData[0] == null || userData[1] == null) {
				        JOptionPane.showMessageDialog(panel_1, "Invalid", "Warning", JOptionPane.WARNING_MESSAGE);     
				    } else {
				        new Dashboard();
				        frame.setVisible(false);
				    }
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(178, 317, 85, 30);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image profile= new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(profile));
		lblNewLabel_5.setBounds(25, 94, 45, 30);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		Image profile2= new ImageIcon(this.getClass().getResource("/password.png")).getImage();
		lblNewLabel_5_1.setIcon(new ImageIcon(profile2));
		lblNewLabel_5_1.setBounds(25, 168, 45, 30);
		panel_2.add(lblNewLabel_5_1);
		
	}
}
