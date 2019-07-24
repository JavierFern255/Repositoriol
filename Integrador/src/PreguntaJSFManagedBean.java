/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.beans;

import com.journaldev.jsf.dao.DatosDAO;
import com.journaldev.jsf.util.DataConnect;
import com.journaldev.jsf.util.Datos;
import com.journaldev.jsf.util.Pregunta;
import com.journaldev.jsf.util.SessionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USER
 */
@Named(value = "preguntaJSFManagedBean")
@RequestScoped
public class PreguntaJSFManagedBean {
     private ArrayList<Pregunta> vecp = null;
    private Pregunta preg = new Pregunta();
    
     public ArrayList<Pregunta> getVecp() throws SQLException {

        vecp = new ArrayList<>();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("SELECT id_pregunta,descripcion_pregunta,nombre_encuesta,tipo_pregunta FROM pregunta,encuesta,tipo_pregunta where tipo_pregunta.id_tipo_pregunta=pregunta.id_tipo_pregunta and pregunta.id_encuesta=encuesta.id_encuesta");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           Pregunta d = new Pregunta();
           d.setId_preg(rs.getString("id_pregunta"));
            d.setPregunta(rs.getString("descripcion_pregunta"));
            d.setTipo(rs.getString("tipo_pregunta"));
            d.setEncuesta(rs.getString("nombre_encuesta"));

            vecp.add(d);

        }
        return vecp;
    }

    public Pregunta getPreg() {
        return preg;
    }

    public void setPreg(Pregunta preg) {
        this.preg = preg;
    }
public void insertaPre() {
    System.out.println("INSERT INTO public.pregunta(\n" +
"	 descripcion_pregunta, id_encuesta, id_tipo_pregunta)\n" +
"	VALUES ('"+ preg.getPregunta() + "'," + 1 + "," +1 + "')");
        
         HttpSession session = SessionUtils.getSession();

        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO public.pregunta(\n" +
"	 descripcion_pregunta, id_encuesta, id_tipo_pregunta)\n" +
"	VALUES ('"+ preg.getPregunta() + "'," + 1 + "," +1 + ")");

          
            
            
            ps.executeUpdate();
            System.out.println("se ha ingresado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

   

    /**
     * Creates a new instance of PreguntaJSFManagedBean
     */
    public PreguntaJSFManagedBean() {
    }
    
}
