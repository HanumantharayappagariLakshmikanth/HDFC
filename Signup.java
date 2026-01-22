import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupPage extends JFrame implements ActionListener {

    private JTextField userText, emailText;
    private JPasswordField passText, confirmPassText;
    private JButton signupButton;
    private JLabel messageLabel;

    public SignupPage() {
        setTitle("Signup Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 20, 200, 25);
        panel.add(userText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 60, 100, 25);
        panel.add(emailLabel);

        emailText = new JTextField();
        emailText.setBounds(150, 60, 200, 25);
        panel.add(emailText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 100, 100, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 100, 200, 25);
        panel.add(passText);

        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setBounds(20, 140, 120, 25);
        panel.add(confirmPassLabel);

        confirmPassText = new JPasswordField();
        confirmPassText.setBounds(150, 140, 200, 25);
        panel.add(confirmPassText);

        signupButton = new JButton("Sign Up");
        signupButton.setBounds(150, 180, 100, 30);
        signupButton.addActionListener(this);
        panel.add(signupButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(20, 220, 350, 25);
        panel.add(messageLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String email = emailText.getText();
        String password = new String(passText.getPassword());
        String confirmPassword = new String(confirmPassText.getPassword());

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            messageLabel.setText("All fields are required!");
            messageLabel.setForeground(Color.RED);
        } else if (!password.equals(confirmPassword)) {
            messageLabel.setText("Passwords do not match!");
            messageLabel.setForeground(Color.RED);
        } else {
            messageLabel.setText("Signup successful!");
            messageLabel.setForeground(Color.GREEN);

            // Here you can save data to a database or file
            // Example: userDAO.save(username, email, password);
        }
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}

