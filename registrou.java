package conexion;

import sesiones.SessionUtils;
import sesiones.dataconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anthony
 */
@Named(value = "registroMB")
@SessionScoped
public class registrou {

    /**
     * Creates a new instance of RegistroManagedBean
     */
    
    private String nombre;
    private String password;
     private String cedula;
    private String correo;
    
  
    
    private String casabiertagustomas1="";
    
    private ArrayList vec = new ArrayList();

  
    
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
                        con = dataconect.getConnection();
			ps = con.prepareStatement("INSERT INTO public.usuario(\n" +
"nombre_usuario, cedula_usuario, correo_usuario, clave_usuario, id_tipo, estado) VALUES ('"+nombre+"','"+cedula+"','"+correo+"','"+password+"','"+1+"','"+1+"'"+")");
                        
			ps.executeUpdate();
                      
                        
			return "admin";
		
			
		
	}
    
   
   /* public void consul() throws SQLException{
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
    }*/
}

