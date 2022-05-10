package com.mycompany.web.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bdConexion {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection databaseconnection = null;       
         Class.forName("com.mysql.jdbc.Driver");
         databaseconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FechasGuardadas", "MiguelTareas", "12345678");       
        return databaseconnection;       
    }
}
