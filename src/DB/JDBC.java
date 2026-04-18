/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

/**
 *
 * @author kanniyappan.s
 */import java.sql.*;
public class JDBC {
    private static final String URL="jdbc:sqlserver://localhost:1433;TrustServerCertificate=True;databaseName=pharmacy";
    private static final String User="pharmacy";
    private static final String Pass="pharmacy";
    
    public static Connection con()throws SQLException, ClassNotFoundException{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     return DriverManager.getConnection(URL,User,Pass);
    }
}
