

package imagenesotros;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class FileFondodereserva {
     
    private StreamedContent file;
    
    //remuneraciones
    public FileFondodereserva() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/image/fondore.JPG");
        file = new DefaultStreamedContent(stream, "image/JPG", "fondore.JPG");
    }
 
    public StreamedContent getFile() {
        return file;
    }
    }