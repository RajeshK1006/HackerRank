import java.io.*;
import java.util.*;

public class JavaInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        
        AdvancedArithmetic ob = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(ob.divisor_sum(n));
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0 ;      
        for (int i = 1 ; i <= n ; i++ ){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
