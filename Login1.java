
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import java.sql.*;

public class Login1 extends JFrame implements ActionListener{
    JButton login, signup, reset;
    JTextField AccountTextField;
    JPasswordField pinTextField;

    Login1() {
        setTitle("Welcome to login ");
        setLayout(null);

        // ImageIcon i1 = new ImageIcon("icons/login.jpg");
        // Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel label11 = new JLabel(i3);
        // label11.setBounds(750, 50, 700, 700);
        // add(label11);
 
        // ImageIcon l1 = new ImageIcon("icons/background.jpg");
        // // Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // // ImageIcon l3 = new ImageIcon(l2);
        // JLabel label = new JLabel(l1);
        // label.setBounds(0, 0, 2500, 1500);
        // add(label);

        // Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // ImageIcon l3 = new ImageIcon(l2);
        // JLabel label = new JLabel(l3);
        // label.setBounds(70, 10, 100, 100);
        // add(label);
        
        
        // ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginpage1.jpg"));
        // Image j2 = j1.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT);
        // ImageIcon j3 = new ImageIcon(j2);
        // JLabel label6 = new JLabel(j3);
        // label6.setBounds(20, 580, 700, 200);
        // add(label6);
         
        // ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/log_login.png"));
        // Image h2 = h1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        // ImageIcon h3 = new ImageIcon(h2);
        // JLabel label5 = new JLabel(h3);
        // label5.setBounds(300, 190, 70, 70);
        // add(label5);
        JLabel text1 = new JLabel("Enter your credentials here");
        text1.setFont(new Font("Osward", Font.BOLD, 20));
        text1.setForeground(Color.black);
        text1.setBounds(250, 225, 450, 40);
        add(text1);

        JLabel text = new JLabel("  WELCOME TO THE World Bank  ");
        text.setFont(new Font("Osward", Font.BOLD, 32));
        text.setForeground(Color.black);
        text.setBounds(210, 200, 800, 40);
        add(text);
        

        JLabel AccountNo = new JLabel("Account no");
        AccountNo.setFont(new Font("Raleway", Font.BOLD, 24));
        AccountNo.setBounds(250, 290, 200, 40);
        add(AccountNo);

        AccountTextField = new JTextField();
        AccountTextField.setBounds(250, 325, 300, 33);
        AccountTextField.setFont(new Font("Arial", Font.BOLD, 15));
        AccountTextField.setCaretColor(Color.blue);
        add(AccountTextField);

        JLabel pin = new JLabel("Password");
        pin.setFont(new Font("Raleway", Font.BOLD, 24));
        pin.setBounds(250, 360, 200, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(250, 395, 300, 33);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
        pinTextField.setCaretColor(Color.blue);
        add(pinTextField);

        login = new JButton("LOGIN");
        login.setBounds(250, 480, 120, 30);
        // login.setBackground(Color.black);
        // login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        signup = new JButton("SIGNUP");
        signup.setBounds(420, 480, 133, 30);
        // signup.setBackground(Color.black);
        // signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        reset = new JButton("RESET");
        reset.setBounds(250, 520, 300, 30);
        // reset.setBackground(Color.black);
        // reset.setForeground(Color.white);
        reset.addActionListener(this);
        add(reset);

        JButton forgetPasswordButton = new JButton("Forgot Password?");
        forgetPasswordButton.setBounds(420, 450, 133, 25);
        forgetPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                // Open a dialog for password reset
                JOptionPane.showMessageDialog(null, "Please contact support for password reset.");
            }
        });

        add(forgetPasswordButton);

        getContentPane().setBackground(new Color(83,83,83));

        setSize(1600, 1200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        /// perform sign-in , signUp, reset

        if (ae.getSource() == reset) {
            AccountTextField.setText(" ");
            pinTextField.setText(""); 
        } else if (ae.getSource() == login) {
            Connection c = Database.getInstance();
            String Accountno = AccountTextField.getText();
            String pin = pinTextField.getText();
            String query = "select *from CutomerData where Account_no = '" + Accountno + "' and Ac_Password = '" + pin + "'";
           
          
           
         
            try {
                PreparedStatement pstmt = c.prepareStatement(query);
                ResultSet rs =  pstmt.executeQuery();
                if (rs.next()) {
                    int balance = rs.getInt("Balance");
                    setVisible(false);
                    new Transactions(pin,Accountno, balance).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password or Account Number");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup1().setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Login1();
       
    }
}
