import java.util.Scanner;

public class canditional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ram, atul, ramkumar, adarsh, name;
        System.out.println("ENTER ANY NAME ");
        name = sc.nextLine();
        System.out.println("NAME=" + name);
        if (name == "ram") {
            if (name == "ramkumar") {
                  if (name == "adarsh") {
                    System.out.println("ADARSH PAL ADARSH "+name);
                }
            }
        } else {
            System.out.println("SORRY "+name);
        }
    }
}