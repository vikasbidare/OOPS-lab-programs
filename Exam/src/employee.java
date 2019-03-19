import java.util.Scanner;

public class employee {
    String first;
    String last;
    int id;
    String join_date;
    employee(){
        first="";
        last="";
        id=0;
        join_date="";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }
    public static class HourlyEmployee extends employee{
        int hours;
        double payperhour;

        HourlyEmployee(){
            hours=0;
            payperhour=0.0;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public double getPayperhour() {
            return payperhour;
        }

        public void setPayperhour(double payperhour) {
            this.payperhour = payperhour;
        }
    }
    public static class SalariedEmployee extends employee{
        double paypermonth;
        double overtimepay;
        double bonusamount;
        SalariedEmployee(){
            paypermonth=0.0;
            overtimepay=0.0;
            bonusamount=0.0;
        }

        public double getPaypermonth() {
            return paypermonth;
        }

        public void setPaypermonth(double paypermonth) {
            this.paypermonth = paypermonth;
        }

        public double getOvertimepay() {
            return overtimepay;
        }

        public void setOvertimepay(double overtimepay) {
            this.overtimepay = overtimepay;
        }

        public double getBonusamount() {
            return bonusamount;
        }
        double grossamount(){
            return bonusamount+overtimepay+paypermonth;
        }
    }
    public static class developer extends SalariedEmployee{
        String departmentid;
        String departmentdetail;
        developer(){
            departmentdetail="";
            departmentid="";
        }


        void dispdetails() {
            System.out.println(first);
            System.out.println(last);
            System.out.println(departmentid);
            System.out.println(grossamount());
        }

        public String getDepartmentid() {
            return departmentid;
        }

        public void setDepartmentid(String departmentid) {
            this.departmentid = departmentid;
        }

        public String getDepartmentdetail() {
            return departmentdetail;
        }

        public void setDepartmentdetail(String departmentdetail) {
            this.departmentdetail = departmentdetail;
        }
    }
    public static class researcher extends SalariedEmployee{
        String departmentid;
        String departmentdetail;
        researcher(){
            departmentid="";
            departmentdetail="";
        }

        void dispdetails() {
            System.out.println(first);
            System.out.println(last);
            System.out.println(departmentid);
            System.out.println(grossamount());
        }

        public String getDepartmentid() {
            return departmentid;
        }

        public void setDepartmentid(String departmentid) {
            this.departmentid = departmentid;
        }

        public String getDepartmentdetail() {
            return departmentdetail;
        }

        public void setDepartmentdetail(String departmentdetail) {
            this.departmentdetail = departmentdetail;
        }
    }
    public static class executives extends SalariedEmployee{
        String departmentid;
        String departmentdetail;
        executives(){
            departmentid="";
            departmentdetail="";
        }

        void dispdetails() {
            System.out.println(first);
            System.out.println(last);
            System.out.println(departmentid);
            System.out.println(grossamount());
        }

        public String getDepartmentid() {
            return departmentid;
        }

        public void setDepartmentid(String departmentid) {
            this.departmentid = departmentid;
        }

        public String getDepartmentdetail() {
            return departmentdetail;
        }

        public void setDepartmentdetail(String departmentdetail) {
            this.departmentdetail = departmentdetail;
        }
    }

