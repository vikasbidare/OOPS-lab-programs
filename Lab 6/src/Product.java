import java.util.Scanner;

public class Product {
    String Itemname;

    public int getPrice() {
        return unitPrice;
    }

    int unitPrice;

    Product(double i){
        Itemname = "No product";
        unitPrice = 0;
    }

    Product(String a,int b){
        Itemname = a;
        unitPrice = b;
    }

    public String toString() {
        String a;
        a = Itemname + " @" + "Rs." + unitPrice + "/-";
        return a;
    }
}

class WeightedProduct extends Product{
    int weight;
    WeightedProduct(){
        super(0);
    }

    @Override
    public int getPrice(){
        int price = weight * unitPrice ;
        return price;
    }

    @Override
    public String toString(){
        String a;
        int s = getPrice();
        a = Itemname + " @ Rs." +  unitPrice + "/- " + weight + " kgs Rs." + s + "/-";
        return a;
    }
}

class CountedProduct extends Product{
    int quantity;

    CountedProduct() {
        super(0);
    }

    @Override
    public int getPrice(){
        int price = quantity * unitPrice ;
        return price;
    }

    @Override
    public String toString(){
        String a;
        int s = getPrice();
        a = Itemname + " @ Rs." +  unitPrice + "/- " + quantity + " units Rs." + s + "/-";
        return a;
    }
}

class productmain{
public static void main(String[]args){
    int i=1,x,y,z,j;
    String s;
    Scanner kb = new Scanner(System.in);
    WeightedProduct a = new WeightedProduct();
    CountedProduct b = new CountedProduct();
    while(i==1) {
        System.out.println("Enter\n1.To enter product details and get bill\n2.To exit");
        x = kb.nextInt();
        if (x==1){
            System.out.println("Enter\n1.If weighted product\n2.If counted product");
            y = kb.nextInt();
            if (y==1)
            {
                kb.nextLine();
                System.out.println("Enter product name:");
                s = kb.nextLine();
                System.out.println("Enter price of unit KG:");
                z = kb.nextInt();
                System.out.println("Enter weight in KGs:");
                j = kb.nextInt();
                a.Itemname = s;
                a.unitPrice = z;
                a.weight = j;
                s = a.toString();
                System.out.println("The billing of the product gives:\n" + s);
            }
            else if (y==2){
                kb.nextLine();
                System.out.println("Enter product name:");
                s = kb.nextLine();
                System.out.println("Enter price of unit product:");
                z = kb.nextInt();
                System.out.println("Enter quantity in numbers:");
                j = kb.nextInt();
                b.Itemname = s;
                b.unitPrice = z;
                b.quantity = j;
                s = b.toString();
                System.out.println("The billing of the product gives:\n" + s);
            }
            else
                System.out.println("Please enter valid choice");
        }
        else {
            i=0;
        }
    }
        }
}



