
package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ImageSwitchBean {

    private List<String> images;  
  
    public ImageSwitchBean() {  
        images = new ArrayList<String>();  
        images.add("col3.png");  
        images.add("banner9.jpg");  
       
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
    
}
