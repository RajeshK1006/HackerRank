import java.io.*;
import java.util.*;

public class JavaSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        HashSet<String> s = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] arr = sc.nextLine().split(" ");
            Arrays.sort(arr);
            
            
            String res = arr[0] + "," + arr[1];
            s.add(res);
            System.out.println(s.size());
            
        }
        
        
    }
}
