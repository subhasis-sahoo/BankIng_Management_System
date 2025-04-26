package bank.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    JLabel formNo, personalDetails, name, fName, dob, gender, email, marital, address, city, state, pinCode;
    JTextField nameField, fNameField, emailField, addressField, cityField, stateField, pinCodeField;
    JDateChooser dobField;
    JButton next;
    JRadioButton male, female, married, unmarried, others;
    ButtonGroup genderGroup, maritalGroup;

    SignupOne() {

        setLayout(null);

        int randFormNo = (int) (Math.random() * ((10000 - 1000) + 1000));
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

        others = new JRadioButton("Others");
        others.setBounds(630, 390, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);

        maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);

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
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
