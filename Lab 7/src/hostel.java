import java.util.ArrayList;
import java.util.Scanner;

class Hostel {
    String hostelname;
    String hostellocation;
    int nrofrooms;
    void print(){
        System.out.println("The details of the hostel are:");
        System.out.println("Name: " + hostelname + "\nLocation: "+hostellocation + "\nNumber of rooms: " + nrofrooms);
    }
}

class Student extends Hostel implements Department{
    String studentName;
    long regNo;
    String elective;
    float avgmarks;
    public void printname(){
        System.out.println("The department of the Student is:"+deptName);
    }
    @Override
    public void printhod() {
        System.out.println("The HOD of the department is:" + deptHead);
    }
    void show(){
        System.out.println("Details of student are:");
        System.out.println("name: " + studentName);
        System.out.println("regNo.: " + regNo);
        System.out.println("Elective: " + elective);
        System.out.println("Avg. marks: "+ avgmarks);
        System.out.println("Department:");
        printname();
        printhod();
        System.out.println("Hostel:");
        print();
    }
}

class mainstudent{
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> studlist = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        int i,j,a,flag;
        long reg;
        i=1;
        while(i==1)
        {
            System.out.println("Enter your choice:");
            System.out.println("1.Admit student\n2.Migrate Student\n3.Show details of student\n(Other key to exit)");
            a = kb.nextInt();
            switch(a)
            {
                case 1:
                    kb.nextLine();
                    System.out.println("Enter details of student:\nName:");
                    student.studentName = kb.nextLine();
                    System.out.println("Enter elective:");
                    student.elective = kb.nextLine();
                    System.out.println("Enter hostel name:");
                    student.hostelname=kb.nextLine();
                    System.out.println("Enter hostel locality:");
                    student.hostellocation=kb.nextLine();
                    System.out.println("Enter room no.:");
                    student.nrofrooms = kb.nextInt();
                    System.out.println("Enter AvgMarks:");
                    student.avgmarks = kb.nextFloat();
                    System.out.println("Enter Reg No.:");
                    student.regNo = kb.nextLong();
                    studlist.add(student);
                    break;
                case 2:
                    kb.nextLine();
                    System.out.println("Enter regno. of student to be migrated:");
                    reg=kb.nextLong();
                    flag=0;
                    for(j=0;j<studlist.size();j++)
                    {
                        if(reg==studlist.get(j).regNo)
                        {
                            student = studlist.get(j);
                            flag=1;
                            studlist.remove(j);
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Student Not Found");
                        break;
                    }
                    System.out.println("Student found");
                    student.show();
                    kb.nextLine();
                    System.out.println("Enter hostel name of the new hostel for student:");
                    student.hostelname=kb.nextLine();
                    System.out.println("Enter hostel location of new hostel:");
                    student.hostellocation=kb.nextLine();
                    System.out.println("Enter room number in new hostel:");
                    student.nrofrooms=kb.nextInt();
                    studlist.add(student);
                    break;
                case 3:
                    kb.nextLine();
                    System.out.println("Enter regno. of student to be found:");
                    reg=kb.nextLong();
                    flag=0;
                    for(j=0;j<studlist.size();j++)
                    {
                        if(reg==studlist.get(j).regNo)
                        {
                            student = studlist.get(j);
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Student Not Found");
                        break;
                    }
                    System.out.println("the details of the student are:");
                    student.show();
                    break;
                default:
                    i=0;
                    break;
            }
        }
    }
}