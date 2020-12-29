
package server;

import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args) throws IOException {
        
String cipherText="";
String plainText="";

ServerSocket serverSoc=new ServerSocket(1234);
Socket sc=serverSoc.accept();

int i=0;
System.out.println("Receiving Client Message: ");
BufferedReader br= new BufferedReader(new InputStreamReader(sc.getInputStream()));
cipherText=br.readLine();

String[] s=new String[cipherText.length()];
s=cipherText.split(",");

int[] j=new int[s[0].length()];
System.out.println(" message: "+s[0]);
for(i=0;i<s[0].length();i++)
{
j[i]=Integer.parseInt(s[i+1]);
}

for(i=0;i<s[0].length();i++)
{
plainText += (char)(s[0].charAt(i)-j[i]);
 }

System.out.println(" message from Sender: "+plainText);

    }
    
}
