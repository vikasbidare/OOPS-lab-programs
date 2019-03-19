import java.util.Scanner;

public class calculator {
    void add(int a, int b) {
        int c = a + b;
        System.out.println("The calculated value 'num1 + num2' is " + c);
    }

    void sub(int a, int b) {
        int c = a - b;
        System.out.println("The calculated value 'num1 - num2' is " + c);
    }

    void mul(int a, int b) {
        int c = a * b;
        System.out.println("The calculated value 'num1 * num2' is " + c);
    }

    void div(int a, int b) {
        float c = (float) a / b;
        System.out.println("The calculated value 'num1 / num2' is " + c);
    }

    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter number 1:");
        Scanner kb = new Scanner(System.in);
        x = kb.nextInt();
        System.out.println("Enter number 2:");
        y = kb.nextInt();
        System.out.println("Enter the operator:(+,-,*,/)");
        char a = kb.next().charAt(0);
        calculator s = new calculator();
        if(a=='+')
            s.add(x,y);
        else if(a=='-')
            s.sub(x,y);
        else if(a=='*')
            s.mul(x,y);
        else if(a=='/')
            s.div(x,y);
        else
            System.out.println("Valid operator not entered");
        }
    }
