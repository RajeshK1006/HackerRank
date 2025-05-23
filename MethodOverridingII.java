import java.io.*;
import java.util.*;

public class MethodOverridingII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Motorcycle obj = new Motorcycle();
        obj.define_me();
    }
}

class Cycle {
    void define_me() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }


}


class Motorcycle extends Cycle {
    @Override
    void define_me() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.define_me();
    }
}
