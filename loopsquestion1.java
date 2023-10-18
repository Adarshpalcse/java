import java.util.Scanner;

public class loopsquestion1 {
    public static void main(String[] args) {
        int number;
        // find the number are even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>"+number);
        if(number%2==0){
            System.out.println("EVEN NUMBER ARE -->>"+number);
        }
        else{
            System.out.println("ODD NUMBER "+number);
        }
    }
}
