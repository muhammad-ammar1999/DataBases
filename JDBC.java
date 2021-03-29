/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopms;

import java.sql.*;
import java.lang.*;
/**
 *
 * @author muhammadammar
 */
public class ShopMS {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/ShopMS","root","");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from inventory" + ";");
        System.out.println("Test");
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5)+"  "+rs.getDate(6)+"  "+rs.getInt(7));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }
}


