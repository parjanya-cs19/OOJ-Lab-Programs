import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter CIE marks out of 50:");
		double cie = scan.nextDouble();
		
		System.out.println("Enter SEE marks out of 100:");
		double see = scan.nextDouble();
		
		double percentage = cie + (see/2);

		if(percentage >= 90){
			System.out.println("Excellent: Grade S");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("Very Good: Grade A");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("Good: Grade B");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("Satisfactory: Grade C");
		}else if(percentage < 60 && percentage >= 50){
			System.out.println("Work Hard: Grade D");
		}else if(percentage < 50 && percentage >= 40){
			System.out.println("Just Passed: Grade E");
		}else {
			System.out.println("Failed!");
		}
	}

}
