import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           arr.add(sc.nextInt());
            
        }

        int q = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < q; i++) {
            String que = sc.nextLine();
            
            if (que.equalsIgnoreCase("Insert")) {
                String[] vals = sc.nextLine().split(" ");
                int index = Integer.parseInt(vals[0]);
                int val = Integer.parseInt(vals[1]);
                arr.add(index, val); // Use add, not set
            } else if (que.equalsIgnoreCase("Delete")) {
                int index = Integer.parseInt(sc.nextLine());
                
                if (index >= 0 && index < arr.size()) {
                    arr.remove(index);
                }
            }
        }    
        for(int num:arr){       
             System.out.print(num+" ");
    }
}
}
