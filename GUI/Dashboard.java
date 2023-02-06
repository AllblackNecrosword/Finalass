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
import Users.Admin;

import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Dashboard {

	private JFrame frame;
	protected JPanel panel_4;
	private CardLayout cd = new CardLayout(0,0);
	private JTable table;
	private JTable table_1;
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
		panel.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setForeground(new Color(0, 0, 0));
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
		
		
		JLabel lblNewLabel_4_3 = new JLabel(""+c.getCourseList().size());
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		GroupLayout gl_dashboard = new GroupLayout(dashboard);
		gl_dashboard.setHorizontalGroup(
			gl_dashboard.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_dashboard.createSequentialGroup()
					.addGap(241)
					.addComponent(lblNewLabel_1)
					.addContainerGap(256, Short.MAX_VALUE))
				.addGroup(gl_dashboard.createSequentialGroup()
					.addGap(52)
					.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
				.addGroup(Alignment.LEADING, gl_dashboard.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_dashboard.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
							.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(133))
						.addGroup(gl_dashboard.createSequentialGroup()
							.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
							.addGroup(gl_dashboard.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(110))))
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
					.addContainerGap(190, Short.MAX_VALUE))
		);
		
		dashboard.setLayout(gl_dashboard);
		
		JPanel course = new JPanel();
		panel_2.add(course, "name_141628327776400");
		
		JLabel lblNewLabel_5 = new JLabel("Total Courses");
		lblNewLabel_5.setBounds(10, 68, 124, 29);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_6 = new JLabel(""+c.getCourseList().size());
		lblNewLabel_6.setBounds(39, 94, 76, 35);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		
		DefaultTableModel coursesModel = new DefaultTableModel();
		coursesModel.setColumnIdentifiers(new Object[] {"Id","Course Name"});
		for(int i =0;i<c.getCourseList().size();i++) {
			coursesModel.addRow(new Object[] {i+1,c.getCourseList().get(i)});
		}
		
		course.setLayout(null);
		course.add(lblNewLabel_6);
		course.add(lblNewLabel_5);
		
		
		
		JButton btnNewButton_1 = new JButton("Add Course");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddCourse();
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(256, 10, 103, 24);
		course.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete Course");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(505, 10, 117, 24);
		course.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("Update Course");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_3.setBounds(369, 10, 124, 24);
		course.add(btnNewButton_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 74, 448, 300);
		course.add(scrollPane);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		
		table = new JTable(coursesModel);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JPanel tutor = new JPanel();
		panel_2.add(tutor, "name_141629784623800");
		
		JLabel lblNewLabel_6_1 = new JLabel(""+c.getTeachersCount());
		lblNewLabel_6_1.setBounds(33, 143, 76, 35);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		JLabel lblNewLabel_5_1 = new JLabel("Total Tutors");
		lblNewLabel_5_1.setBounds(10, 104, 124, 29);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("Add Tutors");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(283, 10, 97, 33);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton_2_1 = new JButton("Delete Tutors");
		btnNewButton_2_1.setBounds(497, 10, 113, 33);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton_2_2 = new JButton("Edit Tutors");
		btnNewButton_2_2.setBounds(390, 10, 97, 33);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		DefaultTableModel tutorView = new DefaultTableModel();
		tutorView.setColumnIdentifiers(new String[] {"Sn","Tutor Name"});
		
		for(int j =0;j<t.viewTeacher().size();j++) {
			tutorView.addRow(new Object[] {j+1,t.viewTeacher().get(j)});
		}
		tutor.setLayout(null);
		tutor.add(lblNewLabel_6_1);
		tutor.add(btnNewButton_2);
		tutor.add(lblNewLabel_5_1);
		tutor.add(btnNewButton_2_2);
		tutor.add(btnNewButton_2_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(175, 113, 403, 233);
		tutor.add(scrollPane_1);
		
		table_1 = new JTable(tutorView);
		scrollPane_1.setViewportView(table_1);
		
		
		JPanel setting = new JPanel();
		panel_2.add(setting, "name_141631279984300");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
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
		
		JLabel lblNewLabel_9 = new JLabel("");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnCourse, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnTutor, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnMail, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnHelp, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnSetting, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnLogOut, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
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
					.addContainerGap(200, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		

		Image profile3= new ImageIcon(this.getClass().getResource("/study.png")).getImage();
		
		
	}
}
