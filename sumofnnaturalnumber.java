import java.util.Scanner;

public class sumofnnaturalnumber {
    public static void main(String[] args) {
        int number, sum = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);
        for (i = 1; i <= number; i++) {
            sum = sum + i;

        }
        System.out.println("THE N NATURAL NUMBER ARE -->>" + sum);
    }
}
