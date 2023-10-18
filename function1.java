import java.util.Scanner;

public class function1 {
    public static void my_name(String name) {
        System.out.println(name);
        return;

    }

    public static void main(String[] args) {
        String name, name1;
        Scanner sc = new Scanner(System.in);
        // print the my name
        System.out.println("ENTER YOUR NAME -->>");
        name = sc.nextLine();
        System.out.println("THE ENTERED NAME IS -->>" + name);
        my_name(name);

    }
}
