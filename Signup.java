package Library_management;
import java.awt.*;
import java.util.*;
public class Signup extends Main {

    String name,dep;
    String Year;
    long rollno;

    static void Upsign(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your department:");
        String dep=sc.nextLine();
        System.out.print("Enter your Roll.no:");
        long rollno=sc.nextLong();
        System.out.print("Enter your year:");
        String Year=sc.next();

    }
}
