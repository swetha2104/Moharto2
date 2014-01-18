

package com.mangium;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
@RequestScoped
public class Bean1 {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 public void savePerson(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + name + " " + "!"));  
    }  
    
}
