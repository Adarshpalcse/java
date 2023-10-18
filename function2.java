import java.util.Scanner;

public class function2 {
    public static int s_u_m(int n1, int n2) {
        int sum1;
        sum1 = n1 + n2;
        return sum1;

    }

    public static void main(String[] args) {
        int number1, number2, sum2;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number1);
        System.out.println("ENTER ANY NUMBER 2 ARE -->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        sum2 = s_u_m(number1, number2);
        System.out.println("THE SUM OF TWO NUMBER ARE -->>" + sum2);

    }
}
