import java.io.*;
import java.util.*;

public class JavaGenerics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        printArray(new Integer[] {1,2,3});
        printArray(new String[]{"Hello","World"});
        
    }
    
    public static <T> void printArray(T[] arr){
        for(T num: arr){
            System.out.println(num);
        }
        
        return ;
    } 
    

    
    
    
    
}
