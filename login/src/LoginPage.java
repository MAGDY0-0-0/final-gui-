import javax.swing.*;
import java.awt.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 245, 245));

        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setBounds(160, 10, 80, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);


        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 60, 80, 25);
        panel.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(150, 60, 180, 25);
        panel.add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 80, 25);
        panel.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 180, 25);
        panel.add(passField);

        JCheckBox rememberMe = new JCheckBox("Remember Me");
        rememberMe.setBounds(150, 135, 150, 25);
        panel.add(rememberMe);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 175, 80, 30);
        loginButton.setBackground(new Color(0, 123, 255)); // Blue button
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(250, 175, 80, 30);
        panel.add(cancelButton);

        JLabel forgotPass = new JLabel("<html><u>Forgot Password?</u></html>");
        forgotPass.setBounds(140, 220, 150, 20);
        forgotPass.setForeground(new Color(0, 100, 200));
        forgotPass.setFont(new Font("Arial", Font.PLAIN, 11));
        panel.add(forgotPass);

        frame.add(panel);
        frame.setVisible(true);
    }
}