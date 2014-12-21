package beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class User implements Serializable {
    private static final long serialVersionUID = 4629817047379532658L;
    private static final String INFO_MESSAGE = "Operation is done ...";
        
    private String name;
    
    @Inject
    FacesContext facesContext;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet() {
        facesContext.addMessage("form1", new FacesMessage(FacesMessage.SEVERITY_INFO, INFO_MESSAGE, INFO_MESSAGE));
        
        return null;
    }
}