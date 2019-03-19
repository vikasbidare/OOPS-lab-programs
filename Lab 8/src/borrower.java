public class borrower {
    public String type;
    public String name;
    public String mailid;
    public int bookct;
    public int booklimit;
    public void limitset(){
        if(type.compareTo("student")==0)
        {
            booklimit = 5;
        } else if(type.compareTo("staff")==0)
        {
            booklimit = 10;
        }
    }
}
