


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;


class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
    JLabel l1, l3;
    
    String pin;
    String Accountno;
    int balance;
    BalanceEnquiry(String pin, String Accountno ,int balance) {
       setSize(1600, 1200);
      // setUndecorated(true);
       setVisible(true);
       setLayout(null);
       getContentPane().setBackground(new Color(204, 229, 255));
       this.balance=balance;
        this.pin = pin;
        this.Accountno = Accountno;

        
        
     JLabel text = new JLabel("WELCOME TO THE BANK ");
     text.setFont(new Font("Osward", Font.BOLD,32));
     text.setBounds(200, 40, 450, 40);
     text.setForeground(Color.black);
     add(text);
            
    //  ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    //  Image m2 = m1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    //  ImageIcon m3 = new ImageIcon(m2);  
    //  JLabel label0 = new JLabel(m3);
    //  label0.setBounds(70, 10, 100, 100);
    //  add(label0);
        
    //     ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/withdraw2.jpg"));
    //     Image k2 = k1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
    //     ImageIcon k3 = new ImageIcon(k2);
    //     JLabel label8 = new JLabel(k3);
    //     label8.setBounds(800, 0, 800, 800);
    //     add(label8);
  
        
        back = new JButton("BACK");
        back.setBounds(300, 633, 150, 35);
        back.addActionListener(this);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        add(back);
        
//          Connection  c = Database.getInstance();
//          int balance1 = 0;
//         try{
// String query ="select * from CutomerData where Ac_Password = '" + pin + "' and Account_no = '" + Accountno + "'";
//             PreparedStatement pstmt = c.prepareStatement(query);
//             ResultSet rs = pstmt.executeQuery();
            
//             while (rs.next()) {
//                 if (rs.getString("type").equals("Deposit")) {
//                     balance1 += Integer.parseInt(rs.getString("amount"));
//                 } else {
//                     balance1 -= Integer.parseInt(rs.getString("amount"));
//                 }
//             }
//         }catch(Exception e){
//        System.out.println(e);
//         }
            JLabel bl =new JLabel("Your Current Account Balance is Rs "+balance);
            bl.setForeground(Color.red);
            bl.setBounds(150, 300, 800, 30);
            bl.setFont(new Font("Raleway", Font.BOLD, 25));
            add(bl);
    }
    

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin, Accountno , balance).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("","" ,10);
    }
}