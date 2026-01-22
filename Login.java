import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginPage() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(120, 20, 165, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(120, 60, 165, 25);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(120, 100, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(20, 130, 300, 25);
        panel.add(messageLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());

        // Simple hardcoded validation
        if (username.equals("admin") && password.equals("1234")) {
            messageLabel.setText("Login successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid username or password");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

