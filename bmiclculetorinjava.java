import java.util.Scanner;

public class bmiclculetorinjava {
    public static void main(String[] args) {
        double  uesr_w,height;
        String uesr_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER UESR NAME -->>");
        uesr_name=sc.nextLine();
        System.out.println("THE ENTERED USER NAME ARE -->>"+uesr_name);
        System.out.println("ENTER ANY USER WEIGHT ARE -->>");
        uesr_w=sc.nextDouble();
        System.out.println("THE ENTERED WEIGHT  I N KILOGRAM -->>"+uesr_w);
        System.out.println("ENTER UESR HEIGHT :");
        height=sc.nextDouble();
        System.out.println("THE ENTERED HEIGHT ARE ::"+height);
        // 1kilometerr =1000metter 

    }
}
