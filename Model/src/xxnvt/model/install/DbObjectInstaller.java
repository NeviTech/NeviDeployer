package xxnvt.model.install;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.util.Map;

public class DbObjectInstaller 
{
    String[] fileNames = {"XXNVT_ND_DB_INFORMATION.sql",
                          "XXNVT_ND_DB_INFORMATION_TBL.sql",
                          "XXNVT_ND_DB_OBJ_PKG.sql"
                          };
    
    String directory  = "/";
    
    String sqlCommand = "sqlplus";
    
    String dbConnection = "apps/devapps#490@panda.erp.mis.turkcell.tgc:1533/TDEV";
    
    public DbObjectInstaller() 
    {
        super();
    }
    
    public static void main(String[] args)
    {
        
        DbObjectInstaller x = new DbObjectInstaller();
        x.installDbObjects();
        
    }
    
    public String installDbObjects()
    {
        String output = "";
        
        for (int i = 0; 
             i < fileNames.length; 
             i++)
        {
            System.out.println("FileName: " + fileNames[i]);
            output = output + 
                     "FileName: " + 
                     fileNames[i] +
                     runScript(
                       fileNames[i],
                       directory,
                       sqlCommand,
                       dbConnection
                     );
        }
        
        return output;
    }
    
    public String runScript (
                              String pFileName,
                              String pFileDirectory,
                              String pSqlCommand,  //sqlplus
                              String pDbConnection // plug in your user, password and db name
                            ) 
    {

           String fileName = pFileName;
           String sqlPath  = pFileDirectory;

           String sqlCmd   = pSqlCommand;

           String arg1     = pDbConnection; // plug in your user, password and db name
           String arg2     = fileName;
           String output   = "";
           
           try 
           {
               System.out.println("1");   
               String line;
               ProcessBuilder pb = new ProcessBuilder(sqlCmd, arg1, arg2);
               System.out.println("2 " + arg1 + " arg2 " + arg2);
               Map<String, String> env = pb.environment();
               env.put("VAR1", arg1);
               env.put("VAR2", arg2);
               System.out.println("3");
               pb.directory(new File(sqlPath));
               pb.redirectErrorStream(true);
               Process p = pb.start();
               System.out.println("4");
               BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
               BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
               System.out.println("5");
               while ((line = bri.readLine()) != null) 
               {
                   output = output + line;
               }
               bri.close();
               System.out.println("6");
               while ((line = bre.readLine()) != null) 
               {
                   output = output + line;
               }
               bre.close();
               System.out.println("7 " + output);
               return output;
               
           }
           catch (Exception err) 
           {
               System.out.println("8 " + err.getMessage());
             return err.getMessage();
             
           }

    }
    
}