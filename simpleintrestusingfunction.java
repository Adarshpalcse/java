import java.util.Scanner;

public class simpleintrestusingfunction {
    public static void s_i(double p ,double t ,double r) {
        double s_i;
        s_i=(p*r*t)/100;
        System.out.println("THE CALUCLETION OF SIMPLE INTREST ARE --->>"+s_i);
        return ;

        
    }
    public static void main(String[] args) {
        // formula of simple intrest 
        // s_i=(p*r*t)/100
        double p,r,t,s_i;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY VALUES IN P -->>");
        p=sc.nextDouble();
        System.out.println("THE ENTERED VALUES OF P -->>"+p);
        System.out.println("ENTER ANY VALUES OF T --->>");
        t=sc.nextDouble();
        System.out.println("THE ENTERD VALUES OF T ARE -->>"+t);
        System.out.println("ENTER ANY VALUES OF R --->>");
        r=sc.nextDouble();
        System.out.println("THE ENTERED VALUES OF R ARE -->>"+r);
        s_i(p, t, r);


    }
}
