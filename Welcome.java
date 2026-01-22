import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame {

    public WelcomePage(String username) {
        setTitle("Welcome Page");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel(
                "Welcome, " + username + "!",
                SwingConstants.CENTER
        );
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            dispose();              // close welcome page
            // new LoginPage();     // open login page again if needed
        });

        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(logoutButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Example usage
        new WelcomePage("Admin");
    }
}

