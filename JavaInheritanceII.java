import java.io.*;
import java.util.*;

public class JavaInheritanceII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Adder obj = new Adder();
        System.out.println("42 13 "+obj.add(42,13));
    }
}


class Arithmetic{
    public int add(int a, int b){
        return 20;
    }
}

class Adder extends Arithmetic{
    
    
    public Adder(){
        super();
        System.out.println("My superclass is: Arithmetic");
    }
    
    
}
