package Library_management;
import java.util.*;
public class Signin extends Main{
    String name;
    long rollno;
    static void insign(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your Roll.no:");
        long rollno=sc.nextLong();

    }
}
