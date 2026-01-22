import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupPage extends JFrame implements ActionListener {

    JTextField txtUser, txtEmail;
    JPasswordField txtPass, txtConfirm;
    JButton btnSignup;
    JLabel lblMsg;

    public SignupPage() {
        setTitle("Signup Page");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("User Signup");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(140, 10, 150, 30);
        panel.add(lblTitle);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(40, 60, 100, 25);
        panel.add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(160, 60, 180, 25);
        panel.add(txtUser);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(40, 100, 100, 25);
        panel.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(160, 100, 180, 25);
        panel.add(txtEmail);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(40, 140, 100, 25);
        panel.add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(160, 140, 180, 25);
        panel.add(txtPass);

        JLabel lblConfirm = new JLabel("Confirm Password:");
        lblConfirm.setBounds(40, 180, 120, 25);
        panel.add(lblConfirm);

        txtConfirm = new JPasswordField();
        txtConfirm.setBounds(160, 180, 180, 25);
        panel.add(txtConfirm);

        btnSignup = new JButton("Sign Up");
        btnSignup.setBounds(160, 220, 100, 30);
        btnSignup.addActionListener(this);
        panel.add(btnSignup);

        lblMsg = new JLabel("");
        lblMsg.setBounds(40, 260, 300, 25);
        panel.add(lblMsg);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = txtUser.getText();
        String email = txtEmail.getText();
        String pass = new String(txtPass.getPassword());
        String confirm = new String(txtConfirm.getPassword());

        if (user.isEmpty() || email.isEmpty() || pass.isEmpty()) {
            lblMsg.setText("All fields are required!");
            lblMsg.setForeground(Color.RED);
        } else if (!pass.equals(confirm)) {
            lblMsg.setText("Passwords do not match!");
            lblMsg.setForeground(Color.RED);
        } else {
            lblMsg.setText("Signup successful!");
            lblMsg.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}

