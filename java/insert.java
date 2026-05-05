import java.util.*;
public class insert{
    public static void main(String[]args){
    StringBuilder sb = new StringBuilder("hello");
    sb.insert(0,'s');
    System.out.println("After Insert:" +sb);
    sb.delete(0,1);
    System.out.println("After Delete:" +sb);
    }


}