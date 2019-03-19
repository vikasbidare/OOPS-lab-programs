import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Paths;


public class Prob3
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("abc.txt");
        String s;
        System.out.println("Enter the input you want to enter to the file\n");
        Scanner kb = new Scanner(System.in);
        s = kb.nextLine();
        Files.write(Paths.get("abc.txt"),s.getBytes());
        System.out.println("Successfully written!");
    }
}
