import java.util.Scanner;

public class tollbooth {
    int vehicles;
    double toll;

    public tollbooth(){
        vehicles = 0;
        toll = 0;
    }

    void paying_vehicle(int v,double t){
        v=v+1;
        vehicles = v;
        t=t+50.0;
        toll = t;
    }

    void non_paying_vehicle(int v){
        v=v+1;
        vehicles=v;
    }

    void display(int v,double t){
        System.out.println("The total number of vehicles is: " + v);
        System.out.println("The total toll collected is: " + t);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        tollbooth a = new tollbooth();
        System.out.println("Enter the number of paying vehicles entering the toll:");
        int i,v = kb.nextInt();
        for(i=0;i<v;i++){
            a.paying_vehicle(a.vehicles, a.toll);
        }
        System.out.println("Enter the number of non-paying vehicles entering the toll");
        int v1 = kb.nextInt();
        for(i=0;i<v1;i++)
            a.non_paying_vehicle(a.vehicles);
        a.display(a.vehicles,a.toll);
    }
}

