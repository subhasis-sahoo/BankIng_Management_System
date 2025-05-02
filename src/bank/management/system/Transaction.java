package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {
    String pinNumber;
    JLabel image, heading;
    JButton deposit, withdrawal, fastCash, miniStatement, pinChange, balanceInfo,exit;


    Transaction(String pinNumber) {
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

        deposit = new JButton("Deposit");
        deposit.setBounds(180, 390, 140, 30);
        deposit.setFont(new Font("Railway", Font.BOLD, 14));
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawal = new JButton("Withdrawal");
        withdrawal.setBounds(350, 390, 140, 30);
        withdrawal.setFont(new Font("Railway", Font.BOLD, 14));
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(180, 430, 140, 30);
        fastCash.setFont(new Font("Railway", Font.BOLD, 14));
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(350, 430, 140, 30);
        miniStatement.setFont(new Font("Railway", Font.BOLD, 14));
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("PIN Change");
        pinChange.setBounds(180, 470, 140, 30);
        pinChange.setFont(new Font("Railway", Font.BOLD, 14));
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceInfo = new JButton("Balance Info");
        balanceInfo.setBounds(350, 470, 140, 30);
        balanceInfo.setFont(new Font("Railway", Font.BOLD, 14));
        balanceInfo.addActionListener(this);
        image.add(balanceInfo);

        exit = new JButton("Exit");
        exit.setBounds(350, 510, 140, 30);
        exit.setFont(new Font("Railway", Font.BOLD, 14));
        exit.addActionListener(this);
        image.add(exit);


        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) {
            System.out.println("Exit Successful");
            System.exit(0);
        } else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if(ae.getSource() == withdrawal) {
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        } else if(ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transaction("");
    }
}
