package client;

// LIBRARIES
import java.util.*;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        //DECLARING VARIABLES
        String message="";
        String cipherText ="";
        String key="";
        int i,k=0;
        
        //DECLARING SOCKET
        Socket soc=new Socket("localhost",1234);
        
        //DECLARING RANDOM CLASS.
        Random randomGen = new Random();
        
        //DECLARING BUFFER
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter buffWrite  = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        
        System.out.println("Enter the message: ");
        message = buffRead.readLine();
        
        int j[] = new int[message.length()];
        
        for(i=0;i < message.length(); i++){
            j[k] = randomGen.nextInt(50);
            key = key + Integer.valueOf(j[k])+",";
           cipherText += (char)(message.charAt(i)+j[k]);
           k++;
        }
        
        System.out.println("Key: "+key);
        System.out.println("Encrypted message is: "+cipherText);
        
       buffWrite.write(cipherText+","+key);
       buffWrite.flush();
       buffWrite.close();
    }
    
}
