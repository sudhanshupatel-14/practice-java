import java.util.*;
public class Main {
    public static String toTitleCase(String str){
        String[]words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            if(word.equals(word.toUpperCase()))
                result.append(word);
    } else{
        String first = word.substring(0,1).toUpperCase();
        String rest = word.substring(1).toLowerCase();
        result.append(first+rest);
    }
    result.append(" ");
    
    return result.toString().trim();

}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    sc.nextLine();

while(T-- >0){
    String input = sc.nextLine();
    System.out.println(toTitleCase(input));

}
sc.close();
}
}