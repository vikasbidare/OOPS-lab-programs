import java.util.Scanner;

public class customers {
    String name[] = {"","","","","","","","",""};
    int start[] = {0,0,0,0,0,0,0,0,0,0};
    String place[] = {"","","","","","","","",""};
    int end[] = {0,0,0,0,0,0,0,0,0,0};
    int k=1,l=1;

    public void enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of passenger ");
        name[k]=scanner.nextLine();
        System.out.println("enter the start and end dates ");
        start[k] = scanner.nextInt();
        end[k] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the name of place ");
        place[k]=scanner.nextLine();
        k++;

    }

    public void display(){
        System.out.println("The details of the travellers are");
        System.out.println("   name"+" "+"start  place   end");
        for(int i=1;i<k;i++){
            System.out.println(i+". "+name[i]+" "+start[i]+" "+place[i]+" "+end[i]);
        }
    }
}
