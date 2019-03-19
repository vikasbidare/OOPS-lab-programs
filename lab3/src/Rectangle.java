import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Rectangle {
    double length,width,area;
    String colour;

    void setLength(Rectangle a,double x){
        a.length = x;
    }

    void setWidth(Rectangle a,double x){
        a.width = x;
    }

    void setColour(Rectangle a,String s){
        a.colour = s;
    }

    void findArea(Rectangle a){
        a.area = (a.length)*(a.width) ;
    }

    public static void main(String[] args) {

        Rectangle a = new Rectangle();
        System.out.println("Enter details of first rectangle:");
        System.out.println("Enter length:");
        Scanner kb = new Scanner(System.in);
        double l1 = kb.nextDouble();
        a.setLength(a,l1);
        System.out.println("Enter width");
        double w1 = kb.nextDouble();
        a.setWidth(a,w1);
        System.out.println("Enter colour:");
        String c1 = kb.next();
        a.setColour(a,c1);
        a.findArea(a);
        Rectangle b = new Rectangle();
        System.out.println("Enter details of second rectangle:");
        System.out.println("Enter length:");
        double l2 = kb.nextDouble();
        b.setLength(b,l2);
        System.out.println("Enter width");
        double w2 = kb.nextDouble();
        b.setWidth(b,w2);
        System.out.println("Enter colour:");
        String c2 = kb.next();
        b.setColour(b,c2);
        b.findArea(b);
        //System.out.println("details:\n" + a.area + "\n" + b.area);
        System.out.println("Now,comparing both the rectangles :");
        if(a.area == b.area){
           if((a.colour).equals(b.colour))
            System.out.println("Matching rectangles");
           else
            System.out.println("Non matching rectangles");}
        else
            System.out.println("Non matching rectangles");

    }





}