        public static  void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i, j, k, l, n, x, y;double gd=0,gr=0,ge=0;
            String g;
            double h;
            System.out.println("enter the total hourly employees");
            n = scan.nextInt();
            scan.nextLine();
            HourlyEmployee[] he = new HourlyEmployee[n];
            for (i = 0; i < n; i++) {
               he[i]=new HourlyEmployee();

            }
            for (i = 0; i < n; i++) {
                System.out.println("enter the first name of employee ");
                String d;
                d=scan.nextLine();
                he[i].first=d;
                System.out.println("enter the last name of employee ");
                d=scan.nextLine();
                he[i].last=d;
                System.out.println("enter the employee id");
                x=scan.nextInt();
                scan.nextLine();
                he[i].id=x;
                System.out.println("enter the join year of employee ");
                d=scan.nextLine();
                he[i].join_date=d;
                System.out.println("enter the number of hours");
                x=scan.nextInt();
                scan.nextLine();
                he[i].hours=x;
                System.out.println("enter the payper hour");
                double q=scan.nextDouble();
                scan.nextLine();
                he[i].payperhour=q;
            }
            int h_no=n;
            System.out.println("enter the total number of salaried employees who are developers  ");
            n=scan.nextInt();
            scan.nextLine();
            int d_no=n;
            developer[] ds=new developer[n+1];
            for(i=0;i<n+1;i++)
            {
                ds[i]=new developer();
            }
            for(i=0;i<n;i++)
            {
                System.out.println("enter the first name of the employee");

                g=scan.nextLine();
                ds[i].first=g;
                System.out.println("enter the last name of the employee");
                g=scan.nextLine();
                ds[i].last=g;
                System.out.println("enter the id of the employee");
                x=scan.nextInt();
                scan.nextLine();
                ds[i].id=x;
                System.out.println("enter the join date of the employee");
                g=scan.nextLine();
                ds[i].join_date=g;
                System.out.println("enter the pay per  month of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                ds[i].paypermonth=h;
                System.out.println("enter the overtime pay of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                ds[i].overtimepay=h;
                System.out.println("enter the bonus amount of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                ds[i].bonusamount=h;
                System.out.println("enter the department id of the employee");
                g=scan.nextLine();
                ds[i].departmentid=g;
                System.out.println("enter vthe department detail of the employee");
                g=scan.nextLine();
                ds[i].departmentdetail=g;
                System.out.println("the gross amount is"+ds[i].grossamount());
                gd+=ds[i].grossamount();
            }
            System.out.println("enter the total number of salaried employees who are researchers  ");
            n=scan.nextInt();
            scan.nextLine();
            int r_no=n;
            researcher[] rs=new researcher[n+1];
            for(i=0;i<n+1;i++)
            {
                rs[i]=new researcher();
            }
            for(i=0;i<n;i++)
            {
                System.out.println("enter the first name of the employee");

                g=scan.nextLine();
                rs[i].first=g;
                System.out.println("enter the last name of the employee");
                g=scan.nextLine();
                ds[i].last=g;
                System.out.println("enter the id of the employee");
                x=scan.nextInt();
                scan.nextLine();
                rs[i].id=x;
                System.out.println("enter the join date of the employee");
                g=scan.nextLine();
                rs[i].join_date=g;
                System.out.println("enter the pay per  month of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                rs[i].paypermonth=h;
                System.out.println("enter the overtime pay of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                rs[i].overtimepay=h;
                System.out.println("enter the bonus amount of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                rs[i].bonusamount=h;
                System.out.println("enter the department id of the employee");
                g=scan.nextLine();
                rs[i].departmentid=g;
                System.out.println("enter vthe department detail of the employee");
                g=scan.nextLine();
                rs[i].departmentdetail=g;
                System.out.println("the gross amount is"+rs[i].grossamount());
                gr+=rs[i].grossamount();
            }
            System.out.println("enter the total number of salaried employees who are executives  ");
            n=scan.nextInt();
            scan.nextLine();
            int e_no=n;
            executives[] es=new executives[n+1];
            for(i=0;i<n+1;i++)
            {
                es[i]=new  executives();
            }
            for(i=0;i<n;i++)
            {
                System.out.println("enter the first name of the employee");

                g=scan.nextLine();
                es[i].first=g;
                System.out.println("enter the last name of the employee");
                g=scan.nextLine();
                es[i].last=g;
                System.out.println("enter the id of the employee");
                x=scan.nextInt();
                scan.nextLine();
                es[i].id=x;
                System.out.println("enter the join date of the employee");
                g=scan.nextLine();
                es[i].join_date=g;
                System.out.println("enter the pay per  month of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                es[i].paypermonth=h;
                System.out.println("enter the overtime pay of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                es[i].overtimepay=h;
                System.out.println("enter the bonus amount of the employee");
                h=scan.nextDouble();
                scan.nextLine();
                es[i].bonusamount=h;
                System.out.println("enter the department id of the employee");
                g=scan.nextLine();
                es[i].departmentid=g;
                System.out.println("enter the department detail of the employee");
                g=scan.nextLine();
                es[i].departmentdetail=g;
                System.out.println("the gross amount is"+es[i].grossamount());
                ge+=es[i].grossamount();
            }
            System.out.println("the employee details according to experience sorting for developers");
            for(i=0;i<d_no-1;i++){
                for(j=1;j<d_no;j++)
                {
                    if((ds[j].join_date).compareTo(ds[i].join_date)<0)
                    {
                        ds[d_no]=ds[i];
                        ds[i]=ds[j];
                        ds[j]=ds[d_no];
                    }
                }
            }
            for(i=0;i<d_no;i++){
                System.out.println("details of employee "+(i+1));
                ds[i].dispdetails();
            }
            System.out.println("the employee details according to experience sorting for researchers");
            for(i=0;i<r_no-1;i++){
                for(j=1;j<r_no;j++)
                {
                    if((rs[j].join_date).compareTo(rs[i].join_date)<0)
                    {
                        rs[r_no]=rs[i];
                        rs[i]=rs[j];
                        rs[j]=rs[r_no];
                    }
                }
            }
            for(i=0;i<r_no;i++){
                System.out.println("details of employee "+(i+1));
                rs[i].dispdetails();
            }
            System.out.println("the employee details according to experience sorting for employees");
            for(i=0;i<e_no-1;i++){
                for(j=1;j<e_no;j++)
                {
                    if((es[j].join_date).compareTo(es[i].join_date)<0)
                    {
                        es[e_no]=es[i];
                        es[i]=es[j];
                        es[j]=es[e_no];
                    }
                }
            }
            for(i=0;i<e_no;i++){
                System.out.println("details of employee "+(i+1));
                es[i].dispdetails();
            }
            ge=ge/e_no;
            gd=gd/d_no;
            gr=gr/r_no;
            int o;
            if(gd>=gr){
                if(gd>=ge){
                    o=1;
                }
                else
                    o=3;
            }
            else
            {
                if(gr>=ge)
                    o=2;
                else
                    o=3;
            }
            if(o==1){
                System.out.println("the developer class has highest avg gross salary");
                for(i=0;i<d_no-1;i++)
                {
                    for(j=1;j<d_no;j++){
                        if(ds[i].grossamount()>ds[j].grossamount()){
                            ds[d_no]=ds[i];
                            ds[i]=ds[j];
                            ds[j]=ds[d_no];
                        }
                    }
                }
                for(i=0;i<d_no;i++)
                {
                    System.out.println("THE DETAILS OF "+(i+1)+"th employee in developers according to gross salary ");
                    System.out.println(ds[i].first);
                    System.out.println(ds[i].last);
                    System.out.println(ds[i].departmentid);
                    System.out.println(ds[i].grossamount());
                }

            }
            else if(o==2){
                System.out.println("the researcher class has highest avg gross salary");
                for(i=0;i<r_no-1;i++)
                {
                    for(j=1;j<r_no;j++){
                        if(rs[i].grossamount()>rs[j].grossamount()){
                            rs[r_no]=rs[i];
                            rs[i]=rs[j];
                            rs[j]=rs[r_no];
                        }
                    }
                }
                for(i=0;i<r_no;i++)
                {
                    System.out.println("THE DETAILS OF "+(i+1)+"th employee in researchers according to gross salary ");
                    System.out.println(rs[i].first);
                    System.out.println(rs[i].last);
                    System.out.println(rs[i].departmentid);
                    System.out.println(rs[i].grossamount());
                }
            }
            else{
                System.out.println("the executives  class has highest avg gross salary");
                for(i=0;i<e_no-1;i++)
                {
                    for(j=1;j<e_no;j++){
                        if(es[i].grossamount()>es[j].grossamount()){
                            es[e_no]=es[i];
                            es[i]=es[j];
                            es[j]=es[e_no];
                        }
                    }
                }
                for(i=0;i<e_no;i++)
                {
                    System.out.println("THE DETAILS OF "+(i+1)+"th employee in executives according to gross salary ");
                    System.out.println(es[i].first);
                    System.out.println(es[i].last);
                    System.out.println(es[i].departmentid);
                    System.out.println(es[i].grossamount());
                }
            }
            for(i=0;i<e_no;i++)
            {
                double r=es[i].grossamount();
                System.out.println("the yearly salary of employee "+(i+1)+"  is  "+  (r+0.1)*12);
            }
        }

    }

