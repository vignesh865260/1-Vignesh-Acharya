import java.io.*;
import java.util.logging.*;

public class Mylogger{
    public static void main(String[] args){
        
        Logger log = Logger.getLogger(Mylogger.class.getName());
        FileHandler filehandler;

        try {

            filehandler = new FileHandler("E:/mylogfile.log",true);
            log.addHandler(filehandler);
            log.setLevel(Level.ALL);

            SimpleFormatter sf = new SimpleFormatter();
            filehandler.setFormatter(sf);
            
            log.info("My First Log");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        log.info("Hi how are you...?");


    }
}