package com.example.primerApp.clases;
public class Pago {
    int idPago;
    String concepto;
    String fecha;
    float monto;
    String estado;
    String observacion;


    public Pago() {
    }

    public Pago(int idPago, String concepto, String fecha, float monto, String estado, String observacion) {
        this.idPago = idPago;
        this.concepto = concepto;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
        this.observacion = observacion;
    }

    public int getIdPago() {
        return this.idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getConcepto() {
        return this.concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return this.monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
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
