import java.io.*;
import java.util.*;

public class JavaInheritanceI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Bird b  = new Bird();
        b.walk();
        b.fly();
        b.sing();
    }
}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    
    void sing(){
        System.out.println("I am singing");
    }
}
