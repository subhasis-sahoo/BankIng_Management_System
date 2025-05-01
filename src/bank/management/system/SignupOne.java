package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    int randFormNo;
    JLabel formNo, personalDetails, name, fName, dob, gender, email, marital, address, city, state, pinCode;
    JTextField nameField, fNameField, emailField, addressField, cityField, stateField, pinCodeField;
    JDateChooser dobField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    ButtonGroup genderGroup, maritalGroup;
//    JDateChooser dateChooser = new JDateChooser();

    SignupOne() {

        setLayout(null);

        randFormNo = (int) (Math.random() * (10000 - 1000) + 1000);
        formNo = new JLabel("APPLICATION FORM NO. " + randFormNo);
        formNo.setFont(new Font("Railway", Font.BOLD, 30));
        formNo.setBounds(200, 20, 600, 40);
        add(formNo);

        personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Railway", Font.BOLD, 20));
        personalDetails.setBounds(300, 80, 300, 30);
        add(personalDetails);

        name = new JLabel("Name: ");
        name.setFont(new Font("Railway", Font.BOLD, 20));
        name.setBounds(130, 140, 100, 30);
        add(name);

        nameField = new JTextField();
        nameField.setFont(new Font("Railway", Font.BOLD, 14));
        nameField.setBounds(330, 140, 370, 30);
        add(nameField);

        fName = new JLabel("Father's Name: ");
        fName.setFont(new Font("Railway", Font.BOLD, 20));
        fName.setBounds(130, 190, 200, 30);
        add(fName);

        fNameField = new JTextField();
        fNameField.setFont(new Font("Railway", Font.BOLD, 14));
        fNameField.setBounds(330, 190, 370, 30);
        add(fNameField);

        dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Railway", Font.BOLD, 20));
        dob.setBounds(130, 240, 200, 30);
        add(dob);

        dobField = new JDateChooser();
        dobField.setFont(new Font("Railway", Font.BOLD, 14));
        dobField.setBounds(330, 240, 370, 30);
        add(dobField);

        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway", Font.BOLD, 20));
        gender.setBounds(130, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(330, 290, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(480, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        email = new JLabel("Email: ");
        email.setFont(new Font("Railway", Font.BOLD, 20));
        email.setBounds(130, 340, 200, 30);
        add(email);

        emailField = new JTextField();
        emailField.setFont(new Font("Railway", Font.BOLD, 14));
        emailField.setBounds(330, 340, 370, 30);
        add(emailField);

        marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Railway", Font.BOLD, 20));
        marital.setBounds(130, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(330, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(480, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        address = new JLabel("Address: ");
        address.setFont(new Font("Railway", Font.BOLD, 20));
        address.setBounds(130, 440, 200, 30);
        add(address);

        addressField = new JTextField();
        addressField.setFont(new Font("Railway", Font.BOLD, 14));
        addressField.setBounds(330, 440, 370, 30);
        add(addressField);

        city = new JLabel("City: ");
        city.setFont(new Font("Railway", Font.BOLD, 20));
        city.setBounds(130, 490, 200, 30);
        add(city);

        cityField = new JTextField();
        cityField.setFont(new Font("Railway", Font.BOLD, 14));
        cityField.setBounds(330, 490, 370, 30);
        add(cityField);

        state = new JLabel("State: ");
        state.setFont(new Font("Railway", Font.BOLD, 20));
        state.setBounds(130, 540, 200, 30);
        add(state);

        stateField = new JTextField();
        stateField.setFont(new Font("Railway", Font.BOLD, 14));
        stateField.setBounds(330, 540, 370, 30);
        add(stateField);

        pinCode = new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Railway", Font.BOLD, 20));
        pinCode.setBounds(130, 590, 200, 30);
        add(pinCode);

        pinCodeField = new JTextField();
        pinCodeField.setFont(new Font("Railway", Font.BOLD, 14));
        pinCodeField.setBounds(330, 590, 370, 30);
        add(pinCodeField);

        next = new JButton("Next");
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(600, 660, 100, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formNo = "" + randFormNo;
        String name = nameField.getText();
        String fName = fNameField.getText();
        String dob = ((JTextField) dobField.getDateEditor().getUiComponent()).getText();
        System.out.println(dob);
        String gender;
        if(male.isSelected()) gender = "Male";
        else if(female.isSelected()) gender = "Female";
        else gender = "";

        String email = emailField.getText();
        String marital;
        if(married.isSelected()) marital = "Married";
        else if(unmarried.isSelected()) marital = "Unmarried";
        else if(other.isSelected()) marital = "Other";
        else marital = "";

        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pinCode = pinCodeField.getText();

        try {
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else if(fName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Father's Name is required");
            } else if(dob.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            } else if(gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Gender is required");
            } else if(email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email is required");
            } else if(marital.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Marital Status is required");
            } else if(address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Address is required");
            } else if(city.isEmpty()) {
                JOptionPane.showMessageDialog(null, "City is required");
            } else if(state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "State is required");
            } else if(pinCode.isEmpty()) {
                JOptionPane.showMessageDialog(null, "PIN Code is required");
            } else {
                DBConnection conn = new DBConnection();
                String qry = "INSERT INTO user VALUES('" + formNo + "', '" + name + "', '" + fName + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pinCode + "')";
                conn.stmt.executeUpdate(qry);

                setVisible(false);
                new SignupTwo(formNo).setVisible(true);
            }



        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
