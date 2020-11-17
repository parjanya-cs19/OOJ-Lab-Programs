import CIE.*;
import SEE.*;
import java.util.Scanner;
public class main
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=s.nextInt();
		CIE.Student st[]=new CIE.Student[n];
		CIE.Aatmarks in[]=new CIE.Aatmarks[n];
		SEE.Semend e[]=new SEE.Semend[n];
		for(int i=0;i<n;i++)
		{
			st[i]=new CIE.Student();
			in[i]=new CIE.Aatmarks();
			e[i]=new SEE.Semend();
			st[i].display();
			in[i].display();
			e[i].display();
			System.out.println("Total marks of student "+st[i].name+" in 5 subjects are:");
			for(int j=0;j<5;j++)
			{
				System.out.println(in[i].ciem[j]+(e[i].seem[j]/2));
			}
				
		}
	}
}