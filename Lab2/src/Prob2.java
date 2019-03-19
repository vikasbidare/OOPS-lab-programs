import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to enter:");
        int a = kb.nextInt();
        int i;
        String[] array = new String[a];
        System.out.println("Enter the strings of your choice:\n");
        kb.nextLine();
        for (i = 0; i < array.length; i++)
            array[i] = kb.nextLine();
        for (i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i].compareToIgnoreCase(array[j]) < 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        int c = 1;
        while (c == 1) {
            System.out.println("How do you want to sort the list:1.Ascending alphabetical\t2.Descending alphabetical\tAnything else to terminate\n");
            int b = kb.nextInt();
            if (b == 2) {
                System.out.println("The sorted list is:");
                for (i = 0; i < array.length; i++)
                    System.out.println(array[i] + "\n");
            } else if (b == 1) {
                System.out.println("The sorted list is:");
                for (i = 0; i < array.length; i++) {
                    System.out.println(array[array.length - 1 - i] + "\n");
                }
            } else c = 0;
        }

    }
}