/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.dao;

import com.journaldev.jsf.util.Datos;
import java.util.ArrayList;
import com.journaldev.jsf.dao.LoginDAO;
import com.journaldev.jsf.util.DataConnect;
import com.journaldev.jsf.util.Pregunta;
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
 * @author USER
 */
public class DatosDAO {
  
    public ArrayList<Datos> damedatos() throws SQLException{
    ArrayList<Datos> list=new ArrayList<>();
   
        DataConnect cn=new DataConnect();
        Connection con = null;
                        PreparedStatement ps = null;
                        con = DataConnect.getConnection();
			ps = con.prepareStatement("SELECT * FROM users");
			
			ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            Datos d=new Datos();
                        
                            
                           d.setUid(rs.getString("uid"));
                           d.setNombre(rs.getString("uname"));
                           d.setPassword(rs.getString("password"));
                           d.setTipo(rs.getString("u_tipo"));
                           d.setEstado(rs.getString("u_estado"));
                           list.add(d);
                        }
        
        
         return list;
    };
    
    
    public ArrayList<Pregunta> damepreguntas(){
        ArrayList<Pregunta> preg=new ArrayList<>();
        
        
        
        
        
        
        return preg;
        
      
        
    }
    
    
    
}
