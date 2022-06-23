package com.example.primerApp;
public class Test{


	private String nombre;
	private String apellido_Pat;
	private String apellido_Mat;
	private String fecha_Nacimiento;

	private String telefono;
	private String correo;

	private String contrasena;
	private String tipo;

	private String delegacion;
	private String colonia;
	private String calle;
	private String numExt;
	private String numInt;


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_Pat() {
		return this.apellido_Pat;
	}

	public void setApellido_Pat(String apellido_Pat) {
		this.apellido_Pat = apellido_Pat;
	}

	public String getApellido_Mat() {
		return this.apellido_Mat;
	}

	public void setApellido_Mat(String apellido_Mat) {
		this.apellido_Mat = apellido_Mat;
	}

	public String getFecha_Nacimiento() {
		return this.fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDelegacion() {
		return this.delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumExt() {
		return this.numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return this.numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}




	/*public static void main(String[] args) {
		String nombre="Miguel";
		String apellido_Pat="Mendez";
		String apellido_Mat="Flores";
		String fecha_Nacimiento="31/01/2000";

		int telefono=5577;
		String correo="dnmiguel.friky@gmail.com";

        String contrasena="123";
        String tipo="debito";

	    String delegacion="la paz";
	    String colonia="la paz";
        String calle="la paz";
	    String numExt="69";
	    String numInt="4";




		Cuenta cuenta=new Cuenta(contrasena, tipo, nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,telefono,correo,"amex","sopa",200);
		Direccion persona=new Direccion( 
            delegacion,colonia,calle,numExt,numInt,
            nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,telefono,correo);

        cuenta.mostrarDatos();
        persona.mostrarDatos();
	}*/

}
