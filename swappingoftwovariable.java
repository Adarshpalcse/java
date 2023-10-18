import java.util.Scanner;

public class swappingoftwovariable {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY TWO NUMBER ARE -->>");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("THE ENTERED NUMBER  A AND B ARE -->>" + a + " " + b);
        a = a + b;
        b = a - b;
        b = a + b;
        System.out.println("SWAPPING OF TWO NUMBER ARE ---" + a + " " + b);
    }
}
+