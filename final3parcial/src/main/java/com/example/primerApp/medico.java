package com.example.primerApp;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Random;



public class medico {

    public static String generarId(){
        String cadena="";
        int min = 0;
        int max = 9;
        Random random = new Random();

        for(int i=0;i<8;i++){
            int value = random.nextInt(max + min) + min;
            cadena=cadena+String.valueOf(value);
        }
        return (cadena);


    }


    public static String agregarMedico(String nombre,String apellido, String esp){
        String hecho="Agregar ";
        String medicoId=generarId();
        String espId=generarId();
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("INSERT INTO Medico VALUES(?,?,?)");
            pst.setString(1, medicoId);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.execute();
            pst.close();
            conn.close();
            hecho+="si";

            Connection conn2 = bdConexion.getConnection();
            PreparedStatement pst2= conn2.prepareStatement("INSERT INTO Especialidad VALUES(?,?)");
            pst2.setString(1, espId);
            pst2.setString(2, esp);
            pst2.execute();
            pst2.close();
            conn2.close();
            hecho+="si";

            Connection conn3 = bdConexion.getConnection();
            PreparedStatement pst3= conn3.prepareStatement("INSERT INTO MedicoEspecialidad VALUES(?,?)");
            pst3.setString(1, medicoId);
            pst3.setString(2, espId);
            pst3.execute();
            pst3.close();
            conn3.close();
            hecho+="si";
        }
        catch(Exception e){
            System.out.println(e);
            hecho+="no";
        }




        return hecho;
    }



    public static String borrar(String id){
        String hecho="Borrar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("delete from Medico where idMedico=?");
            pst.setString(1, id);
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




    public static String cambiar(String nombre,String apellido,String id){
        String hecho="Cambiar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("update Medico set nombreMedico=?, apellidosMedico=? where idMedico = ?");
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, id);
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



    public static String leer(){
        String leido="<table border='1'><tr><td>idMedico</td><td>nombreMedico</td><td>apellidosMedico</td><td></td><td></td></tr>";
        try{
            Connection conn = bdConexion.getConnection();
            Statement pst= conn.createStatement();
            ResultSet resultado= pst.executeQuery("select * from Medico");

            while (resultado.next()) {
                //System.out.println(resultado.getString("dias"));
                //hecho[contar]=resultado.getString("dias");
                leido+="<tr><td>"+resultado.getString("idMedico")+"</td><td>"+resultado.getString("nombreMedico")+"</td><td>"+resultado.getString("apellidosMedico")+"</td><td><a href='/editarMed?id="+resultado.getString("idMedico")+"'>Editar</a></td><td><a href='/borrarMed?id="+resultado.getString("idMedico")+"'><font color='red'>Borar</font></a></td></tr>";
                //leido+="<td>"+resultado.getString("idMedico")+"</td>";
               
               
               
            }
            leido+="</table>";
            pst.close();
            conn.close();
            
        }
        catch(Exception e){
            System.out.println(e);

        }
        return leido;
    }
}
