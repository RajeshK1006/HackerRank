import java.io.*;
import java.util.*;

public class Array_Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] res =  sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(res[i]);
        }        
        
        int c = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                
            if(sum<0){
                c++;
            }
            }
            

        }
        
        System.out.println(c);
        return;
    }
}
