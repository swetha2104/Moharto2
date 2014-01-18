package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CollegeBean {
    
    private ArrayList college;

    public ArrayList getCollege() {
        
        college =  new ArrayList();
        
        college c1 =  new college();
        c1.setCollegelogo("Brindavan.png");
        c1.setCollegename("BRINDAVAN COLLEGE OF ENGINEERING");
        c1.setAffiliated("(VTU Banaglore, Full time)");
        c1.setFee("4,75,000");
        c1.setPlacement("100% placements");
        c1.setP1("The biggest in Asia having five star accrediation   by NAAC");
        c1.setP2("");
        c1.setP3("It has over 1400 students from 46 overseas countires ");
        c1.setSeats("25");
        college.add(c1);
        
   
        return college;
    }
}
