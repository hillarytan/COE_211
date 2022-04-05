import java.io.FileWriter;  // Import the FileWriter class
import java.io.File;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class ExpensesTracker{
	public static void main(String[] args) throws IOException{

		// Create FileWriter & Scanner objects & y/n string

		FileWriter fw = new FileWriter(new File("expenses.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);

		Scanner scan = new Scanner(System.in);

		String name, purchase, answer;
		double price;


		// Start gathering information inside the loop you will start
		do{
		
			System.out.println("Input your name: ");
			name = scan.nextLine();
			System.out.println("What did you purchase?");
			purchase = scan.nextLine();
			System.out.println("How much did you pay? (in USD)");
			price = scan.nextDouble();

			outToFile.println(name + " purchased " + purchase + " for " + price + " US Dollars.");
		
			System.out.println("Would you like to log another purchase? (y/n)");
			scan.nextLine();
			answer = scan.nextLine();

		} while(answer.equals("y"));
		


		// Close ClassWriter & Scanner objects
        	outToFile.close();
		

		//if the user inputs "n" + bonus
		Scanner fileScan;
		String file;
		if(answer.equals("n")){
			System.out.println("Get off of ZoodMall!");
			System.out.println("Would you like to read a summary of your purchases?");
			String y = scan.nextLine();
			if(y.equals("y")) {
				fileScan = new Scanner(new File("expenses.txt"));
				while(fileScan.hasNext()){
					file = fileScan.nextLine();
					System.out.println(file);
				}
			}
		}
		
		scan.close();
        
		// If you have already have a expenses.txt file, you need to delete it
		// before you compile your code again
	}
}