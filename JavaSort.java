import java.io.*;
import java.util.*;

public class JavaSort {
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            int id = Integer.parseInt(line[0]);
            String name = line[1];
            double gpa = Double.parseDouble(line[2]);
            
            Student obj = new Student(id, name, gpa);
            arr.add(obj);
            
        }
        
        
        Collections.sort(arr, new Comparator<Student>(){
            public int compare(Student a, Student b){
                if(Double.compare(b.getCgpa(),a.getCgpa())!=0){
                    return Double.compare(b.getCgpa(),a.getCgpa()); 
                }
                else if(!b.getName().equals(a.getName())){
                    return a.getName().compareTo(b.getName());
                }
                else{
                    return Integer.compare(a.getId(), b.getId());
                }
            }
        });
        
        for(Student obj : arr){
            System.out.println(obj.getName());
        }
        
    }
}

class Student{
    private int id;
    private String name;
    private double cgpa;
    
    
    public Student(int id, String name, double cgpa){
        this.id  = id; 
        this.name = name;
        this.cgpa = cgpa;
    }
    
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCgpa(){
        return this.cgpa;
    }
}
