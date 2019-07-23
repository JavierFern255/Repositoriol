/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.util;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Datos implements Serializable {
     private String uid;
    //publicidad
    private String nombre;
    private String password;
    //total alquileres hoteles y restaurantes
    private String cedula;
    private String correo;
    private String tipo;
    private String estado ;
    //total alquileres servicios
     private String alser;
    private String curso;
    private String colegio;
    private String numero;
    //total fondo de reserva hombres hoteles y servicio
    private String fonhomregion;
    private String fonhomhotel;
    private String fonhomtotalr;
    private String fonhomreservar;
    //total fonde de reserva hombres servicios
    private String fonhomservicio;
    private String fonhomtotals;
    private String fonhomreservas;
    //total fondo de reserva mujeres hoteles y servicio
    private String fonmujhotel;
    private String fonmujtotalr;
    private String fonmujreservar;
    //total fondo de reserva mujeres servicio
    private String fonmujserv;
    private String fonmujtotals;
    private String fonmujreservas;
    //total hombres
    private String hombrepro;
    private String hombreser;
    private String hombretotal;
    //total mujeres
    private String mujerpro;
    private String mujerser;
    private String mujertotal;
    //remun
    private String remunser;
    private String remunpro;
    private String remuntotal;

    public String getFonhomregion() {
        return fonhomregion;
    }

    public void setFonhomregion(String fonhomregion) {
        this.fonhomregion = fonhomregion;
    }

    public String getFonhomhotel() {
        return fonhomhotel;
    }

    public void setFonhomhotel(String fonhomhotel) {
        this.fonhomhotel = fonhomhotel;
    }

    public String getFonhomtotalr() {
        return fonhomtotalr;
    }

    public void setFonhomtotalr(String fonhomtotalr) {
        this.fonhomtotalr = fonhomtotalr;
    }

    public String getFonhomreservar() {
        return fonhomreservar;
    }

    public void setFonhomreservar(String fonhomreservar) {
        this.fonhomreservar = fonhomreservar;
    }

    public String getFonhomservicio() {
        return fonhomservicio;
    }

    public void setFonhomservicio(String fonhomservicio) {
        this.fonhomservicio = fonhomservicio;
    }

    public String getFonhomtotals() {
        return fonhomtotals;
    }

    public void setFonhomtotals(String fonhomtotals) {
        this.fonhomtotals = fonhomtotals;
    }

    public String getFonhomreservas() {
        return fonhomreservas;
    }

    public void setFonhomreservas(String fonhomreservas) {
        this.fonhomreservas = fonhomreservas;
    }

    public String getFonmujhotel() {
        return fonmujhotel;
    }

    public void setFonmujhotel(String fonmujhotel) {
        this.fonmujhotel = fonmujhotel;
    }

    public String getFonmujtotalr() {
        return fonmujtotalr;
    }

    public void setFonmujtotalr(String fonmujtotalr) {
        this.fonmujtotalr = fonmujtotalr;
    }

    public String getFonmujreservar() {
        return fonmujreservar;
    }

    public void setFonmujreservar(String fonmujreservar) {
        this.fonmujreservar = fonmujreservar;
    }

    public String getFonmujserv() {
        return fonmujserv;
    }

    public void setFonmujserv(String fonmujserv) {
        this.fonmujserv = fonmujserv;
    }

    public String getFonmujtotals() {
        return fonmujtotals;
    }

    public void setFonmujtotals(String fonmujtotals) {
        this.fonmujtotals = fonmujtotals;
    }

    public String getFonmujreservas() {
        return fonmujreservas;
    }

    public void setFonmujreservas(String fonmujreservas) {
        this.fonmujreservas = fonmujreservas;
    }

    public String getHombrepro() {
        return hombrepro;
    }

    public void setHombrepro(String hombrepro) {
        this.hombrepro = hombrepro;
    }

    public String getHombreser() {
        return hombreser;
    }

    public void setHombreser(String hombreser) {
        this.hombreser = hombreser;
    }

    public String getHombretotal() {
        return hombretotal;
    }

    public void setHombretotal(String hombretotal) {
        this.hombretotal = hombretotal;
    }

    public String getMujerpro() {
        return mujerpro;
    }

    public void setMujerpro(String mujerpro) {
        this.mujerpro = mujerpro;
    }

    public String getMujerser() {
        return mujerser;
    }

    public void setMujerser(String mujerser) {
        this.mujerser = mujerser;
    }

    public String getMujertotal() {
        return mujertotal;
    }

    public void setMujertotal(String mujertotal) {
        this.mujertotal = mujertotal;
    }

    public String getRemunser() {
        return remunser;
    }

    public void setRemunser(String remunser) {
        this.remunser = remunser;
    }

    public String getRemunpro() {
        return remunpro;
    }

    public void setRemunpro(String remunpro) {
        this.remunpro = remunpro;
    }

    public String getRemuntotal() {
        return remuntotal;
    }

    public void setRemuntotal(String remuntotal) {
        this.remuntotal = remuntotal;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
 
    public String getAlser() {
        return alser;
    }

    public void setAlser(String alser) {
        this.alser = alser;
    }
    @Override
    public String toString() {
        return "Datos{" + "nombre=" + nombre + ", password=" + password + ", cedula=" + cedula + ", correo=" + correo + ", tipo=" + tipo + ", estado=" + estado + ", uid=" + uid + ", curso=" + curso + ", colegio=" + colegio + ", numero=" + numero + '}';
    }

   
   
}
