
package com.mycompany.web.servlets;

import java.io.IOException;
import java.sql.Connection;

//import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
//import javax.servlet.http.*;
//import org.json.*;
import java.sql.PreparedStatement;
import java.sql.Statement;



@WebServlet(urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
      //PrintWriter out = response.getWriter();
        request.setAttribute("dias", "0");
        request.setAttribute("dia", "1990-01-01");
        RequestDispatcher respuesta =  request.getRequestDispatcher("/indexTemplate.jsp");
        respuesta.forward(request, response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        //fecha llegada de post
        String fecha = request.getParameter("fecha");
        String fechaStr =String.valueOf(fecha);
        String[] romper = fechaStr.split("-");
        System.out.println(fecha);

        //fecha a mandar y devolver de clase DiasReturn
        int dia=Integer.valueOf(romper[2]),mes=Integer.valueOf(romper[1]),anio=Integer.valueOf(romper[0]);
        DiasReturn dias = new DiasReturn(dia, mes, anio);
        int total = dias.contarDias();



        
        try {               
            Connection conn = bdConexion.getConnection();
            //Connection conn = Conexion.getConnection();   
            PreparedStatement pst= conn.prepareStatement("INSERT INTO Fecha VALUES(?)");
            pst.setString(1, String.valueOf(total));
            pst.execute();

        }catch(Exception e){
            System.out.println(e);
        }
        //retornar json con los dias contados
        /*response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        JSONObject json = new JSONObject();
        json.put("Dias", String.valueOf(total));
        out.print(json.toString());*/

        request.setAttribute("dias", String.valueOf(total));
        request.setAttribute("dia", fecha);
        RequestDispatcher respuesta =  request.getRequestDispatcher("/indexTemplate.jsp");
        respuesta.forward(request, response);


    }
  }
