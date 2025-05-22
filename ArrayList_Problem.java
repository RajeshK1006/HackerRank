import java.io.*;
import java.util.*;

public class ArrayList_Problem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> arr = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] a = sc.nextLine().split(" ");
            List<Integer> inner = new ArrayList<>();
            for(int j=1;j<a.length;j++){
                inner.add(Integer.parseInt(a[j]));
            }
            
            arr.add(inner);
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++){
            String[] ques = sc.nextLine().split(" ");
            int lno = Integer.parseInt(ques[0]);
            int place = Integer.parseInt(ques[1]);
            if (lno - 1 >= arr.size() || place - 1 >= arr.get(lno - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arr.get(lno - 1).get(place - 1));
            }
        }
    
        
    }
}
