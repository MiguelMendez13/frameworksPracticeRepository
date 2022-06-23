package com.example.primerApp.clases;
public class Medico {
    int idMedico;
    String nombreMedico;
    String apellidosMedico;



    public Medico() {
    }

    public Medico(int idMedico, String nombreMedico, String apellidosMedico) {
        this.idMedico = idMedico;
        this.nombreMedico = nombreMedico;
        this.apellidosMedico = apellidosMedico;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreMedico() {
        return this.nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidosMedico() {
        return this.apellidosMedico;
    }

    public void setApellidosMedico(String apellidosMedico) {
        this.apellidosMedico = apellidosMedico;
    }



}
