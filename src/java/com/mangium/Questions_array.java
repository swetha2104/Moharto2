

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Questions_array {
 public ArrayList questions;
    public ArrayList getarray(){
        return questions;
    }
    
    public Questions_array() {
        questions = new ArrayList();
        Questions q = new Questions();
        q.setQuestion("How and when should I begin my admission application?");
        q.setAnswer("You should begin reviewing Princeton's application requirements and materials after the spring of your junior year and "
                + "plan on beginning your application in the summer before or during the fall of your senior year. "
                + "The online Common Application and Princeton's writing supplement to the Common Application are available mid-August, "
                + "as are the Universal College Application and "
                + "the Princeton Supplement to the Universal College Application (online or in PDF form). Learn more about applying for admission.");
        q.setStatus("Answered");
        q.setTime("18-12-2013");
        questions.add(q);
          Questions q1 = new Questions();
          q1.setQuestion("When are applications due?");
          q1.setAnswer("");
          q1.setStatus("Not Answered");
          q1.setTime("");
          questions.add(q1);
              Questions q2 = new Questions();
              q2.setQuestion("How and when do I apply for financial aid?");
              q2.setAnswer("You should apply for financial aid by Feb. 1 of the year you plan to enter college, "
                      + "or you may submit your application by November if you are applying for early action."
                      + " To learn more, review the information and instructions for applying for aid.");
              q2.setStatus("Answered");
              q2.setTime("13-12-2013");
               questions.add(q2);
          
    }
    
}
