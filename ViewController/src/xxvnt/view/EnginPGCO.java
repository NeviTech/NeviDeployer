package xxvnt.view;

import java.util.ArrayList;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.model.binding.DCDataControl;

import xxnvt.model.NeviDeployerAMImpl;

import java.util.List;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlActionBinding;
import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierBinding;
import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.AttributeBinding;
import oracle.binding.ControlBinding;
import oracle.binding.OperationBinding;

import xxnvt.model.dbobjects.DbObject;
import xxnvt.model.dbobjects.DbObjectTbl;

public class EnginPGCO {
    public EnginPGCO() {
    }

    public String ButtonClick() {
        BindingContext bindingContext   = BindingContext.getCurrent();
        
        
        
        DCDataControl dc                = bindingContext.findDataControl("NeviDeployerAMDataControl");
        NeviDeployerAMImpl ndAM         = (NeviDeployerAMImpl)dc.getDataProvider();
        
        DataControlFrame dc3            = bindingContext.findDataControlFrame(bindingContext.getCurrentDataControlFrame());
        DCDataControl dc2               = dc3.findDataControl("DbObjectTbl");
        //DCDataControl dc2               = bindingContext.findDataControl("DbObjectTbl");
        DbObjectTbl dbObjTbl            = (DbObjectTbl)dc2.getDataProvider();
                                                                                 
        //NeviDeployerAMImpl x = (NeviDeployerAMImpl)dc.getDataProvider();;
        dbObjTbl = ndAM.initializeDbList(dbObjTbl);
        //DbObject x = new DbObject();
        //x.setOwner("Engin");
        //x.setObjectName("ÖZER");
        //dbObjTbl.getDbObjects().add(x);
        BindingContext bc = BindingContext.getCurrent();
        /*List operatingBindings = bc.getCurrentBindingsEntry().getOperationBindings();
        int length = operatingBindings.size();
        for(int i = 0;
            i < length;
            i++)
        {
            OperationBinding currentBinding = (OperationBinding)operatingBindings.get(i);
            String bindingName = currentBinding.getName();
            String dsa = new String();
            currentBinding.execute();
        }
        
        List attrBindings = bc.getCurrentBindingsEntry().getAttributeBindings();
        length = attrBindings.size();
        for(int i = 0;
            i < length;
            i++)
        {
            AttributeBinding currentBinding = (AttributeBinding)attrBindings.get(i);
            String bindingName = currentBinding.getName();
            String dsa = new String();
        }*/
        
        List contBindings = bc.getCurrentBindingsEntry().getControlBindings();
        FacesCtrlHierBinding dsag = (FacesCtrlHierBinding)bc.getCurrentBindingsEntry().getControlBinding("DbObject");
        dsag.executeQuery();
        /*int length = contBindings.size();
        for(int i = 0;
            i < length;
            i++)
        {
            
            if(contBindings.get(i).getClass().getName().equals("ControlBinding"))
            {
                ControlBinding currentBinding;
                currentBinding = (ControlBinding)contBindings.get(i);
                String bindingName = currentBinding.getName();
                String abc = new String();
            }
            else if(contBindings.get(i).getClass().getName().equals("oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding"))
            {
                FacesCtrlHierNodeBinding currentBinding;
                currentBinding = (FacesCtrlHierNodeBinding)contBindings.get(i);
                String bindingName = currentBinding.getName();
                String abc = new String();
            }
            if(contBindings.get(i).getClass().getName().equals("oracle.adfinternal.view.faces.model.binding.FacesCtrlHierBinding"))
            {
                FacesCtrlHierBinding currentBinding;
                currentBinding = (FacesCtrlHierBinding)contBindings.get(i);
                String bindingName = currentBinding.getName();
                currentBinding.executeQuery();
                String abc = new String();
            }
            /*else if(contBindings.get(i).getClass().getName().equals("oracle.adfinternal.view.faces.model.binding.FacesCtrlActionBinding"))
            {
                FacesCtrlActionBinding currentBinding;
                currentBinding = (FacesCtrlActionBinding)contBindings.get(i);
                String bindingName = currentBinding.getName();
                currentBinding.execute();
                String abc = new String();
            }
            String dsa = new String();
        }*/
        
        return new String();
    }
    
    /*public DbObjectTbl getObjTable()
    {
        
        BindingContext bindingContext   = BindingContext.getCurrent();       
        
        DataControlFrame dc3            = bindingContext.findDataControlFrame(bindingContext.getCurrentDataControlFrame());
        DCDataControl dc2               = dc3.findDataControl("DbObjectTbl");
        DbObjectTbl dbObjTbl = (DbObjectTbl)dc2.getDataProvider();
        
        return dbObjTbl;

    }*/
    
}
