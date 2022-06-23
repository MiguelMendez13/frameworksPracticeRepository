package com.example.primerApp.clases;
public class TurnoPaciente {
   int idTurno;
   int idPaciente;
   int idMedico;
   

    public TurnoPaciente() {
    }

    public TurnoPaciente(int idTurno, int idPaciente, int idMedico) {
        this.idTurno = idTurno;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getIdTurno() {
        return this.idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
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
