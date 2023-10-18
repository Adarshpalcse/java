import java.util.Scanner;

public class swapping_of_two_number_not_usingthredvariable {
    public static void swap_p(int number1, int number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("THE SWAPPIMG OF TWO NUMBER ARE -->" + number1 + " " + number2);
        return;
    }

    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 1 ARE -->" + number1);
        System.out.println("ENTER ANY NUMBER 2 ARE -->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        swap_p(number1, number2);
    }
}
