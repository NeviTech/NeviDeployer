package xxnvt.model.file;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Util {
        
    public Util() {
        super();
    }
    
    public static void main(String[] args) {
        
        File f = new File("C:\\Users\\ext0193916\\Desktop\\CC creator\\DeploymentPackageCreator\\sample\\dev0001\\files\\fmb\\");
        List file = new ArrayList();
        getFileList(f,file);
    }

    @SuppressWarnings("unchecked")
    private static void getFileList(File fileDir, List fileList) {
        File[] files = fileDir.listFiles();

        
        for (ArrayIterator it = new ArrayIterator(files); it.hasNext();) {
            File file = (File) it.next();
            System.out.println("File Name: "+file.getAbsolutePath());
            if (file.isFile()) {
               fileList.add(file);
            }

            if (file.isDirectory()) {
               getFileList(file, fileList);
            }
        }
        
         

            
    }

}
    


