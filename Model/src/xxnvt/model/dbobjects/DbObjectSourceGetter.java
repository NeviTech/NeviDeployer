package xxnvt.model.dbobjects;

import java.sql.Array;
import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.DBTransactionImpl;

import oracle.ods.virtualization.engine.backend.db.DBConnectionPool;

public class DbObjectSourceGetter 
{
    public DbObjectSourceGetter() 
    {
        super();
    }
    
    public DbObjectTbl getObjects(DbObjectTbl   pDbObjList,
                                  String        pOwner,
                                  String        pObjectType,
                                  String        pObjectName,
                                  DBTransaction pDbTransaction)
    {
        DbObjectTbl objTbl = pDbObjList;
        
        String getDBUSERByUserIdSql = "begin ? :=  xxnvt_nd_db_obj_pkg.get_object_ddl(?,?,?); end;";
        try
        {
            
            CallableStatement cs = pDbTransaction.createCallableStatement(getDBUSERByUserIdSql, 4);            
            cs.setString(2, pOwner);
            cs.setString(3, pObjectType);
            cs.setString(4, pObjectName);
            cs.registerOutParameter(1, java.sql.Types.ARRAY, "APPS.XXNVT_ND_DB_INFORMATION_TBL");

            Connection connection = cs.getConnection();
            Map<String,Class<?>> map = connection.getTypeMap();
            map.put("APPS.XXNVT_ND_DB_INFORMATION", Class.forName("xxnvt.model.dbobjects.DbObject"));
            connection.setTypeMap(map);

            cs.executeUpdate();
             
            Array array = cs.getArray(1);
            
            ResultSet rs = array.getResultSet();
            
            List<DbObject> list = new ArrayList<DbObject>();
            
            while(rs.next())
            {
            
                list.add((DbObject)rs.getObject(2));
                
            }
            objTbl.setDbObjects(list);
            
            //objTbl.setObjectTbl(new DbObject[list.size()]);
            //list.toArray(objTbl.getObjectTbl());
            
        }
        catch(Exception e)
        {
            String errorMessage = e.getMessage();
            
            System.out.println("Hata Mesaji " + errorMessage);
        }
        
        
        return objTbl;
    }
    
}