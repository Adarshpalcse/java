import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        int number, p1, p2;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY DIGITS ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);

        System.out.println("SO THE SUM OF DIGITS ARE ");
        while (number <= 0) {
            p1 = number % 10;
            p2 = number / 10;
            number++;
        }
       
    }
}
