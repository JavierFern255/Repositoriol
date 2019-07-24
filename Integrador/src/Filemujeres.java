package imagenesotros;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class Filemujeres {
     
    private StreamedContent file;
    
    //remuneraciones
    public Filemujeres() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/image/mujeres.JPG");
        file = new DefaultStreamedContent(stream, "image/JPG", "mujeres.JPG");
    }
 
    public StreamedContent getFile() {
        return file;
    }
    
    
    
    
    
}

