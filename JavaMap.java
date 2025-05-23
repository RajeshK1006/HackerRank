import java.io.*;
import java.util.*;

public class JavaMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Map<String, Long> map = new HashMap<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name  = sc.nextLine();
            Long num = sc.nextLong();
            sc.nextLine(); 
            map.put(name, num);
        }
        
        while(sc.hasNext()){
            String q = sc.nextLine();
            if(!map.containsKey(q)){
                System.out.println("Not found");
            }
            else{
                System.out.println(q+"="+map.get(q));
            }
        }
        
        return ;
    
    }
}
