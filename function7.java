import java.util.Scanner;

public class function7 {
    public static void fact(int n) {
        // loops
        int factorial;
        factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        int number, n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);
        fact(number);
        //System.out.println("THE FACTORIAL OF THE ENTERED NUMBER ARE -->>"+n1);
                                                   
    }
}
