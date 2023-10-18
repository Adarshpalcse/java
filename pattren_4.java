import java.util.Scanner;

public class pattren_4 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if(i==1 || i==5||j==1 || j==5 ){
                System.out.print("*");
            }else{
            System.out.println(" ");
            }
        }
        System.out.println();
    }
}
}