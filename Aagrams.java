import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        if(a.length()!=b.length()){
            System.out.println("Not Anagrams");
            return;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        
        HashMap<Character, Integer> map  = new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i), 0)+1);
        }
        
        for(int i=0;i<b.length();i++){
            
            if(!map.containsKey(b.charAt(i))){
                System.out.println("Not Anagrams");
                return;
            }
            if(map.get(b.charAt(i))==0){
                System.out.println("Not Anagrams");
                return;
            }
            else{
                map.put(b.charAt(i),map.get(b.charAt(i))-1);
            }
            
        }
        
        System.out.println("Anagrams");
    }
}
