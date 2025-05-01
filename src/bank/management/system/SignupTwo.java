package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {

    String formNo;
    JLabel additionalDetails, religion, category, income, educational, qualification, occupation, pan, aadhaar, isSenior, isAccountExist;
    JTextField panField, aadhaarField;
    JComboBox religionField, categoryField, incomeField, qualificationField, occupationField;
    JButton next;
    JRadioButton sYes, sNo, aYes, aNo;
    ButtonGroup isSeniorGroup, AccountGroup;

    SignupTwo(String formNo) {
        this.formNo = formNo;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM: PAGE-2");

        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Railway", Font.BOLD, 20));
        additionalDetails.setBounds(300, 80, 300, 30);
        add(additionalDetails);

        religion = new JLabel("Religion: ");
        religion.setFont(new Font("Railway", Font.BOLD, 20));
        religion.setBounds(130, 140, 100, 30);
        add(religion);

        String[] religions = {"Hindu", "Muslim", "Sheik", "Others"};
        religionField = new JComboBox(religions);
        religionField.setFont(new Font("Railway", Font.BOLD, 14));
        religionField.setBounds(330, 140, 370, 30);
        religionField.setBackground(Color.WHITE);
        add(religionField);

        category = new JLabel("Category: ");
        category.setFont(new Font("Railway", Font.BOLD, 20));
        category.setBounds(130, 190, 200, 30);
        add(category);

        String[] categories = {"General", "OBC", "SC/ST", "Others"};
        categoryField = new JComboBox(categories);
        categoryField.setFont(new Font("Railway", Font.BOLD, 14));
        categoryField.setBounds(330, 190, 370, 30);
        categoryField.setBackground(Color.WHITE);
        add(categoryField);

        income = new JLabel("Income: ");
        income.setFont(new Font("Railway", Font.BOLD, 20));
        income.setBounds(130, 240, 200, 30);
        add(income);

        String[] incomesOptions = {"Null", "< 1,50,000", "< 2,50,00", "< 5,00,00", "Up to 10,00,000"};
        incomeField = new JComboBox(incomesOptions);
        incomeField.setFont(new Font("Railway", Font.BOLD, 14));
        incomeField.setBounds(330, 240, 370, 30);
        incomeField.setBackground(Color.WHITE);
        add(incomeField);

        educational = new JLabel("Educational");
        educational.setFont(new Font("Railway", Font.BOLD, 20));
        educational.setBounds(130, 290, 200, 30);
        add(educational);

        qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Railway", Font.BOLD, 20));
        qualification.setBounds(130, 320, 200, 30);
        add(qualification);

        String[] educationQualifications = {"Non Graduate", "Graduate", "Post Graduate", "Doctorate", "Others"};
        qualificationField = new JComboBox(educationQualifications);
        qualificationField.setFont(new Font("Railway", Font.BOLD, 14));
        qualificationField.setBounds(330, 320, 370, 30);
        qualificationField.setBackground(Color.WHITE);
        add(qualificationField);

        occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Railway", Font.BOLD, 20));
        occupation.setBounds(130, 390, 200, 30);
        add(occupation);

        String[] occupations = {"Salaried", "Self Employed", "Business Man", "Student", "Retired", "Others"};
        occupationField = new JComboBox(occupations);
        occupationField.setFont(new Font("Railway", Font.BOLD, 14));
        occupationField.setBounds(330, 390, 370, 30);
        occupationField.setBackground(Color.WHITE);
        add(occupationField);

        pan = new JLabel("PAN No: ");
        pan.setFont(new Font("Railway", Font.BOLD, 20));
        pan.setBounds(130, 440, 200, 30);
        add(pan);

        panField = new JTextField();
        panField.setFont(new Font("Railway", Font.BOLD, 14));
        panField.setBounds(330, 440, 370, 30);
        add(panField);

        aadhaar = new JLabel("Aadhaar No: ");
        aadhaar.setFont(new Font("Railway", Font.BOLD, 20));
        aadhaar.setBounds(130, 490, 200, 30);
        add(aadhaar);

        aadhaarField = new JTextField();
        aadhaarField.setFont(new Font("Railway", Font.BOLD, 14));
        aadhaarField.setBounds(330, 490, 370, 30);
        add(aadhaarField);

        isSenior = new JLabel("Senior Citizen: ");
        isSenior.setFont(new Font("Railway", Font.BOLD, 20));
        isSenior.setBounds(130, 540, 200, 30);
        add(isSenior);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(330, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(480, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        isSeniorGroup = new ButtonGroup();
        isSeniorGroup.add(sYes);
        isSeniorGroup.add(sNo);

        isAccountExist = new JLabel("Existing Account: ");
        isAccountExist.setFont(new Font("Railway", Font.BOLD, 20));
        isAccountExist.setBounds(130, 590, 200, 30);
        add(isAccountExist);

        aYes = new JRadioButton("Yes");
        aYes.setBounds(330, 590, 100, 30);
        aYes.setBackground(Color.WHITE);
        add(aYes);

        aNo = new JRadioButton("No");
        aNo.setBounds(480, 590, 100, 30);
        aNo.setBackground(Color.WHITE);
        add(aNo);

        AccountGroup = new ButtonGroup();
        AccountGroup.add(aYes);
        AccountGroup.add(aNo);

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
        String formNo = this.formNo;
        String religion = (String) religionField.getSelectedItem();
        System.out.println(religion);
        String category = (String) categoryField.getSelectedItem();
        String income = (String) incomeField.getSelectedItem();
        String qualification = (String) qualificationField.getSelectedItem();
        String occupation = (String) occupationField.getSelectedItem();
        String pan = panField.getText();
        String aadhaar = aadhaarField.getText();
        String isSenior;
        if(sYes.isSelected()) isSenior = "Yes";
        else if(sNo.isSelected()) isSenior = "No";
        else isSenior = "";

        String isAccountExist;
        if(aYes.isSelected()) isAccountExist = "Yes";
        else if(aNo.isSelected()) isAccountExist = "No";
        else isAccountExist = "";

        try {
            if(religion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Religion is Required");
            } else if(category.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Category is required");
            } else if(income.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Income is required");
            } else if(qualification.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Qualification is required");
            } else if(occupation.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Occupation is required");
            } else if(pan.isEmpty()) {
                JOptionPane.showMessageDialog(null, "PAN Status is required");
            } else if(aadhaar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Aadhaar is required");
            } else if(isSenior.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Senior Citizen Field is required");
            } else if(isAccountExist.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Account Field is required");
            } else {
                DBConnection conn = new DBConnection();
                String qry = "INSERT INTO personal_details VALUES('" + formNo + "', '" + religion + "', '" + category + "', '" + income + "', '" + qualification + "', '" + occupation + "', '" + pan + "', '" + aadhaar + "', '" + isSenior + "', '" + isAccountExist + "')";
                conn.stmt.executeUpdate(qry);

                setVisible(false);
                new SignupThree(formNo).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
