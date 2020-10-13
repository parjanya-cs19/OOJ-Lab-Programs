
import java.util.*;
import java.lang.*;
class Book
{
    String name;
    String auth;
    double pric;
    int pagn;
    public void getdetails()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Book Details");
        System.out.println("Enter Book Name:");
        name=x.next();
        System.out.println("Enter the Author");
        auth=x.next();
        System.out.println("Enter the Price of the book");
        pric=x.nextDouble();
        System.out.println("Enter the number of pages in the book");
        pagn=x.nextInt();
    }
    
    public String toString()
    {
        return("**BOOK DETAILS**"+"\nThe name of the book : "+name+"\nThe author of the book :"+auth+"\nThe price of the book: "+pric+"\nNumber of pages in book :"+pagn);
    }

}
class Main{
    public static void main(String args[])
    {
        int i,n;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number of books");
        n=x.nextInt();
        Book b[]=new Book[n];
        for (i=0;i<n;i++)
        {
            b[i]=new Book();
            b[i].getdetails();
    
        }
        for(i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
        

    }
}
