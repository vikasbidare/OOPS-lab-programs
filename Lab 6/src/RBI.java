import java.util.ArrayList;
import java.util.Scanner;

public class RBI {
    double minrate = 8;
    double rate;
    double maxlimit;
    double minbalance;
    void showBalance(){
        System.out.println("SHOW BALANCE");
    }
}

class account {
    String holder;
    double balance;
}

class SBI extends RBI{
    ArrayList<account> accountArrayList = new ArrayList<>();
    @Override
    void showBalance(){
        int i;
        if(accountArrayList.isEmpty())
            System.out.println("There are no accounts in the bank");
        else
            for(i=0;i<accountArrayList.size();i++)
                System.out.println("The balance of " + accountArrayList.get(i).holder + " is Rs." + accountArrayList.get(i).balance);

    }
}

class ICICI extends RBI{
    ArrayList<account> accountArrayList = new ArrayList<>();
    @Override
    void showBalance(){
        int i;
        if(accountArrayList.isEmpty())
            System.out.println("There are no accounts in the bank");
        else
            for(i=0;i<accountArrayList.size();i++)
                System.out.println("The balance of " + accountArrayList.get(i).holder + " is Rs." + accountArrayList.get(i).balance);

    }

}

class CANARA extends RBI{
    ArrayList<account> accountArrayList = new ArrayList<>();
    @Override
    void showBalance(){
        int i;
        if(accountArrayList.isEmpty())
            System.out.println("There are no accounts in the bank");
        else
            for(i=0;i<accountArrayList.size();i++)
                System.out.println("The balance of " + accountArrayList.get(i).holder + " is Rs." + accountArrayList.get(i).balance);

    }
}

class rbimain{

    public static void main(String[] args){
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        CANARA canara = new CANARA();
        account acc = new account();
        int i=1,a;
        double b;
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter SBI Interest rate:");
        sbi.rate = kb.nextDouble();
        while (sbi.rate<sbi.minrate)
        {
            System.out.println("The entered rate of interest is invalid. Please enter a value >8.00");
            sbi.rate = kb.nextDouble();
        }
        System.out.println("SBI max. transaction limit:");
        sbi.maxlimit = kb.nextDouble();
        System.out.println("SBI min. balance");
        sbi.minbalance = kb.nextDouble();

        System.out.println("Enter ICICI Interest rate:");
        icici.rate = kb.nextDouble();
        while (icici.rate<icici.minrate)
        {
            System.out.println("The entered rate of interest is invalid. Please enter a value >8.00");
            icici.rate = kb.nextDouble();
        }
        System.out.println("ICICI max. transaction limit:");
        icici.maxlimit = kb.nextDouble();
        System.out.println("ICICI min. balance");
        icici.minbalance = kb.nextDouble();

        System.out.println("Enter CANARA Interest rate:");
        canara.rate = kb.nextDouble();
        while (canara.rate<canara.minrate)
        {
            System.out.println("The entered rate of interest is invalid. Please enter a value >8.00");
            canara.rate = kb.nextDouble();
        }
        System.out.println("CANARA max. transaction limit:");
        canara.maxlimit = kb.nextDouble();
        System.out.println("CANARA min. balance");
        canara.minbalance = kb.nextDouble();
        while(i==1)
        {
            System.out.println("Enter\n1.To enter SBI account\n2.To enter ICICI account\n3.To enter CANARA account\nAny other no. to stop entering");
            a = kb.nextInt();
            if(a==1)
            {
                kb.nextLine();
                System.out.println("Enter the Account holder's name");
                acc.holder = kb.nextLine();
                System.out.println("Enter the deposit:");
                b = kb.nextDouble();
                acc.balance += b;
                while (sbi.minbalance > acc.balance){
                    System.out.println("The balance is lesser than min. balance. Deposit some more.Enter the deposit:");
                    b = kb.nextDouble();
                    acc.balance += b;
                }
                sbi.accountArrayList.add(acc);
            }
            else if(a==2)
            {
                kb.nextLine();
                System.out.println("Enter the Account holder's name");
                acc.holder = kb.nextLine();
                System.out.println("Enter the deposit:");
                b = kb.nextDouble();
                acc.balance += b;
                while (icici.minbalance > acc.balance){
                    System.out.println("The balance is lesser than min. balance. Deposit some more.Enter the deposit:");
                    b = kb.nextDouble();
                    acc.balance += b;
                }
                icici.accountArrayList.add(acc);
            }
            else if(a==3)
            {
                kb.nextLine();
                System.out.println("Enter the Account holder's name");
                acc.holder = kb.nextLine();
                System.out.println("Enter the deposit:");
                b = kb.nextDouble();
                acc.balance += b;
                while (canara.minbalance > acc.balance){
                    System.out.println("The balance is lesser than min. balance. Deposit some more.Enter the deposit:");
                    b = kb.nextDouble();
                    acc.balance += b;
                }
                icici.accountArrayList.add(acc);
            }
            else
            {
                i=0;
                break;
            }
        }
        System.out.println("The accounts in SBI are:");
        sbi.showBalance();
        System.out.println("The accounts in ICICI are:");
        icici.showBalance();
        System.out.println("The accounts in CANARA are:");
        canara.showBalance();
    }
}