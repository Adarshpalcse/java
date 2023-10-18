import java.util.Scanner;

public class functipon4 {
    public static int m_u_l(int n1, int n2) {
        int m1;
        m1 = n1 * n2;
        return m1;
    }

    public static void main(String[] args) {
        int number1, number2, mal;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTETRED NUMBER ARE -->" + number1);
        System.out.println("ENTER ANY NUMBER 2 ARE -->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED 2 ARE -->>" + number2);
        mal = m_u_l(number1, number2);
        System.out.println("THE MALTIPLICATION OF TWO NUMBER ARE -->>" + mal);

    }
}
