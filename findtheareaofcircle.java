import java.util.Scanner;

public class findtheareaofcircle {
    public static void main(String[] args) {
        double area, pi, r;
        /// pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY R -->>");
        r = sc.nextDouble();
        area = (3.14) * r * r;
        System.out.println(area);
    }
}
