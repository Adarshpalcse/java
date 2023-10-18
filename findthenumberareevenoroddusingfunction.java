import java.util.Scanner;

public class findthenumberareevenoroddusingfunction {
    public static void e_o(int n1) {
        if(n1%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        return;
        
    }
    public static void main(String[] args) {
        int number,p1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->>");
        number=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>"+number);
        p1=e_o(number);
    }
}
