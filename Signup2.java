

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;


public class Signup2 extends JFrame implements ActionListener {
   
  long fnum;  
  JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
  JRadioButton r1, r2, r3, r4 ;
  JTextField t1, t2;
  JComboBox c1, c2, c3, c4, c5;
  JCheckBox d1, d2, d3, d4, d5, d6;
  JButton b, b2,btn_sub;
  String formno;
  
  Signup2(String formno){
    
    setLayout(null);
    //setUndecorated(true);
    
    this.formno = formno;
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
    System.out.println("form no  0: " + formno);
    l1 = new JLabel("Page 2: Additonal Details");
    l1.setFont(new Font("Raleway", 1, 22));
    l1.setBounds(280, 30, 600, 40);
    add(l1);
    
    l2 = new JLabel("Account Type:");
    l2.setFont(new Font("Raleway", 1, 18));
    l2.setBounds(100, 100, 200, 30);
    add(l2);

    r1 = new JRadioButton("Saving Account");
    r1.setFont(new Font("Raleway", 1, 16));
    r1.setBackground(new Color(83, 83, 83));
    r1.setBounds(235, 100, 160, 30);
    add(r1);

    r3 = new JRadioButton("Current Account");
    r3.setFont(new Font("Raleway", 1, 16));
    r3.setBackground(new Color(83, 83, 83));
    r3.setBounds(400, 100, 160, 30);
    add(r3);

    ButtonGroup groupgender = new ButtonGroup();
    groupgender.add(r1);
    // groupgender.add(r2);
    groupgender.add(r3);
    // groupgender.add(r4);
    l10 = new JLabel("Services Required:");
    l10.setFont(new Font("Raleway", 1, 18));
    l10.setBounds(100, 350, 200, 30);
    add(l10);
    
    d1 = new JCheckBox("ATM Card");
    d1.setBackground(new Color(83, 83, 83));
    d1.setFont(new Font("Raleway", 1, 16));
    d1.setBounds(100, 380, 200, 30);
    add(d1);
    
    d2 = new JCheckBox("Internet Banking");
    d2.setBackground(new Color(83, 83, 83));
    d2.setFont(new Font("Raleway", 1, 16));
    d2.setBounds(300, 380, 200, 30);
    add(d2);
    
    d3 = new JCheckBox("Mobile Banking");
    d3.setBackground(new Color(83, 83, 83));
    d3.setFont(new Font("Raleway", 1, 16));
    d3.setBounds(100, 410, 200, 30);
    add(d3);
    
    d4 = new JCheckBox("Email Alerts");
    d4.setBackground(new Color(83, 83, 83));
    d4.setFont(new Font("Raleway", 1, 16));
    d4.setBounds(300, 410, 200, 30);
    add(d4);
    
    d5 = new JCheckBox("Cheque Book");
    d5.setBackground(new Color(83, 83, 83));
    d5.setFont(new Font("Raleway", 1, 16));
    d5.setBounds(100, 440, 200, 30);
    add(d5);

    d6 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
    d6.setBackground(new Color(83, 83, 83));
    d6.setFont(new Font("Raleway", 1, 13));
    d6.setBounds(100, 600, 600, 20);
    add(d6);
    // l2 = new JLabel("Religion:");
    // l2.setFont(new Font("Raleway", 1, 18));
    // l2.setBounds(100, 120, 100, 30);
    // add(l2);
    
    
    // String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other" };
    // c1 = new JComboBox(religion);
    // c1.setBackground(Color.WHITE);
    // c1.setFont(new Font("Raleway", 1, 14));
    // c1.setBounds(350, 120, 320, 30);
    // add(c1);
    
    
    // l3 = new JLabel("Category:");
    // l3.setFont(new Font("Raleway", 1, 18));
    // l3.setBounds(100, 170, 100, 30);
    // add(l3);
    
    // String[] category = {"General", "OBC", "SC", "ST", "Other" };
    // c2 = new JComboBox(category);
    // c2.setBackground(Color.WHITE);
    // c2.setFont(new Font("Raleway", 1, 14));
    // c2.setBounds(350, 170, 320, 30);
    // add(c2);
    
    
    l4 = new JLabel("Income:");
    l4.setFont(new Font("Raleway", 1, 18));
    l4.setBounds(100, 150, 100, 30);
    add(l4);
    
    String[] income = { "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
    c3 = new JComboBox(income);
    c3.setBackground(Color.WHITE);
    c3.setFont(new Font("Raleway", 1, 14));
    c3.setBounds(235, 150, 320, 30);
    add(c3);
    c3.setBackground(new Color(83, 83, 83));
    
    // l5 = new JLabel("Educational");
    // l11 = new JLabel("Qualification:");
    // l11.setFont(new Font("Raleway", 1, 18));
    // l5.setFont(new Font("Raleway", 1, 18));
    // l5.setBounds(100, 270, 150, 30);
    // l11.setBounds(100, 290, 150, 30);
    // add(l11);
    // add(l5);
    
    // String[] education = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
    // c4 = new JComboBox(education);
    // c4.setBackground(Color.WHITE);
    // c4.setFont(new Font("Raleway", 1, 14));
    // c4.setBounds(350, 270, 320, 30);
    // add(c4);
    
    l6 = new JLabel("Occupation:");
    l6.setFont(new Font("Raleway", 1, 18));
    l6.setBounds(100, 200, 150, 30);
    add(l6);
    
    String[] occupation = { "Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others" };
    c5 = new javax.swing.JComboBox(occupation);
    c5.setBackground(Color.WHITE);
    c5.setFont(new Font("Raleway", 1, 14));
    c5.setBounds(235, 200, 320, 30);
    add(c5);
    c5.setBackground(new Color(83, 83, 83));
    d6.setBackground(new Color(83, 83, 83));
    l7 = new JLabel("Contact No :");
    l7.setFont(new Font("Raleway", 1, 18));
    l7.setBounds(100, 240, 150, 30);
    add(l7);
    
    
    l8 = new JLabel("Aadhar Number:");
    l8.setFont(new Font("Raleway", 1, 18));
    l8.setBounds(100, 280, 180, 30);
    add(l8);
    
    
    // l9 = new JLabel("Senior Citizen:");
    // l9.setFont(new Font("Raleway", 1, 18));
    // l9.setBounds(100, 490, 150, 30);
    // add(l9);
    // r1 = new JRadioButton("Yes");
    // r1.setFont(new Font("Raleway", 1, 14));
    // r1.setBackground(new Color(204, 255, 255));
    // r1.setBounds(350, 490, 100, 30);
    // add(r1);
    // r2 = new javax.swing.JRadioButton("No");
    // r2.setFont(new Font("Raleway", 1, 14));
    // r2.setBackground(new Color(204, 255, 255));
    // r2.setBounds(460, 490, 100, 30);
    // add(r2);
    
    // ButtonGroup groupgender = new ButtonGroup();
    // groupgender.add(r1);
    // groupgender.add(r2);
   
    // l10 = new JLabel("Existing Account:");
    // l10.setFont(new Font("Raleway", 1, 18));
    // l10.setBounds(100, 540, 180, 30);
    // add(l10);
    // r3 = new JRadioButton("Yes");
    // r3.setFont(new Font("Raleway", 1, 14));
    // r3.setBackground(new Color(204, 255, 255));
    // r3.setBounds(350, 540, 100, 30);
    // add(r3);
    // r4 = new JRadioButton("No");
    // r4.setFont(new Font("Raleway", 1, 14));
    // r4.setBackground(new Color(204, 255, 255));
    // r4.setBounds(460, 540, 100, 30);
    // add(r4);
    
    // ButtonGroup groupgender1 = new ButtonGroup();
    // groupgender1.add(r3);
    // groupgender1.add(r4);
    
    l12 = new JLabel("Form No:");
    l12.setFont(new Font("Raleway", 1, 13));
    l12.setBounds(700, 10, 60, 30);
    add(l12);
    
    l13 = new JLabel(formno);
    l13.setFont(new Font("Raleway", 1, 13));
    l13.setBounds(760, 10, 60, 30);
    add(l13);
    
    t2 = new JTextField();
    t2.setFont(new Font("Raleway", 1, 14));
    t2.setBounds(235, 280, 320, 30);
    add(t2);
    t2.setBackground(new Color(83, 83, 83));
    
    t1 = new JTextField();
    t1.setFont(new Font("Raleway", 1, 14));
    t1.setBounds(235, 240, 320, 30);
    add(t1);
    t1.setBackground(new Color(83, 83, 83));
    
  
    btn_sub = new JButton("SUBMIT");
    btn_sub.setFont(new Font("Raleway", 1, 15));
    // btn_sub.setBackground(Color.BLACK);
    // btn_sub.setForeground(Color.WHITE);
    btn_sub.setBounds(250, 720, 100, 35);
    add(btn_sub);
    btn_sub.addActionListener(this);


    b2 = new JButton("CANCEL");
    b2.setFont(new Font("Raleway", 1, 15));
    // b2.setBackground(Color.BLACK);
    // b2.setForeground(Color.WHITE);
    b2.setBounds(420, 720, 100, 35);
    add(b2);
    b2.addActionListener(this);

    // b = new JButton("NEXT PAGE>>");
    // b.setFont(new Font("Raleway", 1, 13));
    // // b.setBackground(Color.BLACK);
    // // b.setForeground(Color.WHITE);
    // b.setBounds(350, 650, 140, 35);
    // add(b);
    // b.addActionListener(this);
    
    getContentPane().setBackground(new Color(83, 83, 83));
    
    setSize(1000, 1000);
   // setLocation(500, 120);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) { 
    
    //  String formno = "" + fnum; 
    // String sreligion = (String)c1.getSelectedItem();
    // String scategory = (String)c2.getSelectedItem();
    String sincome = (String)c3.getSelectedItem();
    // String seducation = (String)c4.getSelectedItem();
    String soccupation = (String)c5.getSelectedItem();
    
    String Contact_nomber = t1.getText();
    String aadhar = t2.getText();
    
    // String scitizen = "";
    // if (r1.isSelected()) {
    //   scitizen = "Yes";
    // }
    // else if (r2.isSelected()) {
    //   scitizen = "No";
    // }
    
    // String eaccount = "";
    // if (r3.isSelected()) {
    //   eaccount = "Yes";
    // } else if (r4.isSelected()) {
    //   eaccount = "No";
    // }
    String atype = null;
   if (r1.isSelected()) {
     atype = "Saving Account";
   }
   // else if (r2.isSelected()) {
   //   atype = "Fixed Deposit Account";
   // }
   else if (r3.isSelected()) {
     atype = "Current Account";
   }
   //  else if (r4.isSelected()) {
   //   atype = "Recurring Deposit Account";
   // }
   
   Random ran = new Random();
   long first7 = ran.nextLong() % 90000000L + 35406000000000L;
   String Accountno = "" + Math.abs(first7);
   
   long first5 = ran.nextLong() % 90000L + 100000L;
   String pin = "" + Math.abs(first5);
   
   String facility = "";
   if (d1.isSelected()) {
     facility = facility + " ATM Card";
   }
   if (d2.isSelected()) {
     facility = facility + " Internet Banking";
   }
   if (d3.isSelected()) {
     facility = facility + " Mobile Banking";
   }
   if (d4.isSelected()) {
     facility = facility + " Email Alerts";
   }
   if (d5.isSelected()) {
     facility = facility + " Cheque Book";
   }
  //  if (c6.isSelected()) {
  //    facility = facility + " E-Statement";
  //  }

  System.out.println("form no 1 : " + formno);

   try
   {
     if (ae.getSource() == btn_sub)
     {
       if (atype.equals("")) {
         JOptionPane.showMessageDialog(null, "Fill all the required fields");
       } else {
         Connection c = Database.getInstance();
         System.out.println("form no : " + formno);
         String q ="UPDATE CutomerData SET Income =?, Occupation = ?, Contact_No =?, Adhar_No =? ,Account_Type =? ,Account_no=? ,Ac_Password=? , Service_avail=? WHERE Form_no =?;";

             	PreparedStatement ps=c.prepareStatement(q);
               System.out.println("form no 2 : " + formno);
               ps.setString(1, sincome);
               ps.setString(2, soccupation);
               ps.setString(3, Contact_nomber);
               ps.setString(4, aadhar);
               ps.setString(5, atype);
               ps.setString(6, Accountno);
               ps.setString(7, pin);
               ps.setString(8, facility);
              //  ps.setString(5, formno);
               ps.setString(9, formno);//form nomber

               System.out.println("form no 3: " + formno);
       int rs=  ps.executeUpdate();
       if(rs>0){
         System.out.println("Details Updates ");
         
         JOptionPane.showMessageDialog(null,"Congratulation!!\n Dear Customer, your Account are Successfully Opened." + "\n Account Number: " + Accountno + "\n Password:" + pin +"\n Thank You For Opening Account.");
       }else {
        JOptionPane.showMessageDialog( null ,"Please select form number ");
       }
       System.out.println("form no 4: " + formno);
         
       // new Deposit(pin, Accountno).setVisible(true);
       //  setVisible(false);
       }
     }
     else if (ae.getSource() == b2) {
       setVisible(false);
       new Login1().setVisible(true);
     }
   }
   catch (Exception ex) {
     ex.printStackTrace(); 
   }
 }

    
  // public void actionPerformed(ActionEvent ae) {
  //   //String formno = "" + fnum; 
  //   // String sreligion = (String)c1.getSelectedItem();
  //   // String scategory = (String)c2.getSelectedItem();
  //   String sincome = (String)c3.getSelectedItem();
  //   // String seducation = (String)c4.getSelectedItem();
  //   String soccupation = (String)c5.getSelectedItem();
    
  //   String Contact_nomber = t1.getText();
  //   String aadhar = t2.getText();
    
  //   // String scitizen = "";
  //   // if (r1.isSelected()) {
  //   //   scitizen = "Yes";
  //   // }
  //   // else if (r2.isSelected()) {
  //   //   scitizen = "No";
  //   // }
    
  //   // String eaccount = "";
  //   // if (r3.isSelected()) {
  //   //   eaccount = "Yes";
  //   // } else if (r4.isSelected()) {
  //   //   eaccount = "No";
  //   // }

  //   try
  //   {
  //     if (t2.getText().equals("")) {
  //       javax.swing.JOptionPane.showMessageDialog(null, "Fill all the required fields");
  //     } else {
  //       Connection c = Database.getInstance();
      
  //       String q ="UPDATE CutomerData SET Income = ?, Occupation = ?, Contact_No =?, Adhar_No =? WHERE Form_no =?;";

  //     	PreparedStatement ps=c.prepareStatement(q);
  //       ps.setString(1, sincome);
  //       ps.setString(2, soccupation);
  //       ps.setString(3, Contact_nomber);
  //       ps.setString(4, aadhar);
  //       ps.setString(5, formno);//form nomber


  //     int rs= ps.executeUpdate();
  //       if(rs>0){
  //         System.out.println("Data Update Succesfully ");
  //       }
  //       setVisible(false);
  //       new Signup3(formno).setVisible(true);
        
  //     }
      
  //   }
  //   catch (Exception ex)
  //   {
  //     ex.printStackTrace();
  //   }
  // }
  
  
  public static void main(String[] args) { 
      new Signup2(""); 
  }
      
}
