import java.io.*;
import java.util.*;
import java.text.*;


public class CurrencyFormatter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
    NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
    // using new Locale because we don't have immediately the currency of India
    NumberFormat IND = NumberFormat.getCurrencyInstance(new Locale("en","in"));
    NumberFormat CH = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat FR = NumberFormat.getCurrencyInstance(Locale.FRANCE);


    String us = US.format(payment); 
    String india = IND.format(payment);
    String china = CH.format(payment);
    String france = FR.format(payment);


    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
    }
}
