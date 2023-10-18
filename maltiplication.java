import java.util.Scanner;

public class maltiplication {
    public static void main(String[] args) {
        /*
         * 2*1=2
         * 2*2=4
         * 2*3=6
         * number*i=number*i
         */
        int number, i, p;  
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ARE -->");
        number = sc.nextInt();
        System.out.println("THE ENTETRED NUMBER ARE -->>" + number);
        for (i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }
    } 
}
