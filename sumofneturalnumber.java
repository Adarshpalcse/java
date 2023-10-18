import java.util.Scanner;

public class sumofneturalnumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.err.println("THE ENTERED NUMBER ARE -->>" + number);
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
