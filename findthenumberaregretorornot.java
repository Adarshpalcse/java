import java.util.Scanner;

public class findthenumberaregretorornot {
   public static void main(String[] args) {
    int number ;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER ARE -->>");
    number=sc.nextInt();
    System.out.println("THE ENTERED NUMBER ARE -->>"+number);
    if(number>0){
        System.out.println("THE ENTERED NUMBER ARE garetor SO THE ENTERED NUMBER ARE -->>"+number);
    }
    else{
        System.out.println("THE ENTETRE NUMBER ARE NOT GARETOR SO THE ENTERED NUMBER ARE -->>"+number);
    }
   } 
}
