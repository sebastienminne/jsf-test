import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@ManagedBean
@ViewScoped
public class AjaxBean implements Serializable {
    private static final Logger logger =
            Logger.getLogger(AjaxBean.class.getName());
    private int request_number = 1;
    public int getRequest_number() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        logger.log(Level.INFO, "Is postback (getRequest_number method): {0}",
                facesContext.isPostback());
        return request_number;
    }
    public void setRequest_number(int request_number) {
        this.request_number = request_number;
    }
    public void requestAction(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        logger.log(Level.INFO, "Is postback (requestAction method): {0}",
                facesContext.isPostback());
        request_number ++;
    }
}