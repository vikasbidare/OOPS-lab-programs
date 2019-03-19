import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList;
        arrayList = new ArrayList<>();
        int i,n=2;
        Student student1 = new Student();
        student1.studentName = "Vikas";
        student1.regNo = 171316;
        student1.avgmarks = 8;
        student1.elective = "cs";
        Student student2 = new Student();
        student2.studentName = "Rahul";
        student2.regNo = 171317;
        student2.avgmarks = 8;
        student2.elective = "ca";
        arrayList.add(student1);
        arrayList.add(student2);
        for(i=0;i<arrayList.size();i++)
            arrayList.get(i).show();
        long reg = 171316;
        for(i=0;i<arrayList.size();i++)
        {
            if(reg == arrayList.get(i).regNo)
            {
                arrayList.get(i).show();
            }
        }
    }
}
