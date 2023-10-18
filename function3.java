import java.util.Scanner;

public class function3 {
    public static int s_u_b(int n1, int n2) {
        int sub1;
        sub1 = n1 - n2;
        return sub1;

    }

    public static void main(String[] args) {
        int number1, number2, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER -->");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 1 ARE -->>" + number1);

        System.out.println("ENTER ANY NUMBER -->");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        a = s_u_b(number1, number2);
        System.out.println("THE SUBTRECTION OF TWO NUMBER ARE -->>" + a);

    }
}
