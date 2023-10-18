import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        /* canditional Statement */
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("ENTER AGE -->>");
        age=sc.nextInt();
        System.out.println("THE ENTERED AGE ARE -->>"+age);
        if(age>=18){
            System.out.println("ADDILAT ");
        }
        else{
            System.out.println("NOT ADDILAT ");
        }

    }
}
