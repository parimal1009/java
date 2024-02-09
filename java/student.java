class student  {
    int rollno;
    String name;


    public student(int rollno, String name){
        this.rollno =rollno;
        this.name=name;//constructor

    }
    void displaystudent(){
        System.out.println("Roll no : " + rollno);
        System.out.println("Name :"+name);

    }
    void timepassDisplay(){
        this.displaystudent();

    }
}

public class Useofthiskeyword {
    public static void main(String[] args) {
        student student1 =new student(10,"Ravi");
        student1.displaystudent(;)
    }
}