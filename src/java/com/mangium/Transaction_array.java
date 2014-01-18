/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class Transaction_array {

      public ArrayList transaction;
    public ArrayList getArray(){
        return transaction;
    }
    public Transaction_array() {
        transaction = new ArrayList();
        Transaction t = new Transaction();
        t.setTx_id("1");
        t.setTime("08:30 AM");
        t.setTx_college("Brindavan College");
        t.setTx_course("M.Tech");
        t.setTx_amonut("1000");
        t.setTx_status("Confirmed");
        t.setSource("Visa");
         t.setTx_date("10-12-2013");
        transaction.add(t);
        Transaction t1 = new Transaction();
        t1.setTx_id("2");
          t1.setTime("08:30 AM");
        t1.setTx_college("Garden City College");
        t1.setTx_course("B.Com");
        t1.setTx_amonut("1000");
        t1.setTx_status("Pending");
        t1.setSource("Paypal");
        t1.setTx_date("10-12-2013");
        transaction.add(t1);
         Transaction t2 = new Transaction();
        t2.setTx_id("2");
        t2.setTime("13-12-2013");
        t2.setTx_college("CMR College");
        t2.setTx_course("B.Tech");
        t2.setTx_amonut("2,00,000");
        t2.setTx_status("Full Time");
        transaction.add(t2);
    }
    
}
