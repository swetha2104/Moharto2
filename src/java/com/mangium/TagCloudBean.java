/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudItem;
import org.primefaces.model.tagcloud.TagCloudModel;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class TagCloudBean {
 private TagCloudModel model;  
      
    public TagCloudBean() {  
        model = new DefaultTagCloudModel();  
        model.addTag(new DefaultTagCloudItem("Anna university","http://www.annauniv.edu/", 1));  
        model.addTag(new DefaultTagCloudItem("visvesvaraya University", "http://www.vtu.ac.in/", 3));  
        model.addTag(new DefaultTagCloudItem("Amity University","http://www.amity.edu/india/", 5));  
        model.addTag(new DefaultTagCloudItem("Manipal University", "http://www.manipal.edu/pages/welcome.aspx", 5));  
        model.addTag(new DefaultTagCloudItem("Annamalai University","http://annamalaiuniversity.ac.in/cse/index.php", 4));  
        model.addTag(new DefaultTagCloudItem("images/iis.jpg", "http://www.icfaiuniversity.in/index.html", 2));  
//        model.addTag(new DefaultTagCloudItem("FCB", 5));  
//        model.addTag(new DefaultTagCloudItem("Mobile",  3));  
//        model.addTag(new DefaultTagCloudItem("Themes", "/ui/tagCloud.jsf", 4));  
//        model.addTag(new DefaultTagCloudItem("Rocks", "/ui/tagCloud.jsf", 1));  
//       model.addTag(new DefaultTagCloudItem("College1", "/ui/tagCloud.jsf", 1));
    }  
  
    public TagCloudModel getModel() {  
        return model;  
    }  
      
    public void onSelect(SelectEvent event) {  
        TagCloudItem item = (TagCloudItem) event.getObject();  
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", item.getLabel());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
}
