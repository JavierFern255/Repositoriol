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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

@Named(value = "datospubli")
@SessionScoped


public class Datosalquiler implements Serializable {
    private ArrayList<Datos> vec = null;
    private Datos data = new Datos();
    /****************Total Alquileres por Servicio************/
    public ArrayList<Datos> getAlquileresServ() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from alquiler");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonmujhotel(rs.getString("des_wregion"));
            d.setFonmujreservar(rs.getString("des_wgruenc"));
            d.setFonmujreservas(rs.getString("totalalquiler"));
            
           
            vec.add(d);

        }}
        return vec;
    }

   
    
}
