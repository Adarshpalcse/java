import java.util.Scanner;

public class ordernumber {
    public static void main(String[] args) {
        int number,rot;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER -->");
        number=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>");
        System.out.println("ENTER ROTETION ORDER");
        rot=sc.nextInt();
        System.out.println("THE ENTERED ROTETION ORDER ARE -->>"+rot);
       System.out.println(Math.pow(rot, number));

    }
}
                                                        