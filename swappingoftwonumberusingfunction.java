import java.util.Scanner;

public class swappingoftwonumberusingfunction {
    public static void swa_p(int number1, int number2) {
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("THE SWAPPING OF TWO NUMBER ARE -->>"+number1+" " +number2);
        return;
    }

    public static void main(String[] args) {
        int number1, number2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 1 ARE -->>" + number1);
        System.out.println("ENTER ANY NUMBER 2 ARE --->>");
        number2 = sc.nextInt();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        swa_p(number1, number2);
   
    }
}
