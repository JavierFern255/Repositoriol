package imagenesotros;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class Filehombres {
     
    private StreamedContent file;
    
    //remuneraciones
    public Filehombres() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/image/hombres.JPG");
        file = new DefaultStreamedContent(stream, "image/JPG", "hombres.JPG");
    }
 
    public StreamedContent getFile() {
        return file;
    }
    
    
    
    
    
}