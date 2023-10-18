import java.util.Scanner;

public class simplecalculetorinjavausingswitchcase {
    public static void main(String[] args) {
        int op;
        double number1, number2, sum, sub, mal, div;
        Scanner sc = new Scanner(System.in);
        System.out.println(

                "ENTER ANY OPRETOR NUMBER ARE \n 1=sum of two number \n 2= subtrection of two number \n 3=maltiplication of two number \n 4=divsion of two number ");
        op = sc.nextInt();
        System.out.println("THE ENTERED OPRETOR ARE -->>" + op);
        System.out.println("ENTER ANY NUMBER 1 ARE -->>");
        number1 = sc.nextDouble();
        System.out.println("THE ENTERED NUMBER 1 ARE -->>" + number1);
        System.out.println("ENTER ANY NUMBER 2 ARE -->>");
        number2 = sc.nextDouble();
        System.out.println("THE ENTERED NUMBER 2 ARE -->>" + number2);
        switch (op) {
            case 1:
                sum = number1 + number2;
                System.out.println("sum =" + sum);
                break;
            case 2:
                sub = number1 - number2;
                System.out.println("sub =" + sub);
                break;
            case 3:
                mal = number1 * number2;
                System.out.println("mal =" + mal);
                break;
            case 4:
                div = number1 / number2;
                System.out.println("div =" + div);
                break;

            default:
                System.out.println("SORRY " + op);
                break;
        }

    }

}
