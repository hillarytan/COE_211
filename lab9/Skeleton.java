import java.util.Scanner;
import java.text.DecimalFormat;

public class Skeleton {
	public static void main(String[] args) {
        	// Initialize array of integers
		int[] grades = new int[5];

		// for loop to get user input & store in array
		Scanner scan = new Scanner(System.in);
		
		for(int idx = 1; idx<6; idx++){
			System.out.println("Input the grade of assignment " + idx);
			grades[idx-1] = scan.nextInt();
		}

		System.out.println("Input the number of attended labs");
		int attended = scan.nextInt();
		System.out.println("Input the midterm grade");
		int midterm = scan.nextInt();

        	// for loop to iterate over the array & perform calculations
		double grade = 0.0;
		for(int idx = 0; idx<5; idx++){
			grade += grades[idx];
		}
		grade /= (double) grades.length;
		grade *= 0.3;

		int MAXATT = 7;
		double gradeAtt = (attended*5)/(double) MAXATT;

		double mid = midterm*0.3;
		
		
        	// display output to user
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("Assigment (30%): " + fmt.format(grade));
		System.out.println("Attendance (5%): " + fmt.format(gradeAtt));
		System.out.println("Midterm (30%): " + fmt.format(mid));
		
    }
}