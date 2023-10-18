import java.util.Scanner;

public class function8 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number = sc.nextInt();
        System.out.println("THE ENTERED NUMBEFR ARE -->>" + number);
        int fact = 1, i;
        for (i = number; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("THE FACTORIUAL OF THE ENTETRD NUMBER ARE -->>" + fact);
    }

}
