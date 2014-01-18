

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class DataTableBean {

    
  
    public ArrayList special;
   
    public ArrayList getSpecial(){
        return special;
    }

   
    
    public DataTableBean() {
       special = new ArrayList();  
       DataTable d = new DataTable();
       d.setSpecialization("finance");
       special.add(d);
        DataTable d1 = new DataTable();
       d1.setSpecialization("HR");
       special.add(d1);
        DataTable d2 = new DataTable();
       d2.setSpecialization("marketing");
       special.add(d2);
               
        
    }
    
}
