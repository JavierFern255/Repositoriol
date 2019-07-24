/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.util;

/**
 *
 * @author USER
 */
public class Pregunta {
    
    private String pregunta;
    private String tipo;
    private String encuesta;
    private String id_preg;

    public String getId_preg() {
        return id_preg;
    }

    public void setId_preg(String id_preg) {
        this.id_preg = id_preg;
    }

    public String getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(String encuesta) {
        this.encuesta = encuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "pregunta=" + pregunta + ", tipo=" + tipo + ", encuesta=" + encuesta + ", id_preg=" + id_preg + '}';
    }

    
}
