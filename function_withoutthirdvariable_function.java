import java.util.Scanner;

public class function_withoutthirdvariable_function {
    public static void s_w(int number1, int number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("THE SWAPPING OF TWO NUMBER ARE -->>" + number1 + " " + number2);
        return;
    }

    public static void main(String[] args) {
        int  number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 1 ARE -->>" + number1);
        System.out.println("ENTER ANY NUMBNER 2 ARE --->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        s_w(number1, number2);

    }
}
