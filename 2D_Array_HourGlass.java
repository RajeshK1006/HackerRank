import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class HourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = helper(arr,i,j);
                maxi = Math.max(maxi,sum);
            }
        }
        System.out.println(maxi);
        return;

       
    }
    
    
    static int helper(List<List<Integer>> arr, int r, int c){
        int sum = 0;
        for(int i=0;i<3;i++){
            sum+=arr.get(r).get(c+i);
            sum+=arr.get(r+2).get(c+i);
        }
        sum+=arr.get(r+1).get(c+1);
        
        return sum;
    }
}
 
