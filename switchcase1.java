import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {
        String day_name;
        int day_number;

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY DAY NUMBER   -->>1-7");

        System.out.println(" 1-->> SUNDAY ");
        System.out.println("2--->> MONDAY");
        System.out.println("3-->> TUESDAY ");
        System.out.println("4 -->> WEDNESDAY");
        System.out.println("5-->> THURSDAY");
        System.out.println("6 -->> FRIDAY");
        System.out.println("7 -->> SATURDAY");
        day_number = sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>" + day_number);
        switch (day_number) {
            case 1:
                System.out.println(
                        "THE ENTERED NUMBER ARE THE PRINT THE  SUNDAY  AND THE ENTERED NUMBER ARE -->>" + day_number);
                break;
            case 2:
                System.out.println(
                        "THE ENTERED NUMBER ARE THE PRINT THE MONDAY SO THE ENTERED NUMBER ARE -->>> " + day_number);
                break;
            case 4:
                System.out.println(
                        "THE ENTERE NUMBER ARE THE PRINT THE TUESDAY SO THE ENTERED NUMBER ARE == " + day_number);
                break;
            case 5:
                System.out.println(
                        "THE ENTERED DAY NUMBER ARE AND THE PRINT THE WEDNESDAY SO THE ENTETRED NUMBER ARE -->>"
                                + day_number);
                break;
            case 6:
                System.out.println("THE ENTERED DAY NUMBER ARE FRIDAY SO THE ENTERED NUMBER ARE -->>" + day_number);
                break;
            case 7:
                System.out.println(
                        "THE ENTERED DAY NUMBER ARE PRINT THE SATURDAY SO THE ENTERED NUMBER ARE -->>" + day_number);
                break;

            default:
                System.out.println("SORRY " + day_number);

        }

    }
}
