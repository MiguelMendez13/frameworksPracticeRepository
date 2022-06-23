package com.example.primerApp;

public class Persona{
	private String nombre;
	private String apellido_Pat;
	private String apellido_Mat;
	private String fecha_Nacimiento;
	private int telefono;
	private String correo;

	public Persona(String nombre,String apellido_Pat,
				   String apellido_Mat,String fecha_Nacimiento,
				   int telefono,String correo){
		this.nombre=nombre;
		this.apellido_Pat=apellido_Pat;
		this.apellido_Mat=apellido_Mat;
		this.fecha_Nacimiento=fecha_Nacimiento;
		this.telefono=telefono;
		this.correo=correo;

	}


	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}

	public void setApellido_Pat(String apellido_Pat){
		this.apellido_Pat=apellido_Pat;
	}
	public String getApellido_Pat(){
		return this.apellido_Mat;
	}

	public void setApellido_Mat(String apellido_Mat){
		this.apellido_Mat=apellido_Mat;
	}
	public String getApellido_Mat(){
		return this.apellido_Mat;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento){
		this.fecha_Nacimiento=fecha_Nacimiento;
	}
	public String getFecha_Nacimiento(){
		return fecha_Nacimiento;
	}

	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	public int getTelefono(){
		return telefono;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}
	public String getCorreo(){
		return correo;
	}


    public void mostrarDatos(){
        System.out.println("Clase Persona: ");
        System.out.println(this.getNombre());
        System.out.println(this.getApellido_Pat());
        System.out.println(this.getApellido_Mat());
        System.out.println(this.getFecha_Nacimiento());
        System.out.println(this.getTelefono());
        System.out.println(this.getCorreo());
    }
    






}
