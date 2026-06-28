import java.io.*;
public class Newcode {
  
        NewCode(NewCode obj2){
            this.name =obj2.name;
            this.id = obj2.id;
        }}
    
    String name;
    int id;
    NewCode(String name, int id)
    class main{
        public static void main(String[] args) {
            System.out.println("First Object");
            NewCodee obj = new NewCode("Nandan",32);
            System.out.println("EmpName:"+obj.name+"add Empld:" + obj.id);

        
        System.out.println();
        NewCode T2 = new NewCode(obj);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("EmpName:"+ T2.name+ "and Empid:"+T2.id);
        
    }
}
