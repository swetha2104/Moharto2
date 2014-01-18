

package com.mangium;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Transaction {

  private String tx_id;
  private String time;
  private String tx_college;
  private String tx_course;
  private String tx_amonut;
  private String tx_status;
  private String tx_date;
  private String source;

    public String getTx_date() {
        return tx_date;
    }

    public void setTx_date(String tx_date) {
        this.tx_date = tx_date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
  

    public String getTx_id() {
        return tx_id;
    }

    public void setTx_id(String tx_id) {
        this.tx_id = tx_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTx_college() {
        return tx_college;
    }

    public void setTx_college(String tx_college) {
        this.tx_college = tx_college;
    }

    public String getTx_course() {
        return tx_course;
    }

    public void setTx_course(String tx_course) {
        this.tx_course = tx_course;
    }

    public String getTx_amonut() {
        return tx_amonut;
    }

    public void setTx_amonut(String tx_amonut) {
        this.tx_amonut = tx_amonut;
    }

    public String getTx_status() {
        return tx_status;
    }

    public void setTx_status(String tx_status) {
        this.tx_status = tx_status;
    }
  
    
}
