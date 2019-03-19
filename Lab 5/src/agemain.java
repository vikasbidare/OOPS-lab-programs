import java.util.Scanner;

public class agemain {
    public static void main(String[] args) {
        age age = new age();
        int k=1;
        while(k==1){
            System.out.println("do u want to add another passenger 1.yes 2.no 3.diplay all");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            switch (i){
                case 1:{
                    age.age();
                    age.enter();
                }break;
                case 2:{
                    k=0;
                }break;
                case 3:{
                    age.display();
                }break;
                default:System.out.println("enter proper option ");
            }
        }

        System.out.println("printing details of all passengers below age of 12");
        age.printchild();
    }
}
