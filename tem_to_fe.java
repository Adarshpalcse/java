import java.util.Scanner;

public class tem_to_fe {
    public static void main(String[] args) {
        // cenvret to the f to c
        /*
         c=5/9 *(f-32); 
         */
       double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR TEMPRETUR -->>");
        f=sc.nextDouble();
        System.out.println("TAMPRTUR ARE ::"+f);
        c=5.0/9.0 *(f-32.0); 
        System.out.println(c);
    
    }
}

