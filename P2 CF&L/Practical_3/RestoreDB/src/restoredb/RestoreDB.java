package restoredb;


public class RestoreDB {
//    public void restoreDB(String path){
//        //String exeCmd = "C:/\"Program Files\"/MySQL/\"MySQL Server 8.0\"/bin/mysql -u root -p12345 studdb<"+path;
//        System.out.println(exeCmd);
//        Process p=null;
//        try {
//            p = Runtime.getRuntime().exec(new String[]{"cmd.exe","/c",exeCmd});
//            int processComplete = p.waitFor();
//            System.out.println(processComplete);
//            if(processComplete ==0){
//                System.out.println(" Restored Successfully.");
//            }else{
//                System.out.println("Unable to Restore.");
//            }
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } 
//    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //new RestoreDB().restoreDB("E:/MyBackup.sql");
        String source="E:/MyBackup.sql";
        String dbuname="root";
        String dbpass="12345";
        String[] restoreCmd = new String[]{"mysql ", "--user=" + dbuname, "--password=" + dbpass, "-e", "source " + source};
        Process p;
        try{
            p = Runtime.getRuntime().exec(restoreCmd);
            int procStat = p.waitFor();
            if(procStat ==0){
                System.out.print("'Restored Successfully");
            }else{
                System.out.println("Failed to restore");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
