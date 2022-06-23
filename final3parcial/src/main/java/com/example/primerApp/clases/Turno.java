package com.example.primerApp.clases;
public class Turno {
    int idTurno;
    String fechaTurno;
    String estado;
    String observacion;



    public Turno() {
    }

    public Turno(int idTurno, String fechaTurno, String estado, String observacion) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.estado = estado;
        this.observacion = observacion;
    }

    public int getIdTurno() {
        return this.idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getFechaTurno() {
        return this.fechaTurno;
    }

    public void setFechaTurno(String fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


}
