package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    String pinNumber;
    JLabel image, heading;
    JTextField amount;
    JButton withdraw, back;

    Withdraw(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        heading = new JLabel("Enter the amount you want to withdraw");
        heading.setBounds(190, 300, 300, 30);
        heading.setFont(new Font("Railway", Font.BOLD, 16));
        heading.setForeground(Color.WHITE);
        image.add(heading);

        amount = new JTextField();
        amount.setFont(new Font("Railway", Font.BOLD, 14));
        amount.setBounds(190, 380, 280, 30);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setFont(new Font("Railway", Font.BOLD, 14));
        withdraw.setBounds(190, 420, 135, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setFont(new Font("Railway", Font.BOLD, 14));
        back.setBounds(335, 420, 135, 30);
        back.addActionListener(this);
        image.add(back);




        setSize(900, 900);
        setLocation(300, 0);
//        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw) {
            String amountMoney = amount.getText();
            Date date = new Date();
            String type = "withdraw";

            if(amountMoney.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            } else {
                try {
                    DBConnection conn = new DBConnection();
                    String qry = "INSERT INTO bank VALUES('" + pinNumber + "', '" + date + "', '" + amountMoney + "', '" + type + "')";
                    conn.stmt.executeQuery(qry);
                    JOptionPane.showMessageDialog(null, "Rs. " + amountMoney + " Withdraw Successfully.");
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        } else if(ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }
}
