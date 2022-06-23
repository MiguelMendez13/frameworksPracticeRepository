package com.example.primerApp;
public class Cuenta extends Persona{
    private String contrasena;
    private String tipo_de_cuenta;
    private String marcaDeCuenta;
    private String marcaTarjeta;
    private double descuentoo;
    public String ultima_compra;
    public float costo;
    public double total;

    public Cuenta(String contrasena, String tipo_de_cuenta,
                   String nombre,String apellido_Pat,
                   String apellido_Mat,String fecha_Nacimiento,
                   int telefono,String correo,
                   String marcaDeCuenta,String ultima_compra,float costo){

        super(nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,telefono,correo);
        this.contrasena=contrasena;
        this.tipo_de_cuenta=tipo_de_cuenta;

        this.marcaDeCuenta=marcaDeCuenta;
        this.ultima_compra=ultima_compra;
        this.costo=costo;

        descuento(marcaDeCuenta);
        setTarjeta(marcaDeCuenta);
        ultimaC(ultima_compra,costo);

    }


    public void cambiar_contrasena(String antigua,String nueva){
        if(antigua==contrasena){
            this.contrasena=nueva;
        }
    }
    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }
    public String getContrasena(){
        return this.contrasena;
    }

    public void setTipoDeCuenta(String tipo_de_cuenta){
        this.tipo_de_cuenta=tipo_de_cuenta;
    }
    public String getTipoDeCuenta(){
        return tipo_de_cuenta;
    }


    public void setTarjeta(String tarjetaa){
        this.marcaTarjeta=tarjetaa;
        descuento(tarjetaa);
    }
    public String getTarjeta(){
        return this.marcaTarjeta;
    }

    public void descuento(String marcaTarjeta){
        if(marcaTarjeta.equals("amex")){
            this.descuentoo=.30;
        }
        else if(marcaTarjeta.equals("visa")){
            this.descuentoo=.20;
        }
        else if(marcaTarjeta.equals("master")){
            this.descuentoo=.15;
        }
        else{
            this.descuentoo=0;
        }
    }
    public double getDescuento(){
        return this.descuentoo;
    }

    public void ultimaC(String ultima_compra, float costo){
        this.ultima_compra=ultima_compra;
        this.costo=costo;
        this.total=costo-(costo*descuentoo);
    }


    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Clase Cuenta:");
        System.out.println(this.getContrasena());
        System.out.println(this.getTipoDeCuenta());
        System.out.println("\n\n\n");


        System.out.println("Su tipo de tarjeta es: "+getTarjeta());
        System.out.println("Por lo tanto goza de un "+(getDescuento()*100)+"%");
        System.out.println("que hizo que su ultima compra "+this.ultima_compra+" de: "+this.costo+" tuviera un costo final de: "+this.total);


    }


}
