import java.util.Scanner;

public class tareficlight {
    public static void main(String[] args) {
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY TREFIC LIGHT CHARECTER \n R= RED \n  Y= YELLOW \n G=GREEN");
        ch = sc.nextLine();
        System.out.println("THE ENTERED USER CHRECTER ARE -->>" + ch);
        switch (ch) {
            case "R":
                System.out.println("RED");
                break;
            case "Y":
                System.out.println("YELLOW");
                break;
            case "G":
                System.out.println("GREEN ");
                break;
            default:
                System.out.println("SORRY");
                break;

        }
    }
}
