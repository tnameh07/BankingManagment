
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// import java.sql.Statement;














public class Database{
    

    private static final String Url = "jdbc:mysql://localhost:3306/DevdeCoprativeBank";
    private static final String Username = "root";
    private static final String Pswd = "Space@2611";

// private static Database t= new Database();
private static Connection conn;
//  static Scanner sc;



static{

    // System.out.println("Start program ");
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        // System.out.println("Driver loaded succusesfully");
        conn =(Connection)DriverManager.getConnection(Url, Username, Pswd);
        // System.out.println(
        //     "Connection istablished"
        // );

    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }

    // System.out.println("End program ");
}

public static Connection getInstance(){
    return conn;
} 

}


    
   


 