package com.example.primerApp;
public class Direccion extends Persona{
	private String delegacion;
	private String colonia;
	private String calle;
	private String numExt;
	private String numInt;
	private String referencias;


	public Direccion(String delegacion, String colonia,
			String calle,String numExt,String numInt,
            String nombre,String apellido_Pat,
            String apellido_Mat,String fecha_Nacimiento,
            int telefono,String correo){

        super(nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,telefono,correo);
        this.delegacion=delegacion;
        this.colonia=colonia;
        this.calle=calle;
        this.numExt=numExt;
        this.numInt=numInt;

    }
	public void setDelegacion(String delegacion){
		this.delegacion=delegacion;
	}
	public String getDelegacion(){
		return this.delegacion;
	}
	
	public void setColonia(String colonia){
		this.colonia=colonia;
	}
	public String getColonia(){
		return this.colonia;
	}

	public void setCalle(String calle){
		this.calle=calle;
	}
	public String getCalle(){
		return this.calle;
	}

	public void setNumExt(String numExt){
		this.numExt=numExt;
	}
	public String getNumExt(){
		return this.numExt;
	}

	public void setNumInt(String numInt){
		this.numInt=numInt;
	}
	public String getNumInt(){
		return this.numInt;
	}
	public void setReferencias(String referencias){
		this.referencias=referencias;
	}
	public String getReferencias(){
		return this.referencias;
	}




    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Clase direccion:");
        System.out.println(this.getDelegacion());
        System.out.println(this.getColonia());
        System.out.println(this.getCalle());
        System.out.println(this.getNumExt());
        System.out.println(this.getNumInt());
        System.out.println("\n\n\n");
    }
}
