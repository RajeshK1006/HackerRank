import java.io.*;
import java.util.*;

public class String_Tokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine().trim();
        
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        
        String[] arr = s.split("[ !,?._'@]+");
        
        // System.out.println(Arrays.toString(arr));
        
        System.out.println(arr.length);
        for(String st : arr){
            System.out.println(st);
        }
        
        return;
    }
}
