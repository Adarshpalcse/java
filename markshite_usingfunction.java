import java.util.Scanner;

public class markshite_usingfunction {
  public static void marks(double ds, double hindi, double coa, double math, double chem) {
    double t_marks;
    t_marks = (ds + math + coa + chem + hindi);
    double pr;
    pr = (t_marks) / 5.0;
    System.out.println("THE TOTAL MARKS AND PRECENTAGE ARE -->>" + t_marks + " " + pr);

    if (pr < 100.0 && pr > 90.0) {
      System.out.println("A GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else if (pr < 90.0 && pr > 80.0) {
      System.out.println("B GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else if (pr < 80.0 && pr > 70.0) {
      System.out.println("C GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else if (pr < 70.0 && pr > 60.0) {
      System.out.println("D GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else if (pr < 60.0 && pr > 50.0) {
      System.out.println("E GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else if (pr < 50.0 && pr > 40.0) {
      System.out.println("F GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr + "%");
    } else {
      System.out.println("FAIL::=" + t_marks + " " + pr);
    }
    return;
  }

  public static void main(String[] args) {
    double chem, hindi, math, coa, ds;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER MARKS MATH :");
    math = sc.nextDouble();
    System.out.println("THE ENTERED MARKS ARE MATH ==" + math);
    System.out.println("ENTER MARKS IN HINDI -->>");
    hindi = sc.nextDouble();
    System.out.println("THE ENTERED MARKS IN HINDI -->>" + hindi);
    System.out.println("ENTER MARKS IN DS -->>");
    ds = sc.nextDouble();
    System.out.println("THE ENTERED MARKS IN DS -->>" + ds);
    System.out.println("ENTER MARKS IN COA -->>");
    coa = sc.nextDouble();
    System.out.println("THE ENTERED MARKS IN COA -->>" + coa);
    System.out.println("ENTER MARKS IN CHEM");
    chem = sc.nextDouble();
    System.out.println("THE ENTERED MARKSK  IN CHEM -->>" + chem);

    marks(ds, hindi, coa, math, chem);

  }
}
