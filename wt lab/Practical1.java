
package practical1;


public class Practical1 {

    
    public static void main(String[] args) {
        Student s =new Student();
        s.name="john";
        s.roll_no=2;
        s.print();
    }
    
}
class Student{
    String name;
    int roll_no;
    void print(){
        System.out.println(name+" "+roll_no);
    }
}