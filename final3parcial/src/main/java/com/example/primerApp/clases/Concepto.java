package com.example.primerApp.clases;
public class Concepto {
    int idConcepto;
    String descripcion;

    public Concepto() {
    }
    
    public Concepto(int idConcepto, String descripcion) {
        this.idConcepto = idConcepto;
        this.descripcion = descripcion;
    }

    public int getIdConcepto() {
        return this.idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}