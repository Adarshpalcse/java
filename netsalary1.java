import java.util.Scanner;

public class netsalary1 {
    public static void main(String[] args) {
        double hra,bs,ta,da,pf=1500,net_s;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR SALARY -->>");
        bs=sc.nextDouble();



        System.out.println("THE ENTERED YOUR SALARY ARE -->>"+bs);
        hra=(bs*30)/100;
        System.out.println("HRA SALARY ARE -->>"+hra);
        ta=(bs*20)/100;
        System.out.println(ta);
        da=(bs*10)/100;
        System.out.println(da);
        net_s=((bs+hra+da+ta)-pf);
        System.out.println("YOUR NET SALARY ARE =="+net_s);
        


    }
}
