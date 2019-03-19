import java.util.Scanner;

public class Vehicle {
    protected long RegNumber;
    protected int Mileage;
    protected String Color;
    protected String OwnerName;
    void showData(){
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle{
    private int Routeno;
    void showData(long RegNumber1,int Mileage1,String color,String Owner,int routeno){
        System.out.println("The details of the Bus are:");
        this.RegNumber = RegNumber1;
        this.Mileage = Mileage1;
        this.Color = color;
        this.OwnerName = Owner;
        this.Routeno = routeno;
        System.out.println("Register Number: " +  RegNumber);
        System.out.println("Mileage(in kmpl): " + Mileage);
        System.out.println("Color: " + Color);
        System.out.println("Owner's Name: " + OwnerName);
        System.out.println("Route Number: " + Routeno);
    }
}

class Car extends Vehicle{
    private String ManufacturerName;
    void showData(long RegNumber1,int Mileage1,String color,String Owner,String Manname){
        System.out.println("The details of the car are:");
        this.RegNumber = RegNumber1;
        this.Mileage = Mileage1;
        this.Color = color;
        this.OwnerName = Owner;
        this.ManufacturerName = Manname;
        System.out.println("Register Number: " + RegNumber);
        System.out.println("Mileage(in kmpl): " + Mileage);
        System.out.println("Color: " + Color);
        System.out.println("Owner's Name: " + OwnerName);
        System.out.println("Manufacturer's name: " + ManufacturerName);
    }
}

class main{
    public static void main(String[] args) {
        System.out.println("Enter details of bus:");
        long regno;
        int routeno;
        int mileage;
        String color;
        String owner;
        String manname;
        Scanner kb = new Scanner(System.in);
        System.out.println("Register Number:");
        regno = kb.nextLong();
        System.out.println("Mileage(in kmpl):");
        mileage = kb.nextInt();
        System.out.println("Route number:");
        routeno = kb.nextInt();
        kb.nextLine();
        System.out.println("Owner's name:");
        owner = kb.nextLine();
        System.out.println("Color of the vehicle:");
        color = kb.nextLine();
        Bus bus = new Bus();
        System.out.println("The showData() of vehicle class gives:");
        bus.showData();
        System.out.println("");
        System.out.println("The showData() of Bus class gives:");
        bus.showData(regno,mileage,color,owner,routeno);
        System.out.println("Enter details of car:");
        System.out.println("Register Number:");
        regno = kb.nextLong();
        System.out.println("Mileage(in kmpl):");
        mileage = kb.nextInt();
        kb.nextLine();
        System.out.println("Owner's name:");
        owner = kb.nextLine();
        System.out.println("Color of the vehicle:");
        color = kb.nextLine();
        System.out.println("Manufacturer's Name: ");
        manname = kb.nextLine();
        Car car = new Car();
        System.out.println("The showData() of vehicle class gives:");
        car.showData();
        System.out.println("");
        System.out.println("The showData() of Car class gives:");
        car.showData(regno,mileage,color,owner,manname);


    }
}