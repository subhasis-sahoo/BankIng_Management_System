package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    String formNo;

    JLabel heading, accountType, card, cardNo, cardDetails, pin, pinNo, pinDetails, services;
    JRadioButton saving, fdAccount, current, recurring;
    ButtonGroup accountGroup;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;

    SignupThree(String formNo) {

        this.formNo = formNo;

        setLayout(null);

        heading = new JLabel("page 3: Account Details");
        heading.setFont(new Font("Railway", Font.BOLD, 20));
        heading.setBounds(300, 40, 300, 30);
        add(heading);

        accountType = new JLabel("Account Type: ");
        accountType.setFont(new Font("Railway", Font.BOLD, 20));
        accountType.setBounds(130, 120, 200, 30);
        add(accountType);

        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Railway", Font.BOLD, 14));
        saving.setBounds(130, 160, 300, 30);
        saving.setBackground(Color.WHITE);
        add(saving);

        fdAccount = new JRadioButton("Fix Deposit Account");
        fdAccount.setFont(new Font("Railway", Font.BOLD, 14));
        fdAccount.setBounds(450, 160, 300, 30);
        fdAccount.setBackground(Color.WHITE);
        add(fdAccount);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Railway", Font.BOLD, 14));
        current.setBounds(130, 200, 300, 30);
        current.setBackground(Color.WHITE);
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Railway", Font.BOLD, 14));
        recurring.setBounds(450, 200, 300, 30);
        recurring.setBackground(Color.WHITE);
        add(recurring);

        accountGroup = new ButtonGroup();
        accountGroup.add(saving);
        accountGroup.add(fdAccount);
        accountGroup.add(current);
        accountGroup.add(recurring);

        card = new JLabel("Card Number: ");
        card.setFont(new Font("Railway", Font.BOLD, 20));
        card.setBounds(130, 270, 200, 30);
        add(card);

        cardNo = new JLabel("XXXX-XXXX-XXXX-4104");
        cardNo.setFont(new Font("Railway", Font.BOLD, 20));
        cardNo.setBounds(350, 270, 300, 30);
        add(cardNo);

        cardDetails = new JLabel("This is Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Railway", Font.BOLD, 14));
        cardDetails.setBounds(130, 310, 500, 30);
        add(cardDetails);

        pin = new JLabel("PIN Number: ");
        pin.setFont(new Font("Railway", Font.BOLD, 20));
        pin.setBounds(130, 370, 200, 30);
        add(pin);

        pinNo = new JLabel("XXXX");
        pinNo.setFont(new Font("Railway", Font.BOLD, 20));
        pinNo.setBounds(350, 370, 300, 30);
        add(pinNo);

        pinDetails = new JLabel("This is Your 4 Digit Password");
        pinDetails.setFont(new Font("Railway", Font.BOLD, 14));
        pinDetails.setBounds(130, 410, 500, 30);
        add(pinDetails);

        services = new JLabel("Services Required: ");
        services.setFont(new Font("Railway", Font.BOLD, 20));
        services.setBounds(130, 460, 200, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Railway", Font.BOLD, 14));
        c1.setBackground(Color.WHITE);
        c1.setBounds(130, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Railway", Font.BOLD, 14));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Railway", Font.BOLD, 14));
        c3.setBackground(Color.WHITE);
        c3.setBounds(570, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Railway", Font.BOLD, 14));
        c4.setBackground(Color.WHITE);
        c4.setBounds(130, 540, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Railway", Font.BOLD, 14));
        c5.setBackground(Color.WHITE);
        c5.setBounds(350, 540, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-statement");
        c6.setFont(new Font("Railway", Font.BOLD, 14));
        c6.setBackground(Color.WHITE);
        c6.setBounds(570, 540, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Railway", Font.BOLD, 12));
        c7.setBackground(Color.WHITE);
        c7.setBounds(130, 600, 700, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setFont(new Font("Railway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(310, 650, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Railway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(440, 650, 100, 30);
        cancel.addActionListener(this);
        add(cancel);



        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit) {
            String accountType;
            if(saving.isSelected()) {
                accountType = "Saving Account";
            } else if(fdAccount.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if(current.isSelected()) {
                accountType = "Current Account";
            } else if(recurring.isSelected()) {
                accountType = "Recurring Account";
            } else {
                accountType = "";
            }

            Random random = new Random();
            String cardNo = "" + Math.abs((random.nextLong() % 90000000L) + 50409363L);
            System.out.println(cardNo);

            String pinNo = "" + (int) (Math.random() * (10000 - 1000) + 1000);

            String services = "";
            if(c1.isSelected()) services = services + " ATM Card";
            if(c2.isSelected()) services = services + " Internet Banking";
            if(c3.isSelected()) services = services + " Mobile Banking";
            if(c4.isSelected()) services = services + " Email & SMS Alerts";
            if(c5.isSelected()) services = services + " Cheque Book";
            if(c6.isSelected()) services = services + " E-statement";

            try {
                if(accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else if(services.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    DBConnection conn = new DBConnection();
                    String qry1 = "INSERT INTO account_details VALUES('" + formNo + "', '" + accountType + "', '" + cardNo + "', '" + pinNo + "', '" + services + "')";
                    conn.stmt.executeUpdate(qry1);
                    String qry2 = "INSERT INTO logIn VALUES('" + formNo + "', '" + cardNo + "', '" + pinNo + "')";
                    conn.stmt.executeUpdate(qry2);

                    JOptionPane.showMessageDialog(null, "Card No: " + cardNo + "\nPIN No: " + pinNo);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if(ae.getSource() == cancel) {

        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
