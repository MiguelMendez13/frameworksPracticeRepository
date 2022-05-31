package com.mycompany.web.servlets;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class sql {

    public static String crear(int total){
        String hecho="Borrar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("INSERT INTO Fecha VALUES(?)");
            pst.setString(1, String.valueOf(total));
            pst.execute();
            pst.close();
            conn.close();
            hecho+="si";
        }
        catch(Exception e){
            System.out.println(e);
            hecho+="no";
        }
        return hecho;
    }

    public static String borrar(){
        String hecho="Borrar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("delete from Fecha limit 1");
            pst.execute();
            pst.close();
            conn.close();
            hecho+="si";
        }
        catch(Exception e){
            System.out.println(e);
            hecho+="no";
        }
        return hecho;
    }
    public static String cambiar(){
        String hecho="Cambiar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("update Fecha set dias='1000' limit 1");
            pst.execute();
            pst.close();
            conn.close();
            hecho+="si";
        }
        catch(Exception e){
            System.out.println(e);
            hecho+="no";
        }
        return hecho;
    }
    public static String[] leer(){
        String[] hecho=new String[30];
        try{
            Connection conn = bdConexion.getConnection();
            Statement pst= conn.createStatement();
            ResultSet resultado= pst.executeQuery("select * from Fecha");
            int contar=1;
            while (resultado.next()) {
                //System.out.println(resultado.getString("dias"));
                hecho[contar]=resultado.getString("dias");
                contar++;
            }
            pst.close();
            conn.close();
            hecho[0]="Leer si";
        }
        catch(Exception e){
            System.out.println(e);
            hecho[0]="Leer si";
        }
        return hecho;
    }
}
