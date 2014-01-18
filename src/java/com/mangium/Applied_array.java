

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Applied_array {
   public ArrayList appliedcollege;
    public ArrayList getarray(){
        return appliedcollege;
    }
   
    public Applied_array() {
        appliedcollege = new ArrayList();
        Applied a = new Applied();
        a.setCollege_name("Brindavan College");
        a.setCourse_name("M.Tech");
        a.setCourse_fee("4,00,000");
        a.setSeat_status("Full Time");
        appliedcollege.add(a);
        Applied a1 = new Applied();
        a1.setCollege_name("Garden City College");
        a1.setCourse_name("B.Com");
        a1.setCourse_fee("1,00,000");
        a1.setSeat_status("Part Time");
          appliedcollege.add(a1);
        Applied a2 = new Applied();
        a2.setCollege_name("CMR College");
        a2.setCourse_name("B.Tech");
        a2.setCourse_fee("3,00,000");
        a2.setSeat_status("Full Time");
          appliedcollege.add(a2);
                
    }
    
}
