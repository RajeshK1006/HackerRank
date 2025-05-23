import java.io.*;
import java.util.*;

public class JavaAbstractClass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        NewBook new_novel= new NewBook(); 
        new_novel.setTitle(name);
        System.out.println("The title is: "+new_novel.getTitle());
        
        sc.close();
        return;
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class NewBook extends Book{
    @Override
    void setTitle(String s){
        this.title = s;
    }
}

