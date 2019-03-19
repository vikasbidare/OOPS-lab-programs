import java.io.File;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the file's name you want to enter");
        String s = kb.next();
        s = "/home/student/vikas/" + s;
        File f = new File(s);
        boolean a = f.exists();
        if(a == true)
        {
            System.out.println("File exists");
            System.out.println("File readable:" + f.canRead());
            System.out.println("File writeable:" + f.canWrite());
            System.out.println("File executable:" + f.canExecute());
            System.out.println("File length :" + f.length());
            System.out.println("File type :" + f.getAbsolutePath());
        }
        else
            System.out.println("File doesn't exist");
        }

}
