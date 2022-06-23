package com.example.primerApp.clases;
public class HistoriaPaciente {
    int idHistoria;
    int idPaciente;
    int idMedico;



    public HistoriaPaciente() {
    }

    public HistoriaPaciente(int idHistoria, int idPaciente, int idMedico) {
        this.idHistoria = idHistoria;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getIdHistoria() {
        return this.idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
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
