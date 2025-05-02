package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    String pinNumber;
    JLabel image, heading;
    JButton b1, b2, b3, b4, b5, b6,back;


    FastCash(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        heading = new JLabel("Please Select Your Transaction");
        heading.setBounds(220, 300, 300, 30);
        heading.setFont(new Font("Railway", Font.BOLD, 16));
        heading.setForeground(Color.WHITE);
        image.add(heading);

        b1 = new JButton("Rs. 100");
        b1.setBounds(180, 390, 140, 30);
        b1.setFont(new Font("Railway", Font.BOLD, 14));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBounds(350, 390, 140, 30);
        b2.setFont(new Font("Railway", Font.BOLD, 14));
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBounds(180, 430, 140, 30);
        b3.setFont(new Font("Railway", Font.BOLD, 14));
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBounds(350, 430, 140, 30);
        b4.setFont(new Font("Railway", Font.BOLD, 14));
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBounds(180, 470, 140, 30);
        b5.setFont(new Font("Railway", Font.BOLD, 14));
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setBounds(350, 470, 140, 30);
        b6.setFont(new Font("Railway", Font.BOLD, 14));
        b6.addActionListener(this);
        image.add(b6);

        back = new JButton("Back");
        back.setBounds(350, 510, 140, 30);
        back.setFont(new Font("Railway", Font.BOLD, 14));
        back.addActionListener(this);
        image.add(back);


        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        } else {
            int balance;
            String amountMoney = ((JButton) ae.getSource()).getText().substring(4);
            try {
                DBConnection conn = new DBConnection();
                ResultSet result = conn.stmt.executeQuery("SELECT * FROM bank WHERE pinNumber = '" + pinNumber + "'");
                balance = 0;

                while(result.next()) {
                    if(result.getString("type").equals("deposit")) {
                        balance += Integer.parseInt(result.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(result.getString("amount"));
                    }
                }
                System.out.println(balance);

                if(balance < Integer.parseInt(amountMoney)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    System.out.println(balance);
                } else {
                    Date date = new Date();
                    String type = "withdraw";
                    String qry = "INSERT INTO bank VALUES('" + pinNumber + "', '" + date + "', '" + amountMoney + "', '" + type + "')";
                    conn.stmt.executeQuery(qry);
                    JOptionPane.showMessageDialog(null, "Rs. " + amountMoney + " Debited Successfully.");
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
