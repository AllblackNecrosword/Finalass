package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Data.SendData;
import Data.SignupData;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Create_acoount {

	private JFrame frame;
	private JTextField username;
	private JTextField email;
	private JPasswordField pass1;
	private JPasswordField pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_acoount window = new Create_acoount();
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
	public Create_acoount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 652, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 363, 482);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 31, 112, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 111, 220, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(24, 185, 196, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(24, 259, 196, 24);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select User Mode");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(24, 333, 154, 24);
		panel_1.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(24, 65, 220, 36);
		panel_1.add(username);
		username.setColumns(10);
		
		email = new JTextField();
		email.setBounds(24, 145, 220, 30);
		panel_1.add(email);
		email.setColumns(10);
		
		pass1 = new JPasswordField();
		pass1.setBounds(24, 219, 220, 30);
		panel_1.add(pass1);
		
		pass2 = new JPasswordField();
		pass2.setBounds(24, 293, 220, 30);
		panel_1.add(pass2);
		
		String roles[]= {"Teacher","Student"};
		JComboBox comboBox = new JComboBox(roles);
		comboBox.setBounds(24, 367, 220, 30);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Create ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = username.getText();
				char[] p1 = pass1.getPassword();
				char[] p2 = pass2.getPassword();
				String em = email.getText();
				if(u.isEmpty()||p1.equals("")||p2.equals("")||em.isEmpty()) {
					JOptionPane.showMessageDialog(panel_1,"Please Fill the empty Boxes","Warning",JOptionPane.WARNING_MESSAGE);     
				}else if(p1.equals(p2)) {
					JOptionPane.showMessageDialog(panel_1,"Password Does not match","Warning",JOptionPane.WARNING_MESSAGE); 
				}else {
					SignupData s = new SignupData(u,em,comboBox.getSelectedItem().toString(),p1);
				SendData sd = new SendData();
				try {
					sd.signupData(s);
					 JOptionPane.showMessageDialog(panel_1,"Succesfull"); 
					 frame.setVisible(false);
						new Login_form();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(117,192,67,255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(73, 418, 105, 44);
		panel_1.add(btnNewButton);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBackground(new Color(128, 128, 128));
		panel_2.setBounds(362, 0, 276, 482);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image profile4= new ImageIcon(this.getClass().getResource("/add-friend.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(profile4));
		lblNewLabel_3.setBounds(88, 165, 133, 142);
		panel_2.add(lblNewLabel_3);
	
	}
}
