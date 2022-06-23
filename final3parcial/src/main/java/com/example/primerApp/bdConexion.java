package com.example.primerApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bdConexion {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection databaseconnection = null;       
         Class.forName("com.mysql.cj.jdbc.Driver");
         databaseconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final", "MiguelTareas", "12345678");       
        return databaseconnection;       
    }
}
