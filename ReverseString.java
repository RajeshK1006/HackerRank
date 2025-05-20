import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int l = 0;
        int r = A.length()-1;
        
        while(l<=r){
            if(A.charAt(l)!=A.charAt(r)){
                System.out.println("No");
                return;
            }
            else{
                l++;
                r--;
            }
        }
        
        System.out.println("Yes");
        
        
    }
}



