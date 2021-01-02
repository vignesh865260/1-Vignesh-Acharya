package backupdb;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BackupDB {
    
    public void backupDB(String path){
        String exeCmd = "C:/\"Program Files\"/MySQL/\"MySQL Server 8.0\"/bin/mysqldump -u root -p12345 -B studdb>"+path;
        Process p=null;
        try {
            p = Runtime.getRuntime().exec(new String[]{"cmd.exe","/c",exeCmd});
            int processComplete = p.waitFor();
            System.out.println(processComplete);
            if(processComplete ==0){
                System.out.println("Backup Created Successfully.");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(BackupDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(BackupDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new BackupDB().backupDB("E:/MyBackup.sql");
    }
    
}
