import java.util.Scanner;

public class areaoftrectenge {
    public static void main(String[] args) {
        float a, b, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->");
        a = sc.nextFloat();
        b = sc.nextFloat();
        area = (a * b) / 2;
        System.out.println(area);
    }
}
