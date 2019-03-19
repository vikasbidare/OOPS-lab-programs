import java.util.Scanner;

public class Program1
{
    public static void main ( String[] args)
    {
        System.out.println("Hey,everyone");
        String print;
        Scanner kb;
        kb = new Scanner(System.in);
        System.out.println("Enter the message");
        print = kb.next();
        System.out.println("The message is:" + print);
    }

}
