import java.util.Scanner;

public class netsalaryoneemplyee {
    public static void main(String[] args) {
        double user_sal,hra,da,ta,net_salary,pf=1500.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER UESR SALARY ARE -->>");
        user_sal=sc.nextDouble();
        System.out.println("THE ENTERED USER SALARY ARE -->>"+user_sal);
        //30%=30/100
        /* 
         30 % basic salary ==>>(base_salary+30)/100; 
         pf are fid
         */
        hra=(user_sal*30)/100;
        ta=(user_sal*20)/100;
        da=(user_sal*10)/100;
        System.out.println(" HRA :="+hra+"DA :"+" "+da+"TA :"+" "+ta);
        net_salary=(user_sal+hra+ta+da)-pf;
        System.out.println("USER NET SALARY ARE -->> "+net_salary);
    }
}
