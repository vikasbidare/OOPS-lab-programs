public class student
{
    int rollno;
    String name;
    int marks1,marks2,marks3;

    //null constructor
    public student()
    {
        name = "Vikas";
        rollno = 52;
        marks1 = 50;
        marks2 = 50;
        marks3 = 50;
    }

    //parametrized constructor
    public student(String nm,int roll,int m1,int m2,int m3){
        name = nm;
        rollno = roll;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    //copy constructor
    public student(student a){
        name = a.name;
        rollno = a.rollno;
        marks1 = a.marks1;
        marks2 = a.marks2;
        marks3 = a.marks3;
    }

    void display(student a){
        System.out.println("Details of the student:");
        System.out.println("Name:" + a.name);
        System.out.println("Roll.no:" + a.rollno);
        System.out.println("Marks 1:" + a.marks1);
        System.out.println("Marks 2:" + a.marks2);
        System.out.println("Marks 3:" + a.marks3);
    }

    public static void main(String[] args) {
        student a = new student();
        student b = new student("Hemanth",18,25,28,33);
        student c = new student(b);
        System.out.println("The null constructor gives:");
        a.display(a);
        System.out.println("The parametrized constructor gives:");
        b.display(b);
        System.out.println("The copy constructor copies and gives:");
        c.display(c);
    }
}
