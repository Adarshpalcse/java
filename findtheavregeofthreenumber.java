import java.util.Scanner;

public class findtheavregeofthreenumber {
    public static void main(String[] args) {
        double number1, number2, number3, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NUMBER ARE -->>");
        number1 = sc.nextDouble();
        System.out.println("THE ENTETRED YOUR FIRST SALARY ARE -->>" + number1);
        System.out.println("ENTER YOUR SECOND  NUMBER ARE -->>");
        number2 = sc.nextDouble();
        System.out.println("THE ENTETRED YOUR SALARY  SALARY ARE -->>" + number2);
        System.out.println("ENTER YOUR THORD NUMBER ARE -->>");
        number3 = sc.nextDouble();
        System.out.println("THE ENTETRED YOUR THORD  SALARY ARE -->>" + number3);
        System.out.println("YOUR AVREGE OF THREE NUMBETR ARE -->>");
        avg = (number1 + number2 + number3) / 3;
        System.out.println("AVREGFE  NUMBER ARE -->>" + avg);

    }
}
