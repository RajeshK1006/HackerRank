import java.io.*;
import java.util.*;

public class MethodOveridingI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sports obj = new Sports();
        Soccer obj2 = new Soccer();
        
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
        
        
        System.out.println(obj2.getName());
        obj2.getNumberOfTeamMembers();
    }
}

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}


class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
