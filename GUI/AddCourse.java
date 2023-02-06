package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Users.Admin;

public class AddCourse extends JFrame {

    private JTextField courseNameField;
    private JTextArea courseDescriptionField;
    private JTextField courseCostField;
    private JTextArea moduleListField;
    private JButton addButton;
    

    public AddCourse() {
   
        setTitle("Add Course");
        setSize(400, 300);
        setVisible(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2));

        mainPanel.add(new JLabel("Course Name:"));
        courseNameField = new JTextField();
        mainPanel.add(courseNameField);

        mainPanel.add(new JLabel("Course Description:"));
        courseDescriptionField = new JTextArea();
        mainPanel.add(courseDescriptionField);

        mainPanel.add(new JLabel("Course Cost:"));
        courseCostField = new JTextField();
        mainPanel.add(courseCostField);

        mainPanel.add(new JLabel("Module List:"));
        moduleListField = new JTextArea();
        mainPanel.add(moduleListField);

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = courseNameField.getText();
                String courseDescription = courseDescriptionField.getText();
                int courseCost = Integer.parseInt(courseCostField.getText());
                String[] moduleList = moduleListField.getText().split(" ");
                Admin a = new Admin();
                try {
                    a.addCourse(courseName, courseDescription, courseCost, moduleList);
                    JOptionPane.showMessageDialog(mainPanel,"Sucessfully Added.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(mainPanel,"Something went wrong!!!","Warning",JOptionPane.WARNING_MESSAGE); 
                }
            }
        });
        mainPanel.add(addButton);

        add(mainPanel);
    }
   }