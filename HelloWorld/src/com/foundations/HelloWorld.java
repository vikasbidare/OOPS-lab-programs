package com.foundations;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Yo!!!");
        int Num;
        Num = 5;
        System.out.println("The number is " + Num);
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number:");
        Num = kb.nextInt();
        System.out.println(Num);

        String s = JOptionPane.showInputDialog("Enter the number: ");
        Num=Integer.parseInt(s);
        JOptionPane.showMessageDialog(null,Num);
        kb.nextLine();
        //System.out.println("Enter name1");
        //String n1 = kb.nextLine();
        //System.out.println("Enter name2");
        //String n2 = kb.nextLine();
        //if(n1.compareTo(n2)==0)
        //{
        //    System.out.println("Both the names are exactly the same!");
        //}
        //PrintWriter outputfile = new PrintWriter("Output.txt");

        //outputfile.println("Hey,bruv!(1)");
        //outputfile.println("Hey,bruv!(2)");
        //outputfile.println("Hey,bruv!(3)");

        //outputfile.close();

        System.exit(0);


    }
}

