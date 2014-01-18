

package com.mangium;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;


@ManagedBean
@RequestScoped
public class DataModel extends ListDataModel<DataTable> implements SelectableDataModel<DataTable>  {

   
    public DataModel() {
    }

    @Override
    public Object getRowKey(DataTable t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataTable getRowData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
