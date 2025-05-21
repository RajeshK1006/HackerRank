import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ValidUserName {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt(); 
         sc.nextLine();
        
        String p = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
        
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            
            if(s.matches(p)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
            
        }
    }
}
