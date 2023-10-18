import java.util.Scanner;

public class swichcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("ENTER ANY YEAR -->>");
        year = sc.nextInt();
        System.out.println("THE ENTERED YEAR ARE -->>" + year);
        if (year % 400 == 0) {
            System.out.println("PRINT THE LEEP YEAR ->>" + year);
        } else if (year % 100 == 0) {
            System.out.println("NOT LEEP YEAR SO THE ENTERED YEAR ARE  " + year);

        } else if (year % 4 == 0) {
            System.out.println("LEEP YEAR SO THE ENTERED YEAR ARE -->>" + year);
        } else {
            System.out.println("SORRY ");
        }
    }
}
