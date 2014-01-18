

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class TestimonialBean {
 public ArrayList test;
 public ArrayList getClient(){
     return test;
 }
   
    public TestimonialBean() {
        test = new ArrayList();
        Testimonial t = new Testimonial();
        t.setName("Swathi");
        t.setCollege("R.V College");
        test.add(t);
        Testimonial t1 = new Testimonial();
        t1.setName("Prateeksha");
        t1.setCollege("M.S.Rahamaiha College");
        test.add(t1);
    }
    
}
