
package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class History_array {

    public ArrayList histories;
    public ArrayList getArray1(){
        
        return histories;
    }
    public History_array() {
        histories = new ArrayList();
        histroy h = new histroy();
        h.setId("1");
        h.setCollege_name("Brindavan College");
        h.setUniversity("VTU");
        h.setLocation("Banglore");
        h.setCourse("B.Tech");
        h.setBranch("Electronics");
        histories.add(h);
         histroy h1 = new histroy();
        h1.setId("2");
        h1.setCollege_name("Garden City College");
        h1.setUniversity("VTU");
        h1.setLocation("Banglore");
        h1.setCourse("M.Tech");
        h1.setBranch("Computer Science");
        histories.add(h1);
        
    }
    
}
