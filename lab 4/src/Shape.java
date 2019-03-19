abstract class Shape {
    int a,b;
    abstract void printarea();
}

class circle extends Shape {
    @Override
    void printarea() {
        double area = 3.14 * a * a;
        System.out.println("The area of the circle is :" + area);
    }
}

class rectangle extends Shape {
    @Override
    void printarea() {
        int area = a * b;
        System.out.println("The area of the rectangle is :" + area);
    }
}

class triangle extends Shape{
    @Override
    void printarea(){
        double area = (a*b)/2.0;
        System.out.println("The area of the triangle is: " + area);
        }
}

class all {
    public static void main(String[] args) {

        rectangle r = new rectangle();
        r.a=5;
        r.b=4;
        circle c = new circle();
        c.a=5;
        triangle t = new triangle();
        t.a=5;
        t.b=4;

        r.printarea();
        c.printarea();
        t.printarea();
    }
}


