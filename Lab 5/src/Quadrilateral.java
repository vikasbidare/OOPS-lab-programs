import java.util.Scanner;

import static java.lang.Math.abs;

public class Quadrilateral {
    float x1,x2,x3,x4,y1,y2,y3,y4;

}

class Paralellogram extends Quadrilateral{
    void area(){
        float area = abs((x2-x1)*(y4-y1));
        System.out.println("The area of the paralellogram is " + area);
    }
}

class Trapezoid extends Quadrilateral{
    void area(){
        float area = (float) (0.5 * (abs(x2-x1) + abs(x3-x4)) * (abs(y4 - y1)));
    }
}

class Rectangle extends Paralellogram{
    void area(){
       float area = abs((x2-x1)*(y4-y1));
        System.out.println(" The area of the Rectangle is " + area);
    }
}

class Square extends Rectangle{
    void area(){
        float area = (x2-x1)*(x2-x1);
        System.out.println("The area of the square is " + area);
    }
}

class Main{
    public static void main(String[] args) {
        int i=1,a;
        Square square = new Square();
        Paralellogram paralellogram = new Paralellogram();
        Trapezoid trapezoid = new Trapezoid();
        Rectangle rectangle = new Rectangle();
        Scanner kb = new Scanner(System.in);
        System.out.println("The quadrilateral you enter the details about should have side 'a'(x2-x1) PARALLEL to x axis");
        while(i!=0){
            System.out.println("Enter\n1.For Parallelogram\n2.For Trapezoid\n3.For Rectangle\n4.For Square\n5.To exit");
            a = kb.nextInt();
            switch(a) {
                case 1:
                    System.out.println("Enter third side 'c'(x3-x4) parallel to 'a' " +
                            "Enter x1,x2,x3,x4 respectively");
                    paralellogram.x1 = kb.nextFloat();
                    paralellogram.x2 = kb.nextFloat();
                    paralellogram.x3 = kb.nextFloat();
                    ;
                    paralellogram.x4 = kb.nextFloat();
                    System.out.println("Enter y1,y2,y3,y4 respectively");
                    paralellogram.y1 = kb.nextFloat();
                    paralellogram.y2 = kb.nextFloat();
                    paralellogram.y3 = kb.nextFloat();
                    ;
                    paralellogram.y4 = kb.nextFloat();
                    ;
                    if ((paralellogram.y2 == paralellogram.y1) && (paralellogram.y3 == paralellogram.y4) && (abs(paralellogram.x1 - paralellogram.x2) == abs(paralellogram.x3 - paralellogram.x4)) && (abs(paralellogram.y1 - paralellogram.y4) == abs(paralellogram.y2 - paralellogram.y3)))
                        paralellogram.area();
                    else
                        System.out.println("The entered quadrilateral doesn't qualify as a paralellogram");
                    break;
                case 2:
                    System.out.println("Enter third side 'c'(x3-x4) parallel to 'a' " +
                            "Enter x1,x2,x3,x4 respectively");
                    trapezoid.x1 = kb.nextFloat();
                    trapezoid.x2 = kb.nextFloat();
                    trapezoid.x3 = kb.nextFloat();
                    trapezoid.x4 = kb.nextFloat();
                    System.out.println("Enter y1,y2,y3,y4 respectively");
                    trapezoid.y1 = kb.nextFloat();
                    trapezoid.y2 = kb.nextFloat();
                    trapezoid.y3 = kb.nextFloat();
                    trapezoid.y4 = kb.nextFloat();
                    if( (trapezoid.y2 == trapezoid.y1) && (trapezoid.y3 == trapezoid.y4) && ( abs(trapezoid.y3 - trapezoid.y2) == abs(trapezoid.y1 - trapezoid.y4) ) )
                    trapezoid.area();
                    else
                    System.out.println("The entered quadrilateral doesn't qualify as a trapezoid");
                    break;
                case 3:
                    System.out.println("Enter third side 'c'(x3-x4) parallel to 'a' " +
                            "Enter x1,x2,x3,x4 respectively");
                    rectangle.x1 = kb.nextFloat();
                    rectangle.x2 = kb.nextFloat();
                    rectangle.x3 = kb.nextFloat();
                    rectangle.x4 = kb.nextFloat();
                    System.out.println("Enter y1,y2,y3,y4 respectively");
                    rectangle.y1 = kb.nextFloat();
                    rectangle.y2 = kb.nextFloat();
                    rectangle.y3 = kb.nextFloat();
                    rectangle.y4 = kb.nextFloat();
                    if((rectangle.y1==rectangle.y2)&&(rectangle.y3==rectangle.y4)&&(abs(rectangle.x1-rectangle.x2)==abs(rectangle.x3-rectangle.x4))&&(abs(rectangle.y1-rectangle.y4)==abs(rectangle.y2-rectangle.y3)))
                        rectangle.area();
                    else
                        System.out.println("The entered quadrilateral doesn't qualify as a rectangle");
                    break;
                case 4:
                    System.out.println("Enter third side 'c'(x3-x4) parallel to 'a' " +
                            "Enter x1,x2,x3,x4 respectively");
                    square.x1 = kb.nextFloat();
                    square.x2 = kb.nextFloat();
                    square.x3 = kb.nextFloat();
                    square.x4 = kb.nextFloat();
                    System.out.println("Enter y1,y2,y3,y4 respectively");
                    square.y1 = kb.nextFloat();
                    square.y2 = kb.nextFloat();
                    square.y3 = kb.nextFloat();
                    square.y4 = kb.nextFloat();
                    if((square.y1==square.y2)&&(square.y3==square.y4)&&(abs(square.x1-square.x2)==abs(square.y2-square.y3)))
                        square.area();
                    else
                        System.out.println("The entered quadrilateral doesn't qualify as a square");
                    break;
                case 5:
                    i=0;
                    break;
            }
        }
    }
}