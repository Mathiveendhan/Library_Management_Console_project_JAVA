package Library_management;
import java.util.*;
public class Main {
    public static void main(String args[]){
        System.out.println("*********************************** WELCOME TO PUBLIC LIBRARY ********************************************");
        System.out.println("");
        System.out.println("**************************************ENTER YOUR CHOICE:*******************************************");
        System.out.println("1]LOGIN");
        System.out.print("");
        Scanner sc =new Scanner(System.in);
        int Login_choice=sc.nextInt();
        System.out.println("*".repeat(130));
        System.out.println("1]SIGN UP \t\t\t\t\t\t  2]SIGN IN");
        int lChoice=sc.nextInt();
        Signin in=new Signin();
        Signup up=new Signup();
        if(lChoice==1){
            up.Upsign();
        }
        else{
            in.insign();
        }
       System.out.println("*".repeat(120));
        System.out.println("***********************************BOOKS************************************************");
        System.out.println("1]Books Available");
        //BooksAvailable BA=new BooksAvailable();
        int booksAva=sc.nextInt();
        System.out.println("**************************BOOKS AVAILABLE***************************************");
        System.out.println("");
        System.out.println("1]BOOKS CATEGORY");
        books_category BookCat=new books_category();
        int var1=sc.nextInt();
        if(var1==1){
            BookCat.category();
        }
        BooksAvailable a2=new BooksAvailable();
        int BAva=sc.nextInt();
        a2.Bcategory(BAva);


    }
}
