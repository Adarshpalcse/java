import java.util.Scanner;

public class finde_o {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);
        System.out.print((number % 2 == 0) ? System.out.println("EVEN") : System.out.println("ODD"));

        /// (number%2==0)?System.out.println("EVEN"):System.out.println("ODD");
    }
}
 