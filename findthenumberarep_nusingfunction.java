import java.util.Scanner;

public class findthenumberarep_nusingfunction {
    public static void p_n(int number) {
        if (number > 0) {
            System.out.println("THE ENTERED NUMBER ARE POSITIVE SO THE ENTERED NUMBER ARE -->>" + number);
        } else {
            System.out.println("THE ENTERED NUMBER ARE NEGATIVE SO THE ENTERED NUMBER ARE -->>" + number);
        }
        return;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + number);
        p_n(number);
    }  
}
