package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JLayer;

import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import Data.Courses;
import Users.Student;
import Users.Teacher;

import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Dashboard {

	private JFrame frame;
	protected JPanel panel_4;
	private CardLayout cd = new CardLayout(0,0);
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 747, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(117, 191, 64));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblNewLabel);
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(cd);
		
		JPanel dashboard = new JPanel();
		panel_2.add(dashboard, "name_141625312607700");
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_3 = new JLabel("Total Student");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3_1 = new JLabel("Total Tutors");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3_2 = new JLabel("Total Courses");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3_3 = new JLabel("Total Modules");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		Student s = new Student();
		JLabel lblNewLabel_4 = new JLabel(""+s.getStudentsCount());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		
		Teacher t = new Teacher();
		JLabel lblNewLabel_4_1 = new JLabel(""+t.getTeachersCount());
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		Courses c = new Courses();
		JLabel lblNewLabel_4_2 = new JLabel(""+c.getModuleCount());
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		
		JLabel lblNewLabel_4_3 = new JLabel(""+c.getCourseCount());
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		GroupLayout gl_dashboard = new GroupLayout(dashboard);
		gl_dashboard.setHorizontalGroup(
			gl_dashboard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addGap(241)
					.addComponent(lblNewLabel_1)
					.addContainerGap(256, Short.MAX_VALUE))
				.addGroup(gl_dashboard.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(110))
				.addGroup(Alignment.TRAILING, gl_dashboard.createSequentialGroup()
					.addGap(51)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(133))
				.addGroup(Alignment.TRAILING, gl_dashboard.createSequentialGroup()
					.addGap(52)
					.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
		);
		gl_dashboard.setVerticalGroup(
			gl_dashboard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(78)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		dashboard.setLayout(gl_dashboard);
		
		JPanel course = new JPanel();
		panel_2.add(course, "name_141628327776400");
		
		JLabel lblNewLabel_2 = new JLabel("Courses");
		lblNewLabel_2.setBounds(232, 10, 103, 31);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_5 = new JLabel("Total Courses");
		lblNewLabel_5.setBounds(23, 59, 124, 29);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_6 = new JLabel(""+c.getCourseCount());
		lblNewLabel_6.setBounds(33, 94, 76, 35);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		
		DefaultTableModel coursesModel = new DefaultTableModel();
		coursesModel.setColumnIdentifiers(new Object[] {"Id","Course Name"});
		for(int i =0;i<c.getCourseCount();i++) {
			coursesModel.addRow(new Object[] {i+1,c.getCourseList().get(i)});
		}
		course.setLayout(null);
		course.add(lblNewLabel_2);
		course.add(lblNewLabel_6);
		course.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 159, 478, 175);
		course.add(scrollPane);
		
		
		table = new JTable(coursesModel);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JPanel tutor = new JPanel();
		panel_2.add(tutor, "name_141629784623800");
		
		JLabel lblNewLabel_7 = new JLabel("Tutor");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_8 = new JLabel("Total Tutors");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_6_1 = new JLabel(""+t.getTeachersCount());
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		GroupLayout gl_tutor = new GroupLayout(tutor);
		gl_tutor.setHorizontalGroup(
			gl_tutor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tutor.createSequentialGroup()
					.addGroup(gl_tutor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tutor.createSequentialGroup()
							.addGap(282)
							.addComponent(lblNewLabel_7))
						.addGroup(gl_tutor.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tutor.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(283, Short.MAX_VALUE))
		);
		gl_tutor.setVerticalGroup(
			gl_tutor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tutor.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		tutor.setLayout(gl_tutor);
		
		JPanel setting = new JPanel();
		panel_2.add(setting, "name_141631279984300");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(117, 191, 64));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_2, "name_141625312607700");
			}
		});
		
		JButton btnCourse = new JButton("Course");
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_2, "name_141628327776400");
			}
		});
		
		JButton btnTutor = new JButton("Tutor");
		btnTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_2, "name_141629784623800");
			}
		});
		
		JButton btnMail = new JButton("Mail");
		btnMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL ("https://mail.google.com/mail/u/1/#inbox").toURI());
					
				}catch(Exception e1) {
					
				}
			}
		});
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL ("https://heraldcollege.edu.np/about").toURI());
					
				}catch(Exception e1) {
					
				}
			}
		});
		
		JButton btnSetting = new JButton("Setting");
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_2,"name_141631279984300");
			}
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login_form();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCourse, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnTutor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnMail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnHelp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnSetting, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnLogOut, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(61)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCourse)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnTutor)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMail)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHelp)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSetting)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLogOut)
					.addContainerGap(174, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		

		Image profile3= new ImageIcon(this.getClass().getResource("/study.png")).getImage();
		
		
	}
}
