import java.util.Scanner;

public class fjunction_findthenumber_areeven_or_odd {
    public static void e_v(int number) {
        if (number % 2 == 0) {
            System.out.println("THE ENTERED NUMBER ARE EVEN -->>" + number);

        } else {
            System.out.println("THE ENTERED NUMBER ARE ODD SO THE ENTERED NUMBETR ARE -->>" + number);
        }
        return;

    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE ---->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE --->>" + number);
        e_v(number);
    }
}
