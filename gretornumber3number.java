import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class gretornumber3number {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY THEREEE NUMBER ARE -->>");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("numbefr 1 are garetor " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("THE ENTERED NUMBER ARE NUMBER 2 ARE GARETORO SO THE ENTERED NUMBER ARE -->>" + number2);
        } else {
            System.out.println("THE ENTERED NUMBER THEORD NUMBER ARE GARETOR SO THE ENTERED NUMBER ARE -->>" + number3);
        }
    }
}
