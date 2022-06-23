package com.example.primerApp.clases;
public class HistoriaClinica {
    int idHistoria;
    String fechaHistoria;
    String observacion;
    int idPaciente;
    int idMedico;


    public HistoriaClinica() {
    }

    public HistoriaClinica(int idHistoria, String fechaHistoria, String observacion, int idPaciente, int idMedico) {
        this.idHistoria = idHistoria;
        this.fechaHistoria = fechaHistoria;
        this.observacion = observacion;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getIdHistoria() {
        return this.idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getFechaHistoria() {
        return this.fechaHistoria;
    }

    public void setFechaHistoria(String fechaHistoria) {
        this.fechaHistoria = fechaHistoria;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }


}
