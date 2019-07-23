/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.beans;

import com.journaldev.jsf.dao.DatosDAO;
import com.journaldev.jsf.util.DataConnect;
import com.journaldev.jsf.util.Datos;
import com.journaldev.jsf.util.SessionUtils;
import static java.awt.event.PaintEvent.UPDATE;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


@Named(value = "datosfondo")
@SessionScoped

public class datosfondoreser implements Serializable{
    
    private ArrayList<Datos> vec = null;
    private Datos data = new Datos();
    
    /****************Total Fondos de Reserva HotelesRestaurantes por # hombres************/
    public ArrayList<Datos> getFonSerHH() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalfondoreserhht");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonhomregion(rs.getString("des_wregion"));
            d.setFonhomhotel(rs.getString("des_wgruenc"));
            d.setFonhomtotalr(rs.getString("total_hombres"));
            d.setFonhomreservar(rs.getString("total_fondo_reserva"));
           
           

            vec.add(d);

        }}
        return vec;
    }
    /****************Total Fondos de Reserva Servicios por # hombres************/
    public ArrayList<Datos> getFonSerSH() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalfondoreserhs");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonhomregion(rs.getString("des_wregion"));
            d.setFonhomservicio(rs.getString("des_wgruenc"));
            d.setFonhomtotals(rs.getString("total_hombres"));
            d.setFonhomreservas(rs.getString("total_fondo_reserva"));
           
            vec.add(d);

        }}
        return vec;
    }
    /****************Total Fondos de Reserva Servicios por # mujeress************/
    public ArrayList<Datos> getFonSerSMujeres() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalfondoreserm");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonhomregion(rs.getString("des_wregion"));
            d.setFonmujserv(rs.getString("des_wgruenc"));
            d.setFonmujtotals(rs.getString("total_mujeres"));
            d.setFonmujreservas(rs.getString("total_fondo_reserva"));
            vec.add(d);

        }}
        return vec;
    }
    /****************Total Fondos de Reserva Hoteles y Restaurantes por # mujeres************/
    public ArrayList<Datos> getFonSerHRMujer() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalfondoresermhr");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonhomregion(rs.getString("des_wregion"));
            d.setFonmujhotel(rs.getString("des_wgruenc"));
            d.setFonhomtotalr(rs.getString("total_mujeres"));
            d.setFonmujreservar(rs.getString("total_fondo_reserva"));
            vec.add(d);

        }}
        return vec;
    }
    
    
}
