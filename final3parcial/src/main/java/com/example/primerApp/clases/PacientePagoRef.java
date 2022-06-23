package com.example.primerApp.clases;
public class PacientePagoRef {
    int idPago;
    int idPaciente;
    int idTurno;


    public PacientePagoRef() {
    }

    public PacientePagoRef(int idPago, int idPaciente, int idTurno) {
        this.idPago = idPago;
        this.idPaciente = idPaciente;
        this.idTurno = idTurno;
    }

    public int getIdPago() {
        return this.idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTurno() {
        return this.idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }




}
