
package sesiones;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import sesiones.dataconect;
import sesiones.SessionUtils;
import conexion.LoginDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named(value = "consultab")
@ViewScoped

public class consulta implements Serializable {
    private static final long serialVersionUID = 1094801825228386363L;
	private consulta cons = new consulta();
    private int codprovincia;
    private String descrippro;
    private int codreg;
    private String descripreg;
    private int totalmuj;
    private int totalhomb;
    private int publi;
    private int totalq;
    private int totalremun;
    private int fondoreser;
    private int codtipof;
    private String tipof;
    
     public int getCodprovincia() {
        return codprovincia;
    }

    public void setCodprovincia(int codprovincia) {
        this.codprovincia=codprovincia;
    }

    public String getDescrippro() {
        return descrippro;
    }

    public void setDescrippro(String descrippro) {
        this.descrippro=descrippro;
    }

    public int getCodreg() {
        return codreg;
    }

    public void setCodreg(int codreg) {
        this.codreg = codreg;
    }
    

    public String getDescripreg() {
        return descripreg;
    }

    public void setDescripreg(String descripreg) {
        this.descripreg=descripreg;
    }

    
    public int getTotalmuj() {
        return totalmuj;
    }

    public void setTotalmuj(int totalmuj) {
        this.totalmuj=totalmuj;
    }

    public int getTotalhomb() {
        return totalhomb;
    }

    public void setTotalhomb(int totalhomb) {
        this.totalhomb=totalhomb;
    }

    public int getTotalq() {
        return totalq;
    }

    public void setTotalq(int totalq) {
        this.totalq=totalq;
    }
    
    public int getFondoreser() {
        return fondoreser;
    }

    public void setFondoreser(int fondoreser) {
        this.fondoreser=fondoreser;
    }

    public int getCodtipof() {
        return codtipof;
    }

    public void setCodtipof(int codtipof) {
        this.codtipof=codtipof;
    }

    public String getTipof() {
        return tipof;
    }

    public void setTipof(String tipof) {
        this.tipof=tipof;
    }

    
    private ArrayList<consulta> vec = null;
   

    public ArrayList<consulta> getTotlmuj() throws SQLException {
        if(vec==null){

        vec = new ArrayList<>();
        
        dataconect cn = new dataconect();
        Connection con = null;
        PreparedStatement ps = null;
        con = cn.getConnection();
        ps = con.prepareStatement("SELECT * FROM edificaciones");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            consulta data = new consulta();
            data.setTotalmuj(rs.getInt("etotalmuj"));
            data.setDescrippro(rs.getString("des_prov"));
            data.setDescripreg(rs.getString("des_wregion"));
            data.setTipof(rs.getString("des_wgruenc"));
       
            vec.add(data);

        }}
        return vec;
    }
    
    
     public consulta() {
    }

    public consulta getData() {
        return cons;
    }

    public void setData(consulta cons) {
        this.cons = cons;
    }

   

    
    
}
