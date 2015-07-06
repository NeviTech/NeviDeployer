package xxnvt.model;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;

import oracle.jbo.server.DBTransaction;

import xxnvt.model.dbobjects.DbObjectSourceGetter;
import xxnvt.model.dbobjects.DbObjectTbl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 16 13:38:50 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NeviDeployerAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public NeviDeployerAMImpl() {
    }

    /**
     * Container's getter for DbObjectsVO1.
     * @return DbObjectsVO1
     */
    public DbObjectsVOImpl getDbObjectsVO1() {
        return (DbObjectsVOImpl)findViewObject("DbObjectsVO1");
    }
    
    public DbObjectTbl getObjectList(DbObjectTbl pDbObjList,
                                     String      pOwner,
                                     String      pObjectType,
                                     String      pObjectName) 
     {
         DbObjectTbl objectTbl = pDbObjList;

         try
         {

             DBTransaction dbTrans = this.getDBTransaction();
             
             DbObjectSourceGetter sourceGetter = new DbObjectSourceGetter();
             objectTbl = sourceGetter.getObjects(pDbObjList,
                                                 pOwner,
                                                 pObjectType,
                                                 pObjectName,
                                                 dbTrans);
             
         }
         catch(Exception e)
         {
             String x = e.getMessage();
             System.out.println("Error Message " + x);
         }   
         
         System.out.println("Engin bitti");

         return objectTbl;        
     }
     
     public DbObjectTbl initializeDbList(DbObjectTbl pDbObjList) 
     {
         
         DbObjectTbl objList =  getObjectList(pDbObjList,
                                              "XXTG",
                                              "TABLE",
                                              "XXTG_KTS_SITES_ALL");
         
         return objList;

         
         
     }

    /**
     * Container's getter for DbObjectsVO2.
     * @return DbObjectsVO2
     */
    public DbObjectsVOImpl getDbObjectsVO2() {
        return (DbObjectsVOImpl)findViewObject("DbObjectsVO2");
    }
}
