import java.util.Scanner;

public class findthenumberareevenorodd0 {
    public static void main(String[] args) {
        int number;

Scanner sc=new Scanner(System.in);
       System.out.println("ENTER ANY NUMBER ARE -->>");
       number=sc.nextInt();
       System.out.println("THE ENTERED NUMBER ARE -->>"+number);
       if(number%2==0){
        System.out.println("SO THE ENTERED NUMBER ARE EVEN SO THE ENTETED NUMBER ARE -->>"+number);
       }
       else{
        System.out.println("THE ENGTERED NUMBER ARE ODD SO THE ENTERED NUMBER ARE -->>"+number);
       }
}
}
