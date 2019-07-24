/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenesotros;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class Filealquiler {
     
    private StreamedContent file;
    
    //remuneraciones
    public Filealquiler() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/image/alquiler.JPG");
        file = new DefaultStreamedContent(stream, "image/JPG", "alquiler.JPG");
    }
 
    public StreamedContent getFile() {
        return file;
    }
    
    
    
    
    
}

