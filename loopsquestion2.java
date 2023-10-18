import java.util.Scanner;

public class loopsquestion2 {
    public static void main(String[] args) {
        int number, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();  
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}
