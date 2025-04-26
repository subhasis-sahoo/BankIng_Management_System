package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel imgLabel, heading, cardNo, pin;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JButton login, clear, signUp;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        imgLabel = new JLabel(i3);
        imgLabel.setBounds(120, 20, 100, 100);
        add(imgLabel);

        heading = new JLabel("Welcome To ATM");
        heading.setFont(new Font("Osward", Font.BOLD, 30));
        heading.setBounds(250, 60, 280, 30);
        add(heading);

        cardNo = new JLabel("Card No: ");
        cardNo.setFont(new Font("Railway", Font.BOLD, 20));
        cardNo.setBounds(170, 160, 140, 30);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(310, 160, 240, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Railway", Font.BOLD, 20));
        pin.setBounds(170, 210, 140, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(310, 210, 240, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(310, 280, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 280, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(310, 330, 240, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login) {
            System.out.println("log in");
        } else if(ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource() == signUp) {
            System.out.println("sign up");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
