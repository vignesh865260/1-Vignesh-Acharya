import java.io.*;




public class WordSearch{
    public static void main(String[] args){

        try{
            String str="";
            String ser="";
            int flg =0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader brf = new BufferedReader(new FileReader("Text.txt"));
            str = brf.readLine();

            String[] s = new String[str.length()];
            System.out.println("Enter the text u want to search: ");
            ser = br.readLine();
            s=str.split(" ");

            for(int i=0;i<s.length;i++){
                if(ser.equalsIgnoreCase(s[i])){
                    System.out.println("Text "+ser+" Found");
                    flg =1;
                }
                if(flg ==0){
                    System.out.println("Text "+ser+" Not Found");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}