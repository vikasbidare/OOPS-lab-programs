import java.util.Scanner;

public class age extends customers {
    int age[]={0,0,0,0,0,0,0,0,0,0};
    age(){
        super();

    }
    public void age(){
        System.out.println("enter the age ");
        Scanner scanner = new Scanner(System.in);
        age[k] = scanner.nextInt();
    }

    public void printchild(){
        System.out.println("   name"+" "+"start  place   end   age");
        for(int i=1;i<k;i++){
            if(age[i]<12){
                System.out.println(i+". "+name[i]+" "+start[i]+" "+place[i]+" "+end[i]+" "+age[i]);
            }
        }
    }

}
