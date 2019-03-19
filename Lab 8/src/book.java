public class book {
    public String name;
    public borrower bor;
    public int issued = 0;
    public int issuedate;
    public int typeofbor;
    public int expdate;
    public void Settypeofbor(){
        if(bor.type.compareTo("student")==0)
            typeofbor = 0;
        else if(bor.type.compareTo("staff")==0)
            typeofbor = 1;
    }
    public void Setdates(int date){
        issuedate = date;
        if(typeofbor == 0)
            expdate = date + 15;
        else if(typeofbor == 1)
            expdate = date +30;
    }
    public double calfine(int date){
        double cost = 0.0;
        if(date<expdate)
          cost=0.0;
        else
        {
            if(date > (expdate + 7))
            {
               cost = 7*(2.5);
               expdate = date - (expdate + 7);
               cost += expdate*5.0;
            }
            else if(date <= (expdate + 7))
            {
                cost = 2.5 * (date - expdate);
            }
        }
        return (cost);
    }
    public void issueshow(){
        System.out.println("The details of the book are:");
        System.out.println("Book name: " + name);
        System.out.println("Issued to: " + bor.name);
        System.out.println("e-mail ID: " + bor.mailid);
    }
    public void show(){
        System.out.println("Name: " + name);
    }
}
