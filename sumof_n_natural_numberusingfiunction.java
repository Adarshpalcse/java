import java.util.Scanner;

public class sumof_n_natural_numberusingfiunction {
    public static void sum_n(int number) {
        int i, sum = 0;
        for (i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("THE N NATURAL NUMBER ARE -->>" + sum);
        return;

    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE  -->>" + number);
        sum_n(number);
    }
}
