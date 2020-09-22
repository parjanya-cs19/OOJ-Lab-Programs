import java.util.Scanner;
public class PrintFloydsTriangle
{
   public static void main(String[] args)
   {
      int row, y, z, number = 1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows of floyd's triangle you want to print: ");
      row = sc.nextInt();
      System.out.println("Floyd's Triangle: ");
      for(y = 1; y <= row; y++)
      {
         for(z = 1; z <= y; z++)
         {
            System.out.print(number + " ");
            number++;
         }
         System.out.println();
      }
      sc.close();
   }
}
