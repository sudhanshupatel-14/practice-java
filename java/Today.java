public class Today {
    public static void printWords(String s) {
        for(String w:s.split("")){
            if(w.length()%2==0)
                
                System.out.println(w);
                 else(w.length()%2!=0)
            System.out.println(w);
        }
        
        }
        public static void main (String[]args)
        {
            String s= "i a student for students and old also";
            printWords(s);
        }

    
    
}
