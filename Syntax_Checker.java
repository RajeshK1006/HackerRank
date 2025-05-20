import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Syntax_Checker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String p = sc.nextLine();
            
            try{
                Pattern.compile(p);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        
        return;
        
        
    }
}
