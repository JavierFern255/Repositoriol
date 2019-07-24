package imagenesotros;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class FilePublicidad {
     
    private StreamedContent file;
    
    //remuneraciones
    public FilePublicidad() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/image/publcidadtotal.JPG");
        file = new DefaultStreamedContent(stream, "image/JPG", "publcidadtotal.JPG");
    }
 
    public StreamedContent getFile() {
        return file;
    }
    
    
    
    
    
}
