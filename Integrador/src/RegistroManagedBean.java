/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.beans;

import com.journaldev.jsf.dao.LoginDAO;
import com.journaldev.jsf.util.DataConnect;
import com.journaldev.jsf.util.SessionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anthony
 */
@Named(value = "registroMB")
@RequestScoped
public class RegistroManagedBean {

    /**
     * Creates a new instance of RegistroManagedBean
     */
    
    private String nombre;
    private String password;
     private String cedula;
    private String correo;
    private String tipo_u;
    private String estado_u="activo";
    private String uid1="";
    private String nombre1="";
    private String password1="";
    private String u_tipo1="";
    private String u_estado1="";
    private String casabiertagustomas="";
    private String casabiertagustomenos="";
    private String porquegusto="";
    private String porquegustomenos="";
    private String carreainteresmas="";
    private String cualessoninteres="";
    private String gustariamas="";
    private String eventoenteraste="";
    private String semanagus="";
    private String tegustariaes="";
    private String carreainteresmas01="";
    String h;

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
    
    private String casabiertagustomas1="";
    
    private ArrayList vec = new ArrayList();

    public String getCarreainteresmas01() {
        return carreainteresmas01;
    }

    public void setCarreainteresmas01(String carreainteresmas01) {
        this.carreainteresmas01 = carreainteresmas01;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTegustariaes() {
        return tegustariaes;
    }

    public void setTegustariaes(String tegustariaes) {
        this.tegustariaes = tegustariaes;
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

    public String getTipo_u() {
        return tipo_u;
    }

    public void setTipo_u(String tipo_u) {
        this.tipo_u = tipo_u;
    }

    public String getEstado_u() {
        return estado_u;
    }

    public void setEstado_u(String estado_u) {
        this.estado_u = estado_u;
    }

    public String getUid1() {
        return uid1;
    }

    public void setUid1(String uid1) {
        this.uid1 = uid1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getU_tipo1() {
        return u_tipo1;
    }

    public void setU_tipo1(String u_tipo1) {
        this.u_tipo1 = u_tipo1;
    }

    public String getU_estado1() {
        return u_estado1;
    }

    public void setU_estado1(String u_estado1) {
        this.u_estado1 = u_estado1;
    }

    public String getCasabiertagustomas() {
        return casabiertagustomas;
    }

    public void setCasabiertagustomas(String casabiertagustomas) {
        this.casabiertagustomas = casabiertagustomas;
    }

    public String getCasabiertagustomenos() {
        return casabiertagustomenos;
    }

    public void setCasabiertagustomenos(String casabiertagustomenos) {
        this.casabiertagustomenos = casabiertagustomenos;
    }

    public String getPorquegusto() {
        return porquegusto;
    }

    public void setPorquegusto(String porquegusto) {
        this.porquegusto = porquegusto;
    }

    public String getPorquegustomenos() {
        return porquegustomenos;
    }

    public void setPorquegustomenos(String porquegustomenos) {
        this.porquegustomenos = porquegustomenos;
    }

    public String getCarreainteresmas() {
        return carreainteresmas;
    }

    public void setCarreainteresmas(String carreainteresmas) {
        this.carreainteresmas = carreainteresmas;
    }

    public String getCualessoninteres() {
        return cualessoninteres;
    }

    public void setCualessoninteres(String cualessoninteres) {
        this.cualessoninteres = cualessoninteres;
    }

    public String getGustariamas() {
        return gustariamas;
    }

    public void setGustariamas(String gustariamas) {
        this.gustariamas = gustariamas;
    }

    public String getEventoenteraste() {
        return eventoenteraste;
    }

    public void setEventoenteraste(String eventoenteraste) {
        this.eventoenteraste = eventoenteraste;
    }

    public String getSemanagus() {
        return semanagus;
    }

    public void setSemanagus(String semanagus) {
        this.semanagus = semanagus;
    }

    public String getCasabiertagustomas1() {
        return casabiertagustomas1;
    }

    public void setCasabiertagustomas1(String casabiertagustomas1) {
        this.casabiertagustomas1 = casabiertagustomas1;
    }

    public ArrayList getVec() {
        return vec;
    }

    public void setVec(ArrayList vec) {
        this.vec = vec;
    }
    
  
     

    
    
    
    public String insertar() throws SQLException {
		
		
			HttpSession session = SessionUtils.getSession();
			
                        Connection con = null;
                        PreparedStatement ps = null;
                        con = DataConnect.getConnection();
			ps = con.prepareStatement("INSERT INTO public.usuario(\n" +
"nombre_usuario, cedula_usuario, correo_usuario, clave_usuario, id_tipo, estado) VALUES ('"+nombre+"','"+cedula+"','"+correo+"','"+password+"','"+1+"','"+1+"'"+")");
                        
			ps.executeUpdate();
                      
                        
			return "admin";
		
			
		
	}
    
    public String bloquear() throws SQLException {
		
		
			HttpSession session = SessionUtils.getSession();
			
                        Connection con = null;
                        PreparedStatement ps = null;
                        con = DataConnect.getConnection();
			ps = con.prepareStatement("UPDATE public.users SET u_estado='"+estado_u+"' where uid='"+uid1+"';");
			
			ps.executeUpdate();
                      
                        
			return "admin";
	}
    
      public String actualizarpas() throws SQLException {
		
		
			HttpSession session = SessionUtils.getSession();
			
                        Connection con = null;
                        PreparedStatement ps = null;
                        con = DataConnect.getConnection();
			ps = con.prepareStatement("UPDATE public.users SET password='"+password+"' where uid='"+uid1+"';");
			
			ps.executeUpdate();
                      
                        
			return "admin";
		
			
		
	}
    
    
    public String consultaU() throws SQLException {
       
       String tabla="";
			HttpSession session = SessionUtils.getSession();
                        System.out.println("estoy dentro-----------------");
			
                        Connection con = null;
                        PreparedStatement ps = null;
                        con = DataConnect.getConnection();
			ps = con.prepareStatement("SELECT tabla_aud,operacion_aud,valoranterior_aud F,valornuevo_aud,fecha_aud,usuario_aud from auditoria.tb_auditoria");
			
			ResultSet rs = ps.executeQuery();
                      
			while (rs.next()) {
                            
                           uid1=rs.getString("tabla_aud");
                           nombre1=rs.getString("operacion_aud");
                           password1=rs.getString("valoranterior_aud");
                           u_tipo1=rs.getString("valornuevo_aud");
                           u_estado1=rs.getString("fecha_aud");
                           h=rs.getString("usuario_aud");
                           
                           vec.add(nombre1);
                           
                            
                           tabla+= "| " + uid1 + " | " + nombre1 + " | " + password1 + " | " + u_tipo1
						+ " | " + u_estado1+ " |*****************************************************************************************";
                           System.out.println("yy "+tabla);
                           
			}
                       tabla+="";
                    
                        return tabla;    
                       
     }
    public void consul() throws SQLException{
        RegistroManagedBean r= new RegistroManagedBean();
        HttpSession session = SessionUtils.getSession();
        Connection con = null;
        PreparedStatement ps = null;
        con = DataConnect.getConnection();
        ps = con.prepareStatement("SELECT * FROM usuario");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            r.setNombre(rs.getString("id_usuario"));
            r.setEstado_u(rs.getString("nombre_usuario"));          
                        }
    }
}
