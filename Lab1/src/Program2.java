import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        int i = 1, MAX= 10;
        int[] stack=new int[MAX];
        int top=-1;
        while (i==1)
        {
            System.out.println("What do you want to do to the stack?:(1.To push\t2.To pop\t3.To exit)");
            Scanner kb;
            kb = new Scanner(System.in);
            int a = kb.nextInt();
            switch (a)
            {
                case 1:

                    if(top > MAX)
                    {
                        System.out.println("Stack Overflow");
                    }

                    System.out.println("Enter the value you want to push:");
                    int b;
                    b = kb.nextInt();
                    top = top + 1;
                    stack[top]=b;
                    System.out.println("The modified stack is: ");
                    for(int j=0;j<=top; j++)
                    { System.out.print(stack[j] + " ");}
                    break;

                case 2:
                    if(top<0)
                        System.out.println("Nothing to pop");
                    else
                        {
                        int pop = stack[top--];
                        System.out.println("The popped element of the stack is" + pop);
                        System.out.println("The modified stack is: ");
                        for (int j = 0; j <= top; j++)
                        { System.out.print(stack[j] + " "); }
                     }

                    break;
                case 3:
                    i=0;
                    break;

                default:
                    System.out.println("Please enter a valid option");

            }
        }
        int[] queue = new int[10];
        int front = -1;
        int rear = -1;
        i=1;
        while (i==1)
        {
            System.out.println("What do you want to do to the queue?:(1.To enqueue\t2.To dequeue\t3.To exit)");
            Scanner kb;
            kb = new Scanner(System.in);
            int a = kb.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("Enter the value you want to enqueue:");
                    int b;
                    b = kb.nextInt();
                    if(front==-1 && rear==-1)
                    {
                        front++;
                        rear++;
                        queue[rear]=b;
                    }
                    else
                    {
                        queue[++rear]=b;
                    }
                    System.out.println("The modified queue is: ");
                    for(int j=front;j<=rear ; j++)
                        System.out.print(queue[j] + " ");
                    System.out.println("\n");
                    break;
                case 2:
                    if(front>=0 && front<=rear)
                    ++front;
                    System.out.println("The modified queue is: ");
                    for(int j=front;j<=rear ; j++)
                        System.out.print(queue[j] + " ");
                    System.out.println("\n");
                    break;
                case 3:
                    i=0;
                    break;
                default:
                    System.out.println("Please enter a valid option");

            }
        }
    }

}