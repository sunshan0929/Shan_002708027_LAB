package lab;
import java.awt.*;
import javax.swing.*;

public class StudentCardApp {
    private JFrame frame;
    private JSplitPane splitPane;
    private JPanel leftPane, rightPane;
    private JLabel studentIdLabel, firstNameLabel, lastNameLabel, collegeNameLabel, phoneLabel, emailLabel, currentAddressLabel, permanentAddressLabel;
    private JTextField studentIdField, firstNameField, lastNameField, collegeNameField, phoneField, emailField, currentAddressField, permanentAddressField;
    private JButton generateCardButton;

    public StudentCardApp() {
        // Initialize frame
        frame = new JFrame("Student Card Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Initialize split pane
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        frame.add(splitPane);

        // Initialize left pane
        leftPane = new JPanel();
        leftPane.setLayout(new GridLayout(9, 2));
        splitPane.setLeftComponent(leftPane);

        // Initialize form fields
        studentIdLabel = new JLabel("Student ID:");
        studentIdField = new JTextField(20);
        firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(20);
        lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(20);
        collegeNameLabel = new JLabel("College Name:");
        collegeNameField = new JTextField(20);
        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField(20);
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        currentAddressLabel = new JLabel("Current Address:");
        currentAddressField = new JTextField(20);
        permanentAddressLabel = new JLabel("Permanent Address:");
        permanentAddressField = new JTextField(20);
        
        // Input verifier 
        studentIdField.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                return !tf.getText().trim().isEmpty();
            }
        });
        firstNameField.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                return !tf.getText().trim().isEmpty();
            }
        });
        // Add other fields input verifier
        
        // Add form fields to left pane
        leftPane.add(studentIdLabel);
        leftPane.add(studentIdField);
        leftPane.add(firstNameLabel);
        leftPane.add(firstNameField);
        leftPane.add(lastNameLabel);
        leftPane.add(lastNameField);
        leftPane.add(collegeNameLabel);
        leftPane.add(collegeNameField);
        leftPane.add(phoneLabel);
        leftPane.add(phoneField);
        leftPane.add(emailLabel);
        leftPane.add(emailField);
        leftPane.add(currentAddressLabel);
        leftPane.add(currentAddressField);
        leftPane.add(permanentAddressLabel);
        leftPane.add(permanentAddressField);

        // Initialize generate card button
        generateCardButton = new JButton("Generate Card");
        generateCardButton.addActionListener(e -> {
            // Create a Student object with the information entered in the form
            Student student = new Student(studentIdField.getText(), firstNameField.getText(), lastNameField.getText(), collegeNameField.getText(), phoneField.getText(), emailField.getText(), currentAddressField.getText(), permanentAddressField.getText());

            // Clear the right pane
            rightPane.removeAll();

            // Create labels to display student information on the right pane
            JLabel studentId = new JLabel("Student ID: " + student.getStudentId());
            JLabel name = new JLabel("Name: " + student.getFirstName() + " " + student.getLastName());
            JLabel college = new JLabel("College: " + student.getCollegeName());
            JLabel contact = new JLabel("Contact: " + student.getPhone() + " / " + student.getEmail());
            JLabel currentAddress = new JLabel("Current Address: " + student.getCurrentAddress());
            JLabel permanentAddress = new JLabel("Permanent Address: " + student.getPermanentAddress());

            // Add the labels to the right pane
            rightPane.add(studentId);
            rightPane.add(name);
            rightPane.add(college);
            rightPane.add(contact);
            rightPane.add(currentAddress);
            rightPane.add(permanentAddress);

            // Repaint the right pane
            rightPane.revalidate();
            rightPane.repaint();
        });
        leftPane.add(generateCardButton);

        // Initialize right pane
        rightPane = new JPanel();
        rightPane.setLayout(new BoxLayout(rightPane, BoxLayout.Y_AXIS));
        splitPane.setRightComponent(rightPane);

        // Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new StudentCardApp());
    }
}