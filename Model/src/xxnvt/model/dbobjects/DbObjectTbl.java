package xxnvt.model.dbobjects;

import java.util.ArrayList;
import java.util.List;

public class DbObjectTbl {
    
    List<DbObject> dbObjects = new ArrayList<DbObject>();
    
    public DbObjectTbl() {
        super();
    }

    public void setDbObjects(List<DbObject> pDbObjects) {
        this.dbObjects = pDbObjects;
    }

    public List<DbObject> getDbObjects() {
        return dbObjects;
    }
    
    public List<DbObject> findAllDbObjects() {
        return dbObjects;
    }
}
