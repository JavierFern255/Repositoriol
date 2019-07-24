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

/**
 *
 * @author USER
 */
@Named(value = "datosManagedBean")
@SessionScoped
public class DatosManagedBean implements Serializable {

    private ArrayList<Datos> vec = null;
    private Datos data = new Datos();

    public ArrayList<Datos> getVec() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from mujeres");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setNumero(rs.getString("etotalmuj"));
            d.setNombre(rs.getString("des_prov"));
            d.setCedula(rs.getString("des_wgruenc"));
           

            vec.add(d);

        }}
        return vec;
    }
    
    /*----------------Publicidad----------------*/
    public ArrayList<Datos> getPublicidad() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from publicidad");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setFonhomservicio(rs.getString("des_wgruenc"));
            d.setFonhomtotals(rs.getString("sum"));

            vec.add(d);

        }}
        return vec;
    }
    /****************Total Alquileres por Servicio************/
    public ArrayList<Datos> getAlquileresServ() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from talquilerser");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setNumero(rs.getString("wregion"));
            d.setNombre(rs.getString("des_wregion"));
            d.setCedula(rs.getString("des_wgruenc"));
            d.setCorreo(rs.getString("sum"));
           
           

            vec.add(d);

        }}
        return vec;
    }

    /****************Total Alquileres por Restaurant y Servicio************/
    public ArrayList<Datos> getAlquileresHotel() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from talquilerhs");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setColegio(rs.getString("wregion"));
            d.setEstado(rs.getString("des_wregion"));
            d.setPassword(rs.getString("des_wgruenc"));
            d.setTipo(rs.getString("sum"));
           
           

            vec.add(d);

        }}
        return vec;
    }
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
            d.setNumero(rs.getString("des_wregion"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("total_hombres"));
            d.setCorreo(rs.getString("total_fondo_reserva"));
           
           

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
            d.setNumero(rs.getString("des_wregion"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("total_hombres"));
            d.setCorreo(rs.getString("total_fondo_reserva"));
           
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
            d.setNumero(rs.getString("des_wregion"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("total_mujeres"));
            d.setCorreo(rs.getString("total_fondo_reserva"));
            vec.add(d);

        }}
        return vec;
    }
    /****************Total Fondos de Reserva Hoteles y Restaurantes por # hombres************/
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
            d.setNumero(rs.getString("des_wregion"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("total_mujeres"));
            d.setCorreo(rs.getString("total_fondo_reserva"));
            vec.add(d);

        }}
        return vec;
    }
    
    /****************Total Hombres por provincia************/
    public ArrayList<Datos> getTotalHombres() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalhombres");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setNumero(rs.getString("des_prov"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("sum"));
            vec.add(d);

        }}
        return vec;
    }
    
    /****************Total # mujeres por provincia************/
    public ArrayList<Datos> getTotalmujeres() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalmujeres");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setNumero(rs.getString("des_prov"));
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("sum"));
            vec.add(d);

        }}
        return vec;
    }
    /****************Total de Remuneraciones por provincia y por servicio************/
    public ArrayList<Datos> getRemuneraciones() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        DatosDAO dao = new DatosDAO();
        DataConnect cn = new DataConnect();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("select * from totalremun");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Datos d = new Datos();
            d.setNombre(rs.getString("des_wgruenc"));
            d.setCedula(rs.getString("des_prov"));
            d.setCorreo(rs.getString("sum"));
            vec.add(d);

        }}
        return vec;
    }
    
    
    
    
    
    
    
    
    /**
     * Creates a new instance of DatosManagedBean
     */
    public DatosManagedBean() {
    }

    public Datos getData() {
        return data;
    }

    public void setData(Datos data) {
        this.data = data;
    }

    public void imprimir() {
        System.out.println(data.getUid());
        String a = data.getUid();
        HttpSession session = SessionUtils.getSession();

        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        try {
            ps = con.prepareStatement("delete FROM usuario where id_usuario=" + a);
            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(DatosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        data = null;

    }

    public void update() {
        System.out.println(data.getUid());
        String n = data.getUid();
        

        try {
            HttpSession session = SessionUtils.getSession();
            System.out.println("estoy dentro 1");

            Connection con = null;
            PreparedStatement ps = null;
            con = DataConnect.getConnection();
            ps = con.prepareStatement("UPDATE usuario SET nombre_usuario='" + data.getNombre() + "',cedula_usuario='" + data.getCedula() + "',clave_usuario='"
                    + data.getPassword() + "',id_tipo=" + data.getTipo() + ",estado=" + data.getEstado() + " where id_usuario=" + n + ";");
            ps.executeUpdate();
            System.out.println("estoy dentro 2");

        } catch (SQLException ex) {
            Logger.getLogger(DatosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s = "UPDATE usuario SET nombre_usuario='" + data.getNombre() + "',cedula_usuario='" + data.getCedula() + "',clave_usuario='"
                + data.getPassword() + "',id_tipo=" + data.getTipo() + ",estado=" + data.getEstado() + " where id_usuario=" + n + ";";
        System.out.println(s);

        data = null;
        
    }

    public void insertaEncues() {
        System.out.println("INSERT INTO public.estudiante_colegio(\n"
                    + "	nombre_estudiante, curso_estudiante, telefono_estudiante, correo_estudiante, colegio_estudiante)\n"
                    + "	VALUES ('" + data.getNombre() + "','" + data.getCurso() + "','" + data.getNumero() + "','" + data.getCorreo() + "','" + data.getColegio() + "')");

        HttpSession session = SessionUtils.getSession();

        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO public.estudiante_colegio(\n"
                    + "nombre_estudiante, curso_estudiante, telefono_estudiante, correo_estudiante, colegio_estudiante)\n"
                    + "	VALUES ('"+ data.getNombre() + "','" + data.getCurso() + "','" + data.getNumero() + "','" + data.getCorreo() + "','" + data.getColegio() + "')");

            ps.executeUpdate();
            System.out.println("se ha ingresado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
