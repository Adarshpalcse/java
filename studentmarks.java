import java.util.Scanner;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class studentmarks {
    public static void main(String[] args) {
        double math, eng, coa, ds, dstl, t_marks, pr, cl;
        String name;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STUDENT NAME :");
        name = sc.nextLine();
        System.out.println("ENTER YOUR CLASSES ARE -->>");
        cl = sc.nextInt();
        System.out.println("ENTER YOUR SECTION -->>");
        String se = sc.nextLine();

        System.out.println("ENTER STUDENT YEAR -->>");
        year = sc.nextInt();
        System.out.println("ENTER MATHS MARKS ARE -->>");
        math = sc.nextDouble();
        // System.out.println("THE ENTERED MATHS MARKS ARE -->>>"+math);
        System.out.println("ENTER ENGLISH MARKS ARE -->> ");
        eng = sc.nextDouble();
        /// System.out.println("ENTERED ENGLISH MARKS ARE -->>"+eng);
        System.out.println("ENTER COA  MARKS ARE -->>");
        coa = sc.nextDouble();
        /// System.out.println("THE ENTETRED COA MARKS ARE -->>"+coa);
        System.out.println("ENTER YOUR DS MARKS -->>");
        ds = sc.nextDouble();
        // System.out.println("THE ENTERED DS MARKS ARE -->>"+ds);
        System.out.println("ENTER YOUR DSTL MARKS ARE -->>");
        dstl = sc.nextDouble();




        System.out.println("                          STUDENT NAME :" + name);
        System.out.println("                          CLASSES :" + cl);
        System.out.println("                          SECTION:" + se);
        System.out.println("                          YEAR:" + year);
        System.out.println("                          MATHS MARKS :" + math);
        System.out.println("                          ENGLISH MARKS :" + eng);
        System.out.println("                          COA MARKS:" +coa);
        System.out.println("                          DS MARKS :" + ds);
        System.out.println("                          DSTL MARKS :" + dstl);

        t_marks = (coa + ds + dstl + math + eng);
        System.out.println("TOTAL MARKS :" + t_marks);
        pr = ((t_marks) / 500) * 100;
        System.out.println(t_marks);
        if (pr < 100.0 && pr > 90.0) {
            System.out.println("A GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else if (pr < 90.0 && pr > 80.0) {
            System.out.println("B GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else if (pr < 80.0 && pr > 70.0) {
            System.out.println("C GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else if (pr < 70.0 && pr > 60.0) {
            System.out.println("D GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else if (pr < 60.0 && pr > 50.0) {
            System.out.println("E GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else if (pr < 50.0 && pr > 40.0) {
            System.out.println("F GARED AND YOUR MARKS ARE -->>" + t_marks + " " + pr+"%");
        } else {
            System.out.println("FAIL::=" + t_marks + " " + pr);
        }
    }
}
