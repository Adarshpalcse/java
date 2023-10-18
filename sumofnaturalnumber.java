import java.util.Scanner;

public class sumofnaturalnumber {
    public static void main(String[] args) {
        int number,sum=0;;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER -->>");
        number=sc.nextInt();
        System.out.println("THE ENTERED NUMBER ARE -->>"+number);
        for(int i=1;i<=number;i++){
           //// int sum=0;
            sum=sum+i*i;
        }
        System.out.println(sum);
    }
}
 