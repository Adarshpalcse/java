import java.util.Scanner;

public class additionoftwonumber {
    public static void main(String[] args) {
        int number1,number2,sum;
        Scanner sc = new Scanner( System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number1=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>"+number1);
         System.out.println("ENTER ANY NUMBER ARE -->>");
        number2=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>"+number2);
        sum=number1+number2;
        System.out.println("THE ADDITION OF TWO NUMBER ARE -->>"+sum);

    }
}
