
import java.util.Scanner;
public class Duplicate {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i<str.length();i++){
            int in = int(i);
            if(result.indexOf(in)==-1){
                result = result + in;

            }
        }
        System.out.println("String after removing duplicates:"+result);
       }
    
}
