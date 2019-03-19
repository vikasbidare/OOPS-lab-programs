import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student {
    String name;
    String rollno;
    int department;
    float CGPA;
    double salary_offered;
    String email;
    Date dob=null;
    static SimpleDateFormat format;

    static {
        format = new SimpleDateFormat("dd/mm/yyyy");
    }

    void display1(){
        System.out.println("Details of the student:");
        System.out.println("Name: " + name);
        System.out.println("Roll-no: " + rollno);
        System.out.println("e-mail: " + email);
        System.out.println("CGPA: " + CGPA);
    }

    void display2(){
        System.out.println("Details of the student:");
        System.out.println("Name: " + name);
        System.out.println("Roll-no: " + rollno);
        System.out.println("Salary offered: " + salary_offered);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the total number of students whose details yo want to enter:");
        Scanner kb = new Scanner(System.in);
        int ns = kb.nextInt();
        int i;
        String date;
        Date date1;
        Student[] a = new Student[ns];
        System.out.println("Enter the details of each student:");
        for(i=0;i<ns;i++)
        {
            System.out.println("Details of student no:" + i );
            System.out.println("Name:");
            a[i].name = kb.nextLine();
            System.out.println("rollno:");
            a[i].rollno = kb.nextLine();
            System.out.println("Department(CH(0)/CS(1)/CV(2)/EC(3)/EE(4)/IT(5)/ME(6)/MN(7)/MT(8)):");
            a[i].department = kb.nextInt();
            System.out.println("CGPA:");
            a[i].CGPA = kb.nextFloat();
            System.out.println("Salary offered (In rupees):");
            a[i].salary_offered = kb.nextDouble();
            System.out.println("e-mail ID : ");
            a[i].email = kb.nextLine();
            System.out.println("Date of Birth(dd-mm-yyyy)");
            date = kb.nextLine();
            date1 = format.parse(date);
            a[i].dob = date1;
        }
        double[] davg = new double[9];
        int[] dno = new int[9];
        for(i=0;i<9;i++)
        {davg[i]=0.0;
         dno[i]=0;}
        for(i=0;i<ns;i++){
            if(a[i].department==0)
            { davg[0]+=a[i].CGPA;
                dno[0]+=1; }
            if(a[i].department==1)
            {   davg[1]+=a[i].CGPA;
                dno[1]+=1; }
            if(a[i].department==2)
            {    davg[2]+=a[i].CGPA;
                dno[2]+=1; }
            if(a[i].department==3)
            {    davg[3]+=a[i].CGPA;
                dno[3]+=1; }
            if(a[i].department==4)
            {   davg[4]+=a[i].CGPA;
                dno[4]+=1; }
            if(a[i].department==5)
            {   davg[5]+=a[i].CGPA;
                dno[5]+=1; }
            if(a[i].department==6)
            {   davg[6]+=a[i].CGPA;
                dno[6]+=1; }
            if(a[i].department==7)
            {   davg[7]+=a[i].CGPA;
                dno[7]+=1; }
            if(a[i].department==8)
            {   davg[8]+=a[i].CGPA;
                dno[8]+=1;}
        }
        for(i=0;i<9;i++)
            davg[i]=davg[i]/dno[i];
        int maxd = 0;
        double max = davg[0];
        for(i=0;i<ns;i++)
            if(davg[i]>=max) {
                maxd = i;
                max = davg[i];
            }
        System.out.println("Dept. with code :" + maxd + "has maximum CGPA");
        for(i=0;i<ns;i++)
        {
            if(a[i].department==maxd)
                a[i].display1();
        }
    }


}
