package xxnvt.model.file;

import java.util.ArrayList;
import java.util.List;

import xxnvt.model.dbobjects.DbObject;

public class FileTbl {
    public FileTbl() {
        super();
    }
    
    List<File> files = new ArrayList<File>();

    public void setDbObjects(List<File> files) {
        this.files = files;
    }

    public List<File> getDbObjects() {
        return files;
    }
}
