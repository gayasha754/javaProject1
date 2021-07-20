package lk.ac.kln.Lab_07;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    public static Connection connect(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
}
