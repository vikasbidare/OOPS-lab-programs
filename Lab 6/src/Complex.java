import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;

    void input(int a,int b){
        real = a;
        imaginary = b;
    }

    void show(){
        String s = new String();
        s = real + " + " + imaginary + "i ";
        System.out.println("The Complex number is: " + s);
    }
}

class complxmain{

    static Complex Add(Complex c1, Complex c2){
        Complex obj = new Complex();
        obj.real = c1.real + c2.real ;
        obj.imaginary = c1.imaginary + c2.imaginary ;
        return obj;
    }

    static Complex Add(Complex c1, Complex c2, Complex c3){
        Complex obj = new Complex();
        obj.real = c1.real + c2.real + c3.real ;
        obj.imaginary = c1.imaginary + c2.imaginary + c3.imaginary;
        return obj;
    }
    public static void main(String[] args) {
        int a,b;
        Complex cmplx1 = new Complex();
        Complex cmplx2 = new Complex();
        Complex cmplx3 = new Complex();
        Complex outpt = new Complex();
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        Scanner kb = new Scanner(System.in);
        a = kb.nextInt();
        b = kb.nextInt();
        cmplx1.input(a,b);
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        a = kb.nextInt();
        b = kb.nextInt();
        cmplx2.input(a,b);
        System.out.println("Enter the real and imaginary parts of the third complex number:");
        a = kb.nextInt();
        b = kb.nextInt();
        cmplx3.input(a,b);
        System.out.println("Now,we Add first two complex numbers: ");
        outpt = Add(cmplx1,cmplx2);
        outpt.show();
        System.out.println("Now,we add all the three complex numbers: ");
        outpt = Add(cmplx1,cmplx2,cmplx3);
        outpt.show();
    }
}