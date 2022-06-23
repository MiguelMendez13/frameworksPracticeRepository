package com.example.primerApp.clases;
public class Paciente {
    int idPaciente;
    String nombre;
    String apellidos;
    String fNacimiento;
    String domicilio;
    int idPais;
    String telefono;
    String email;
    String observacion;



    public Paciente() {
    }

    public Paciente(int idPaciente, String nombre, String apellidos, String fNacimiento, String domicilio, int idPais, String telefono, String email, String observacion) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
        this.domicilio = domicilio;
        this.idPais = idPais;
        this.telefono = telefono;
        this.email = email;
        this.observacion = observacion;
    }

    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFNacimiento() {
        return this.fNacimiento;
    }

    public void setFNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getIdPais() {
        return this.idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


}
