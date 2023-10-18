import java.util.Scanner;

public class function5 {
    public static int s_u_m(int n1, int n2) {
        int s1;
        s1 = n1 + n2;
        return s1;
    }

    public static int s_u_b(int n1, int n2) {
        int s2;
        s2 = n1 - n2;
        return s2;
    }

    public static int m_u_l(int n1, int n2) {
        int s3;
        s3 = n1 * n2;
        return s3;
    }

    public static int d_i_v(int n1, int n2) {
        int s4;
        s4 = n1 / n2;
        return s4;
    }

    public static void main(String[] args) {
        int number1, number2, mal, sum, sub, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER1 ARE -->>" + number1);
        System.out.println("ENTER ANY NUMBER2 ARE -->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER2 ARE -->>" + number2);
        mal = m_u_l(number1, number2);
        div = d_i_v(number1, number2);
        sum = s_u_b(number1, number2);
        sub = s_u_b(number1, number2);
        System.out.println("the sum of two number are -->>" + sum);
        System.out.println("THE SUBTRECTION OF TWO NUMBER ARE -->>" + sub);
        System.out.println("THE MALTIP[LICATION OF TRWO NUMBER ARE --->>" + mal);
        System.out.println("THE DIVISION OF TWO NUMBER ARE --->>" + div);

    }
}
