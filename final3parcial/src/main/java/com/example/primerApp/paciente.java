package com.example.primerApp;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Random;



public class paciente {
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


    public static String agregarPaciente(
        String Nombre,
        String Apellido,
        String fecha,
        String Dom,
        String Tel,
        String Mail,
        String Obs,
        String Pais,
        String pago,
        String turno
    ){
        String hecho="Agregar ";
        String pacienteId=generarId();
        //String espId=generarId();
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("INSERT INTO Paciente VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pacienteId);
            pst.setString(2, Nombre);
            pst.setString(3, Apellido);
            pst.setString(4, fecha);
            pst.setString(5, Dom);
            pst.setString(6, generarId());
            pst.setString(7, Tel);
            pst.setString(8, Mail);
            pst.setString(9, Obs);

            pst.execute();
            pst.close();
            conn.close();
            hecho+="si";

            Connection conn2 = bdConexion.getConnection();
            PreparedStatement pst2= conn2.prepareStatement("INSERT INTO Pais VALUES(?,?)");
            pst2.setString(1, generarId());
            pst2.setString(2, Pais);
            pst2.execute();
            pst2.close();
            conn2.close();
            hecho+="si";

            Connection conn3 = bdConexion.getConnection();
            PreparedStatement pst3= conn3.prepareStatement("INSERT INTO TurnoPaciente VALUES(?,?,?)");
            pst3.setString(1, generarId());
            pst3.setString(2, generarId());
            pst3.setString(3, generarId());
            pst3.execute();
            pst3.close();
            conn3.close();
            hecho+="si";

            Connection conn4 = bdConexion.getConnection();
            PreparedStatement pst4= conn4.prepareStatement("INSERT INTO PacientePagoRef VALUES(?,?,?)");
            pst4.setString(1, generarId());
            pst4.setString(2, generarId());
            pst4.setString(3, "123");
            pst4.execute();
            pst4.close();
            conn4.close();
            hecho+="si";

            Connection conn5 = bdConexion.getConnection();
            PreparedStatement pst5= conn5.prepareStatement("INSERT INTO Turno VALUES(?,?,?,?)");
            pst5.setString(1, generarId());
            pst5.setString(2, turno);
            pst5.setString(3, "pendiente");
            pst5.setString(4, "pendiente");

            pst5.execute();
            pst5.close();
            conn5.close();
            hecho+="si";

            Connection conn6 = bdConexion.getConnection();
            PreparedStatement pst6= conn6.prepareStatement("INSERT INTO TurnoEstado VALUES(?,?)");
            pst6.setString(1, generarId());
            pst6.setString(2, "pendiente");
            pst6.execute();
            pst6.close();
            conn6.close();
            hecho+="si";

            Connection conn7 = bdConexion.getConnection();
            PreparedStatement pst7= conn7.prepareStatement("INSERT INTO Pago VALUES(?,?,?,?,?,?)");
            pst7.setString(1, generarId());
            pst7.setString(2, "donativo");
            pst7.setString(3, "06-2022");
            pst7.setString(4, pago);
            pst7.setString(5, "pagado");
            pst7.setString(6, "pagado");
            pst7.execute();
            pst7.close();
            conn7.close();
            hecho+="si";

            Connection conn8 = bdConexion.getConnection();
            PreparedStatement pst8= conn8.prepareStatement("INSERT INTO Concepto VALUES(?,?)");
            pst8.setString(1, generarId());
            pst8.setString(2, "donativo");
            pst8.execute();
            pst8.close();
            conn8.close();
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
            PreparedStatement pst= conn.prepareStatement("delete from Paciente where idPaciente=?");
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
    public static String cambiar(String id, String Nombre, String Apellido, String fecha, String Dom, String Pais, String Tel, String Mail){
        String hecho="Cambiar ";
        try{
            Connection conn = bdConexion.getConnection();
            PreparedStatement pst= conn.prepareStatement("update Paciente set nombre=?, apellidos=?, fNacimiento=?, domicilio=?, telefono=?, email=? where idPaciente = ?");
            pst.setString(1, Nombre);
            pst.setString(2, Apellido);
            pst.setString(3, fecha);
            pst.setString(4, Dom);
            pst.setString(5, Tel);
            pst.setString(6, Mail);
            pst.setString(7, id);

            //id, Nombre, Apellido, fecha, Dom, Pais, Tel, Mail
            
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
        String leido="<table border='1'><tr><td>idPaciente</td><td>nombre</td><td>apellidos</td>    <td>fNacimiento</td> <td>fNacimiento</td> <td>domicilio</td> <td>telefono</td>  <td>email</td>    <td></td><td></td></tr>";
      
        try{
            Connection conn = bdConexion.getConnection();
            Statement pst= conn.createStatement();
            ResultSet resultado= pst.executeQuery("select * from Paciente");

            while (resultado.next()) {
                //System.out.println(resultado.getString("dias"));
                //hecho[contar]=resultado.getString("dias");
                leido+="<tr><td>"+resultado.getString("idPaciente")+"</td><td>"+resultado.getString("nombre")+"</td><td>"+resultado.getString("apellidos")+"</td><td>"+resultado.getString("fNacimiento")+"</td><td>"+resultado.getString("domicilio")+"</td><td>"+resultado.getString("telefono")+"</td><td>"+resultado.getString("email")+"</td>                                 <td><a href='/editarPac?id="+resultado.getString("idPaciente")+"'>Editar</a></td><td><a href='/borrarPac?id="+resultado.getString("idPaciente")+"'><font color='red'>Borar</font></a></td></tr>";
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
    public static String leerPago(){
        String leido="<table border='1'><tr><td>idPago</td><td>concepto</td><td>fecha</td>    <td>monto</td> <td>estado</td> <td>observacion</td>";
      
        try{
            Connection conn = bdConexion.getConnection();
            Statement pst= conn.createStatement();
            ResultSet resultado= pst.executeQuery("select * from Pago");

            while (resultado.next()) {
                //System.out.println(resultado.getString("dias"));
                //hecho[contar]=resultado.getString("dias");
                leido+="<tr><td>"+resultado.getString("idPago")+"</td><td>"+resultado.getString("concepto")+"</td><td>"+resultado.getString("fecha")+"</td><td>"+resultado.getString("monto")+"</td><td>"+resultado.getString("estado")+"</td><td>"+resultado.getString("observacion")+"</td></tr>";
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
