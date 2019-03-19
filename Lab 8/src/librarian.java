import java.util.ArrayList;
import java.util.Scanner;

public class librarian {
    public static void main(String[] args) {
        int a=1,x,c,date=1,i,flagdel,flagfound,k;
        double fine = 0.0;
        String name;
        ArrayList<book> library = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        while(a==1)
        {
            System.out.println("What do you want to do:");
            System.out.println("1.Add book");
            System.out.println("2.Delete book");
            System.out.println("3.Isssue book");
            System.out.println("4.View all books");
            System.out.println("5.View issued books");
            System.out.println("6.Return book");
            System.out.println("7.Skip days");
            System.out.println("8.Exit");
            x=kb.nextInt();
            switch(x)
            {
                case 1:
                    kb.nextLine();
                    System.out.println("Enter the book's name:");
                    book b = new book();
                    b.name = kb.nextLine();
                    library.add(b);
                    for(i=0;i<library.size();i++)
                    {
                        System.out.println(i);
                        library.get(i).show();
                    }
                    break;
                case 2:
                    flagdel = 0;
                    kb.nextLine();
                    System.out.println("Enter the book's name:");
                    name = kb.nextLine();
                    for(i=0;i<library.size();i++)
                    {
                        if(name.compareTo(library.get(i).name)==0)
                        {
                            flagdel = 1;
                            library.remove(i);
                            System.out.println("Book removed.");
                            break;
                        }
                    }
                    if(flagdel==0)
                        System.out.println("No book found by the name. Couldn't delete.");
                    break;
                case 3:
                    kb.nextLine();
                    flagfound = 0;
                    book d = new book();
                    System.out.println("Enter the book's name:");
                    name = kb.nextLine();
                    for(i=0;i<library.size();i++)
                    {
                        if(name.compareTo(library.get(i).name)==0)
                        {
                            flagfound = 1;
                            d = library.get(i);
                            library.remove(i);
                        }
                    }
                    if(flagfound==0)
                    {
                        System.out.println("No book found by the name. Can't issue.");
                        break;
                    }
                    else
                    {
                        borrower B = new borrower();
                        System.out.println("Enter the borrower's name:");
                        B.name = kb.nextLine();
                        System.out.println("His/her e-mail ID:");
                        B.mailid = kb.nextLine();
                        System.out.println("Borrower type?:\n(Enter '0' if student or '1' if staff");
                        c = 5;
                        while(c!=0 && c!=1)
                        {
                            c = kb.nextInt();
                            System.out.println("Please enter correct borrower number");
                        }
                        if(c==0)
                            B.type = "student";
                        else if(c==1)
                            B.type = "staff";
                        B.limitset();
                        //(if) add in borrower arraylist
                        d.bor = B;
                        d.Settypeofbor();
                        d.Setdates(date);
                        d.issued = 1;
                        library.add(d);
                        break;
                    }
                case 4:
                    for(i=0;i<library.size();i++){
                        k = i+1;
                        System.out.println("Book no." + k);
                        library.get(i).show();
                    }
                    break;
                case 5:
                    for(i=0;i<library.size();i++){
                        k = i+1;
                        if(library.get(i).issued == 1) {
                            System.out.println("Issued book no." + k);
                            library.get(i).show();
                        }
                    }
                    break;
                case 6:
                    kb.nextLine();
                    book e = new book();
                    System.out.println("Enter the name of the book to return");
                    name = kb.nextLine();
                    flagfound = 0;
                    for(i=0;i<library.size();i++)
                    {
                        if(name.compareTo(library.get(i).name)==0)
                        {
                            flagfound = 1;
                            e = library.get(i);
                            library.remove(i);
                        }
                    }
                    if(flagfound==0)
                    {
                        System.out.println("No book found with the entered name. Can't return.");
                        break;
                    }
                    else if(flagfound == 1)
                    {
                        fine = e.calfine(date);
                        System.out.println("The amount of fine is " + fine + " $");
                        e.issued = 0;
                        e.issuedate = 0;
                        e.expdate = 0;
                        e.bor = null;
                        library.add(e);
                        break;
                    }
                case 7:
                    int skip;
                    System.out.println("Enter the number of days to skip:");
                    skip = kb.nextInt();
                    date= date + skip;
                    for(i=0;i<library.size();i++)
                    {
                        if(library.get(i).expdate<date && library.get(i).issued==1)
                        {
                            System.out.println("Issued warining to " + library.get(i).bor.name );
                            System.out.println("Number of days since expiry is " + (date - library.get(i).expdate));
                        }

                    }
                    break;
                default:
                    a=0;
                    break;
            }
        }
    }
}
