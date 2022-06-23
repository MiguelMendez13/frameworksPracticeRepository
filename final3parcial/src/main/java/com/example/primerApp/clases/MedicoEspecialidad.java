package com.example.primerApp.clases;
public class MedicoEspecialidad {
    int idMedico;
    int idEspecialidad;


    public MedicoEspecialidad() {
    }

    public MedicoEspecialidad(int idMedico, int idEspecialidad) {
        this.idMedico = idMedico;
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdEspecialidad() {
        return this.idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }



}
