package Library_management;
import java.util.*;
public class BooksAvailable extends Main{
    static void Bcategory(int n){
        Scanner sc=new Scanner(System.in);
        Signup sp=new Signup();
        if(n==1) {
            System.out.println("1. Fifty Shades of Grey series by E.L. James");
            System.out.println("2. The Thorn Birds by Colleen McCullough");
            System.out.println("3. Pride and Prejudice by Jane Austen");
            System.out.println("4. Gone with the Wind by Margaret Mitchell");
            System.out.println("5. Outlander by Diana Gabaldon");
            System.out.println("6. Love Story by Erich Segal");
            System.out.println("7. The Bridges of Madison County by Robert James Waller");
            System.out.println("8. The Notebook by Nicholas Sparks");
            System.out.println("9. The Time Traveler's Wife by Audrey Niffenegger");
            System.out.println("10. Jane Eyre by Charlotte Bronte");

        }
        if(n==2){
            System.out.println(" ");
            System.out.println("1.And Then There Were None by Agatha Christie");
            System.out.println("2.The Da Vinci Code by Dan Brown");
            System.out.println("3.Gone Girl by Gillian Flynn");
            System.out.println("4.The Girl with the Dragon Tattoo by Stieg Larsson");
            System.out.println("5.The Girl on the Train by Paula Hawkins");
            System.out.println("6.In Cold Blood by Truman Capote");
            System.out.println("7.The Silence of the Lambs by Thomas Harris");
            System.out.println("8.The No. 1 Ladies' Detective Agency by Alexander McCall Smith");
            System.out.println("9.Big Little Lies by Liane Moriarty");
            System.out.println("10.The Cuckoo's Calling by Robert Galbraith (pseudonym of J.K. Rowling)");

        }
        if(n==3){
            System.out.println(" ");
            System.out.println("1.The Hobbit by J.R.R. Tolkien");
            System.out.println("2.The Lord of the Rings by J.R.R. Tolkien");
            System.out.println("3.Harry Potter and the Philosopher's Stone (or Sorcerer's Stone in the US) by J.K. Rowling");
            System.out.println("4.Harry Potter and the Deathly Hallows by J.K. Rowling");
            System.out.println("5.Harry Potter and the Order of the Phoenix by J.K. Rowling");
            System.out.println("6.Harry Potter and the Half-Blood Prince by J.K. Rowling");
            System.out.println("7.Harry Potter and the Goblet of Fire by J.K. Rowling");
            System.out.println("8.Harry Potter and the Chamber of Secrets by J.K. Rowling");
            System.out.println("9.A Game of Thrones by George R.R. Martin");
            System.out.println("10.The Lion, the Witch and the Wardrobe by C.S. Lewis");
        }
        if(n==4){
            System.out.println(" ");
            System.out.println("1. A Short History of Nearly Everything by Bill Bryson");
            System.out.println("2. Guns, Germs, and Steel: The Fates of Human Societies by Jared Diamond");
            System.out.println("3. The Diary of a Young Girl by Anne Frank");
            System.out.println("4. Band of Brothers: E Company, 506th Regiment, 101st Airborne from Normandy to Hitler's Eagle's Nest by Stephen E. Ambrose");
            System.out.println("5. SPQR: A History of Ancient Rome by Mary Beard");
            System.out.println("6. Sapiens: A Brief History of Humankind by Yuval Noah Harari");
            System.out.println("7. 1491: New Revelations of the Americas Before Columbus by Charles C. Mann");
            System.out.println("8. The Rise and Fall of the Third Reich: A History of Nazi Germany by William L. Shirer");
            System.out.println("9. The Guns of August by Barbara W. Tuchman");
            System.out.println("10. The Devil in the White City: Murder, Magic, and Madness at the Fair That Changed America by Erik Larson");

        }
        if(n==5){
            System.out.println(" ");
            System.out.println("1.Atomic Habits by James Clear");
            System.out.println("2. The 7 Habits of Highly Effective People by Stephen R. Covey");
            System.out.println("3. Think and Grow Rich by Napoleon Hill");
            System.out.println("4. How to Win Friends and Influence People by Dale Carnegie");
            System.out.println("5. Awaken the Giant Within by Tony Robbins");
            System.out.println("6. The Power of Positive Thinking by Norman Vincent Peale");
            System.out.println("7. The Alchemist by Paulo Coelho");
            System.out.println("8. You Are a Badass by Jen Sincero");
            System.out.println("9. Daring Greatly by Brené Brown");
            System.out.println("10. The Four Agreements by Don Miguel Ruiz");
            System.out.println("11. Mindset: The New Psychology of Success by Carol S. Dweck");
        }
        System.out.println(" ");
        System.out.println("These are the books Available.......");
        System.out.println(" ");
        System.out.println("enter 0 to check other category (or) enter 1 to signup page");
        int last=sc.nextInt();

        if(last==0){
            System.out.println("enter that category number: ");
            int r=sc.nextInt();
            Bcategory(r);
        }
        if(last==1){
            System.out.println("**************************************SIGNUP PAGE*********************************");
            sp.Upsign();
        }



    }
}
