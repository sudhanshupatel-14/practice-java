import java.io.File;
import java.io.IOException;

public class filehandling {
    public static void main(String[]args){
        try{
            File file = new File("/Users/apple/Desktop/coding/java/test.txt");
        if(file.createNewFile()){
            System.out.println("File created:" + file.getName());

        }
        else{
            System.out.println( "File already exists:");

        }

        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();

        }
    }
    
}
